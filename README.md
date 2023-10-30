# Fall 2023 Fundamentals of Computing I — Assignment 3

* **Read these instructions repeatedly until you understand, then begin your project. If something is not clear, ask.**

## ❖ Before You Begin ❖

1. Log in to GitHub.
2. Fork this repo(sitory). See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/) on how to carry out this step and step `3`.
3. Clone your fork, using either the web site or the GitHub Desktop client.
4. Checkout your personalized branch, the one with your name and GitHub handle.

---

## ❖ Introduction ❖

Write a program that does the following:

1. Requests from the user a positive number representing the size of a matrix
2. Prints a matrix consisting of `0`s
3. Populates the matrix with values from `1–(input × input)`
4. Prints the matrix with the newly-populated values
5. Swaps the contents of the matrix on one side of the diagonal formed from top right to bottom left with the other side, highlighting the elements along the diagonal and leaving them untouched/unswapped
6. Prints the flipped matrix

As mentioned in item 5, the elements in the diagonal **must not be touched**, while the other elements in the matrix **must be swapped**. The numbers in every cell of the matrix is arbitrary; each cell could have contained a letter, string, image, or other object/primitive. Numbers are being used in this assignment because they produce a sequence that is easy to follow when working with the matrix. **A movie of how this assignment should behave in its resolved state is available [here](http://vanegas.cs.hartford.edu/uploads/videos/matrix-flip-along-diagonal--java.mp4).**

---

## ❖ File List ❖

This repo contains the following files, all required to carry out this assignment. Before you start working, ensure you understand the role of each file below.

1. `Makefile` — Run `make` in your command line interface, or CLI, from this repo’s root folder to build your assignment. As you test input, run `make run` to _only_ run a previously-compiled Java program, not compile it. Run `make clean` to remove the class file.
2. `.editorconfig` — Everything in this file is a redundancy of what’s already in the `.editorconfig` file you installed in your home folder. It’s here to make sure you’re working with the formatting rules defined in `.editorconfig`, as this is part of your grade. **Ensure EditorConfig is working in VS Code, _before_ beginning this assignment.**
3. `.gitignore` — **Do not modify this file.**
4. `Matrix.java` — Where the entire `Matrix` class and its methods will be defined.
5. `RunMatrix.java` — Method `main` goes in this file, along withe the instantiation of the `Matrix` object and all the required behavior.

**All your code may only be written in the `.java` files of this project’s scaffold.**

---

## ❖ Rules ❖

1. Your `Matrix` class should contain a single field called `matrix` of the primitive type required to create a matrix.
2. The `Matrix` constructor should accept an integer value as an argument named `size`, then create a `matrix` field whose width and height are equivalent to the integer passed to it. The constructor should also report to the user the dimensions of the matrix.
3. As part of the `Matrix` class, write a `private` method called `swap` that will accept four arguments: `x1`, `y1`, `x2`, and `y2`, each representing the indices of the two elements in the matrix that should be swapped.
4. Write a `public` method called `printMatrix` that accepts no arguments and returns nothing. It should print the matrix, highlighting in yellow the diagonal from top right to bottom left.
5. Write a `public` method called `populateMatrix` that accepts no arguments and returns nothing. It should simply populate the matrix with values from `1–(size × size)`.
6. Write a `public` method called `flipMatrix` that accepts no arguments and returns nothing. It should “flip” the matrix’s values along the diagonal from top right to bottom left. The elements that comprise the diagonal should be highlight and not swapped.

---

## ❖ Grading ❖

| Item                                                                        | Points  |
|-----------------------------------------------------------------------------|:-------:|
| Program works according to instructions                                     | `20`    |
| Code avoids being clever in favor of readability                            | `20`    |
| Code is neat and professional                                               | `20`    |
| Variable naming is logical                                                  | `20`    |
| Comments are used thoughtfully in places where code is not self documenting | `20`    |

---

## ❖ Due ❖

Wednesday, 15 November 2023, at 5:00 PM.

---

## ❖ Submission ❖

You will need to issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may _only_ be submitted via GitHub. **No other form of submission will be accepted**.
