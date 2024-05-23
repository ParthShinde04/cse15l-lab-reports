### Step 4

Screenshot  
![Step 4 Image](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-4/images/Image-1.png)

Keys Pressed: `ssh<space>your_username@ieng6.ucsd.edu<enter>`

Summary: This command logs you into the ieng6 server.

---

### Step 5

Screenshot  
![Step 5 Image](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-4/images/Image-2.png)

Keys Pressed: `git<space>clone<space>git@github.com:ParthShinde04/lab7.git<enter>cd<space>lab7<enter>`

Summary: These commands clone your forked repository from Github using the SSH 
URL and change the directory to the cloned repository.

---

### Step 6

Screenshot  
![Step 6 Image](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-4/images/Image-3.png)

Keys pressed: `bash<space>test.sh<enter>`

Summary: This command runs the bash file that compiles the test files with the 
necessary classpath and then runs the JUnit tests, showing that they fail.

---

### Step 7

Screenshot  
![Step 7 Image](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-4/images/Image-4.png)

Keys Pressed:
```
vim<space>ListExamples.java<enter>
/merge<enter>
<down><down><down><down><down>
i<backspace><backspace><backspace><backspace>index2<space>+=<space>1;<esc>
:wq<enter>
```

Summary: These commands open the `ListExamples.java` file in vim, search for the `merge` method, navigate to the incorrect line, fix the error by changing `index1` to `index2`, and then save and exit vim.

---

### Step 8

Screenshot  
![Step 8 Image](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-4/images/Image-5.png)

Keys Pressed: `<up><up><enter>`

Summary: These arrow keys go back in history and run `bash test.sh` command again.

---

### Step 9

Screenshot  
![Step 9 Image](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-4/images/Image-6.png)

Keys Pressed:
```
git<space>add<space>.<enter>
git<space>commit<space>-m<space>"All<space>tests<space>passed"<enter>
git<space>push<enter>
```

Summary: These commands add the modified ListExamples.java file to the staging area, 
commit the changes with a message, and push the changes to your Github repository.