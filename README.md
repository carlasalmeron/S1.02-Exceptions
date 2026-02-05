# S1.02 – Java Exceptions

## 🎯Objetives
Practice Java error handling using **exceptions** to make applications more robust against common errors like invalid input or accessing nonexistent data.

## 📌Level 1
### ✅Exercise 1 – Custom Exceptions

- **Product class**: `name` and `price` attributes.
- **Sale class**: contains a list of products and a `totalPrice`.
- **calculateTotal()**: sums product prices; if the list is empty, throws `EmptySaleException` with the message `"To make a sale, you must first add products"`.
- Test `IndexOutOfBoundsException` by accessing an invalid list position.
- Optionally, make `EmptySaleException` extend `RuntimeException` (unchecked).

## 📌Level 2 

### ✅Exercise 1 – Safe Console Input

Create a utility class `ConsoleReader` to read input safely:

- Use one `Scanner` object.
- Static methods for reading:
    - Numbers (`byte`, `int`, `float`, `double`) → handle `InputMismatchException`
    - Characters (`char`) → throw custom exception if input >1 character
    - Strings (`String`) → optional validation
    - Yes/No (`boolean`) → accepts `"s"`/`"n"`, else throws custom exception

## 🛠Technology

- Java 21+
- IntelliJ IDEA
- Git & GitHub
- Command Line Execution (Git Bash / Terminal)

## 🚀 Installation and Execution

### 📂Clone Repository
`git clone https://github.com/carlasalmeron/S1.02-Exceptions.git`

### ▶️ Project Execution

Project developed in Java to practice the use of exceptions and secure data reading via console.

To execute it:
- Use Java JDK 8 or higher.
- Compile the `.java` files.
- Execute the Main class.

The application tests:
- Custom exceptions (EmptySaleException).
- Error handling such as IndexOutOfBoundsException.
- User input validation from the console using ConsoleReader.