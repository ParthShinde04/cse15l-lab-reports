# 1. `cd` Command 

**No arguments:** When you use `cd` with no arguments, it changes the directory to the user's home directory.

![Cd No argument](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-1/images/Lab-Report-1-Image-1.png)

**Absolute path before command:** `/Users/parthshinde/Developer`

**Explanation:** This command moves the working directory to the user's home directory. There's no error in this case.

---

**Directory arguments:** There's a directory named `Developer` in `/Users/parthshinde/`

![Cd Dir argument](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-1/images/Lab-Report-1-Image-2.png)

**Absolute path before command:** `/Users/parthshinde/`

**Explanation:** This command changes the directory to `/Users/parthshinde/Developer`. If it exists, there's no error; otherwise, an error will indicate that the directory does not exist.

---

**File as an argument:** If you try to `cd` into a file, it will result in an error.

![Cd File argument](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-1/images/Lab-Report-1-Image-3.png)

**Absolute path before command:** `/Users/parthshinde/`

**Explanation:** Since `cd` is used to change directories and not to open files, using it with a file path will result in an error.

# 2. `ls` Command 

**No arguments:** Lists files and directories in the current working directory.

![Ls No argument](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-1/images/Lab-Report-1-Image-4.png)

**Absolute path before command:** `/Users/parthshinde/`

**Explanation:** This command lists all files and directories in `/Users/parthshinde/`. It's not an error.

---

**Directory arguments:** Lists files and directories in the specified directory.

![LS Dir argument](https://parthshinde04.github.io/cse15l-lab-reports/lab-report-1/images/Lab-Report-1-Image-5.png)

**Absolute path before command:** `/Users/parthshinde/`

**Explanation:** This command lists the contents of `/Users/parthshinde/Developer`. If the directory exists, there's no error; otherwise, an error message will show.