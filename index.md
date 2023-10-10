# Filesystem Basics with `cd`, `ls`, and `cat`

In today's lab, we explored three fundamental filesystem commands: `cd`, `ls`, and `cat`.

## 1. `cd` (Change Directory)

The `cd` command is used to navigate between directories.

### Example 1: Using `cd` with no arguments

\```
$ cd
\```

**Working Directory:** Anywhere

**Output:** None (or it takes you to the home directory)

With no arguments, `cd` defaults to navigating you to your home directory.

### Example 2: Using `cd` with a path to a directory as an argument

\```
$ cd /path/to/directory
\```

**Working Directory:** Anywhere

**Output:** None, but your current directory changes to `/path/to/directory`

This will take you to the specified directory. If the directory doesn't exist, you'll receive an error.

### Example 3: Using `cd` with a path to a file as an argument

\```
$ cd /path/to/file.txt
\```

**Working Directory:** Anywhere

**Output:** Error

You can't `cd` into a file because it's not a directory. Thus, an error is produced.

## 2. `ls` (List)

The `ls` command displays the contents of a directory.

### Example 4: Using `ls` with no arguments

\```
$ ls
file1.txt  directory1  file2.txt
\```

**Working Directory:** Any directory containing `file1.txt`, `directory1`, and `file2.txt`

When used without arguments, `ls` lists the contents of the current directory.

### Example 5: Using `ls` with a path to a directory as an argument

\```
$ ls /path/to/directory
fileA.txt  directoryA
\```

**Working Directory:** Anywhere

**Output:** The contents of `/path/to/directory`

This displays the contents of the specified directory. If the directory doesn't exist, it'll produce an error.

### Example 6: Using `ls` with a path to a file as an argument

\```
$ ls /path/to/file.txt
/path/to/file.txt
\```

**Working Directory:** Anywhere

**Output:** The specified file path

If a valid path to a file is provided, `ls` will display the file's name. If the file doesn't exist, it'll produce an error.

## 3. `cat` (Concatenate and Display)

The `cat` command is used to display the contents of a file.

### Example 7: Using `cat` with no arguments

\```
$ cat
\```

**Working Directory:** Anywhere

**Output:** Error (unless input is provided via stdin)

Without arguments, `cat` expects input from the standard input.

### Example 8: Using `cat` with a path to a directory as an argument

\```
$ cat /path/to/directory
\```

**Working Directory:** Anywhere

**Output:** Error

You can't use `cat` on a directory. It's designed for files, so this command will produce an error.

### Example 9: Using `cat` with a path to a file as an argument

\```
$ cat /path/to/file.txt
This is the content of file.txt
\```

**Working Directory:** Anywhere

If a valid file path is provided, `cat` will display its content. If the file doesn't exist or isn't readable, it'll produce an error.

---
