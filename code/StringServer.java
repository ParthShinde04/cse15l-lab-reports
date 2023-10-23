import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

public class StringServer {

    private static final String RESPONSE_TEMPLATE = "%d. %s\n";
    private static final AtomicInteger messageCount = new AtomicInteger(0);
    private static final StringBuilder messages = new StringBuilder();

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/add-message", new AddMessageHandler());

        server.start();
        System.out.println("Server started on port 8000");
    }

    static class AddMessageHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String queryParams = exchange.getRequestURI().getQuery();
            String message = null;

            if (queryParams != null) {
                for (String param : queryParams.split("&")) {
                    String[] pair = param.split("=");
                    if (pair.length == 2 && pair[0].equals("s")) {
                        message = pair[1].replaceAll("\\+", " ");
                    }
                }
            }

            if (message == null) {
                String response = "Bad Request: missing 's' query parameter";
                exchange.sendResponseHeaders(400, response.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
                return;
            }

            synchronized (messages) {
                messages.append(String.format(RESPONSE_TEMPLATE, messageCount.incrementAndGet(), message));
            }

            byte[] response = messages.toString().getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, response.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response);
            }
        }
    }
}
