# Part 1: Bugs



# Part 2: Researching Commands
### 1. Case-Insensitive Search (-i)
The `-i` option allows `grep` to perform case-insensitive searches, which is helpful 
when the casing of the text isn't consistent or known.

**Example 1**
```
grep -i "hello" technical/911report/chapter-1.txt

Output:
At 10:39, the Vice President updated the Secretary on the air threat conference: \n
Vice President: There's been at least three instances here where we've had reports \n
of aircraft approaching Washington-a couple were confirmed hijack. And, pursuant to \n
the President's instructions I gave authorization for them to be taken out. Hello?
```

This command searches for the word "hello" in `technical/911report/chapter-1.txt`, ignoring case differences
like "Hello", "HELLO", or "hello".