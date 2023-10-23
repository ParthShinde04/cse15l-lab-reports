# Filesystem Basics with `cd`, `ls`, and `cat`

In today's lab, we explored three fundamental filesystem commands: `cd`, `ls`, and `cat`.

## 1. `cd` (Change Directory)

The `cd` command is used to navigate between directories.

### Example 1: Using `cd` with no arguments

``
$ cd
``

**Working Directory:** /Users/parthshinde (Home Directory)

**Output:** None (or it would have taken me to the home directory if I was in a different directory)

With no arguments, `cd` defaults to navigating you to your home directory.

### Example 2: Using `cd` with a path to a directory as an argument

``
$ cd Desktop
``

**Working Directory:** /Users/parthshinde (Home Directory)

**Output:** None, but your current directory changes to `/Users/parthshinde/Desktop`

This will take you to the specified directory. If the directory doesn't exist, you'll receive an error.

### Example 3: Using `cd` with a path to a file as an argument

``
$ cd /Users/parthshinde/Desktop/Fall_23_Schedule.png
``

**Working Directory:** /Users/parthshinde/Desktop

**Output:** Error: not a directory: Fall_23_Schedule.png

You can't `cd` into a file because it's not a directory. Thus, an error is produced.

## 2. `ls` (List)

The `ls` command displays the contents of a directory.

### Example 4: Using `ls` with no arguments

``
$ ls
Applications		Library			go
Desktop			Movies			node_modules
Developer		Music			package-lock.json
Documents		Pictures		package.json
Downloads		Postman
Google Drive		Public
``

**Working Directory:** /Users/parthshinde (Home Directory)

**Output:** All directories inside the Home Directory (Listed above).

When used without arguments, `ls` lists the contents of the current directory.

### Example 5: Using `ls` with a path to a directory as an argument

``
$ ls /Users/parthshinde/Desktop
2023-Fall-Ethics-Syllabus.pdf
Fall_23_Schedule.png
Resume.pdf
Resumes Normal
TCS
UCSD.pdf
``

**Working Directory:** /Users/parthshinde (Home Directory)

**Output:** The contents of `/Users/parthshinde/Desktop` (Listed above).

This displays the contents of the specified directory. If the directory doesn't exist, it'll produce an error.

### Example 6: Using `ls` with a path to a file as an argument

``
$ ls /Users/parthshinde/Desktop/Fall_23_Schedule.png
/Users/parthshinde/Desktop/Fall_23_Schedule.png
``

**Working Directory:** /Users/parthshinde (Home Directory)

**Output:** The specified file path (/Users/parthshinde/Desktop/Fall_23_Schedule.png in this case).

If a valid path to a file is provided, `ls` will display the file's name. If the file doesn't exist, it'll produce an error.

## 3. `cat` (Concatenate and Display)

The `cat` command is used to display the contents of a file.

### Example 7: Using `cat` with no arguments

``
$ cat
``

**Working Directory:** /Users/parthshinde (Home Directory)

**Output:** Error: cat: Users/parthshinde: Is a directory

Without arguments, `cat` expects input from the standard input. Otherwise, an error is produced.

### Example 8: Using `cat` with a path to a directory as an argument

``
$ cat /Users/parthshinde/Desktop
``

**Working Directory:** /Users/parthshinde (Home Directory)

**Output:** Error: cat: Desktop: Is a directory

You can't use `cat` on a directory. It's designed for files, so this command will produce an error.

### Example 9: Using `cat` with a path to a file as an argument

``
$ cat /Users/parthshinde/Desktop/hello_world.txt
Hello World!
This is a sample file made by me for this Lab Report.
``

**Working Directory:** /Users/parthshinde (Home Directory)

If a valid file path is provided, `cat` will display its content. If the file doesn't exist or isn't readable, it'll produce an error.

---
