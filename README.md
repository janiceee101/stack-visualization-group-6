# Stack Visualization

## Group 6

**Repository:** `stack-visualization-group-6`

## Group Members

1. Janice Pabular
2. Kristel Angel Protacio
3. Kayen Faith S. Antiporta
4. Kier Costumban
5. Samraida Mamarda

## 1. Project Description

Stack Visualization is a Java Swing application developed for our Data Structures and Algorithms (DSA) subject. It demonstrates how a stack data structure works through a graphical user interface (GUI).

The application uses rectangular blocks to represent stack elements, allowing users to observe how values are added and removed. It uses an array-based stack with a maximum capacity of 10 elements and follows the Last In, First Out (LIFO) principle.

Users can perform different stack operations through buttons and see how the stack changes after each operation. The application also displays status messages to provide feedback about successful operations and errors.

## 2. Project Objectives

The objectives of this project are:

* To implement a stack data structure using an array in Java.
* To demonstrate the Last In, First Out (LIFO) principle.
* To create a graphical user interface using Java Swing.
* To visually represent stack elements using rectangular blocks.
* To implement the basic stack operations correctly.
* To handle stack overflow, underflow, and invalid input.
* To update the visual representation when the stack changes.
* To help users understand how stack elements are added, accessed, and removed.

## 3. Features

* **Visual Stack Display** – Represents stack elements using rectangular blocks.
* **PUSH** – Adds a new element to the top of the stack if space is available.
* **POP** – Removes the top element from the stack.
* **PEEK** – Displays the top element without removing it.
* **CHECK STACK** – Checks whether the stack is empty and displays its current status, size, and top element when applicable.
* **CLEAR** – Removes all elements from the stack.
* **RANDOM** – Clears the current stack and generates 1 to 10 random integers ranging from 1 to 100.
* **Input Field** – Allows users to enter an integer for the PUSH operation.
* **Status Messages** – Displays feedback about operations, including success messages and errors.
* **Capacity Limit** – Restricts the stack to a maximum of 10 elements.
* **Overflow and Underflow Handling** – Prevents invalid operations on a full or empty stack.
* **Top Indicator** – Identifies the current top element in the visual display.
* **Dynamic Visualization** – Updates the visual stack display after stack operations.

## 4. Data Structure Used

The project uses an array-based stack implemented in Java.

An array stores the stack elements, while a variable named `top` tracks the index of the current top element.

Initially, `top` is set to `-1`, indicating that the stack is empty. When an element is added, the top index is updated to point to the newly added element.

The stack has a maximum capacity of 10 elements.

### Stack Principle: LIFO

LIFO stands for Last In, First Out. This means that the last element added to the stack is the first element removed.

For example, if the user pushes 10, 20, and 30 in that order, the stack will look like this:

```text
       TOP
     +------+
     |  30  |
     +------+
     |  20  |
     +------+
     |  10  |
     +------+
```

When the POP operation is performed, 30 is removed first because it is the top element. The next elements to be removed are 20 and then 10.

This demonstrates the LIFO principle.

## 5. Stack Operations

| Operation         | Description                                                                                          |
| ----------------- | ---------------------------------------------------------------------------------------------------- |
| `push(int value)` | Adds an element to the top of the stack if space is available. Returns `false` if the stack is full. |
| `pop()`           | Removes and returns the top element. Throws an exception if the stack is empty.                      |
| `peek()`          | Returns the top element without removing it. Throws an exception if the stack is empty.              |
| `isEmpty()`       | Checks whether the stack contains no elements.                                                       |
| `isFull()`        | Checks whether the stack has reached its maximum capacity.                                           |
| `size()`          | Returns the number of elements currently in the stack.                                               |
| `clear()`         | Removes all elements from the stack.                                                                 |
| `toArray()`       | Returns a copy of the stack elements for access or display.                                          |
| **CHECK STACK**   | Displays the current state of the stack.                                                             |
| **RANDOM**        | Clears the current stack and adds 1 to 10 random integers ranging from 1 to 100.                     |

## 6. Technologies Used

* **Java** – The programming language used to implement the application.
* **Java Swing** – The framework used to create the graphical user interface.
* **Array-Based Stack** – The data structure used to store and manage elements.
* **Java Development Kit (JDK)** – Required to compile and run the application.
* **JCreator** – The development environment used for writing and running the Java code.
* **Git and GitHub** – Used for version control and collaboration.

## 7. Program Requirements

The following are required to run the application:

* Java Development Kit (JDK 8 or later).
* JCreator or another compatible Java IDE.
* The `ArrayStack.java` and `StackGUI.java` source files.
* Basic knowledge of Java, arrays, methods, classes, and object-oriented programming.

The application uses standard Java and Swing libraries.

## 8. Project Files

The project repository is organized as follows:

```text
stack-visualization-group-6/
│
├── ArrayStack.java
├── StackGUI.java
├── README.md
├── TESTING.md
├── stack-class-diagram.png
│
└── screenshots/
    ├── push-operation.png
    ├── pop-operation.png
    ├── peek-operation.png
    ├── clear.png
    ├── random.png
    ├── overflow.png
    └── underflow.png
```

### File Descriptions

* **ArrayStack.java** – Contains the array-based stack implementation, including the stack capacity, elements, top index, and stack operations.
* **StackGUI.java** – Contains the graphical user interface, input field, operation buttons, status messages, and visual stack display.
* **README.md** – Contains the project description, objectives, features, setup instructions, and documentation.
* **TESTING.md** – Contains test cases for checking stack operations, boundary conditions, input validation, and error handling.
* **stack-class-diagram.png** – Shows the UML class diagram for the project.
* **screenshots/** – Contains screenshots demonstrating the application's interface, operations, and error handling.

Both Java files should be in the same directory and package when using the default package. If a package is declared in the source code, the files must follow the corresponding package structure.

## 9. How to Install and Run the Program

### Using JCreator

1. Install a compatible Java Development Kit (JDK).
2. Open JCreator.
3. Open the project or create a Java project.
4. Add `ArrayStack.java` and `StackGUI.java` to the project.
5. Make sure both files are in the correct directory and package.
6. Compile the Java files.
7. Run `StackGUI`, which contains the application's `main()` method.
8. Wait for the graphical user interface to appear.

### Using the Command Line

1. Open Command Prompt or a terminal.

2. Navigate to the folder containing the Java source files.

3. Compile the program:

   ```bash
   javac ArrayStack.java StackGUI.java
   ```

4. Run the application:

   ```bash
   java StackGUI
   ```

The Stack Visualization application should open if compilation is successful.

## 10. How to Use the Application

1. Launch the Stack Visualization application.
2. Enter an integer in the input field when using PUSH.
3. Click **PUSH** to add the value to the top of the stack.
4. Click **POP** to remove the top element.
5. Click **PEEK** to view the top element without removing it.
6. Click **CHECK STACK** to check the current state of the stack.
7. Click **CLEAR** to remove all elements.
8. Click **RANDOM** to clear the current stack and generate 1 to 10 random integers ranging from 1 to 100.
9. Observe the visual stack display and status messages after each operation.

## 11. How the Program Works

The program stores stack elements in an array. The `top` variable tracks the index of the most recently added element.

When PUSH is performed, the program checks whether the stack has reached its maximum capacity. If space is available, the new value is added to the top of the stack.

When POP is performed, the program checks whether the stack is empty. If it contains elements, the top element is removed and returned.

When PEEK is performed, the program retrieves the top element without removing it.

The `isEmpty()` operation checks whether the stack contains any elements, while `isFull()` checks whether the stack has reached its maximum capacity of 10 elements.

The `clear()` operation removes all elements from the stack and resets it to an empty state. The `size()` operation returns the current number of elements, while `toArray()` provides a copy of the stack elements for the GUI to display.

The GUI displays the stack contents and provides feedback through status messages. After stack operations, the visual representation is updated to reflect the current contents.

The application also handles invalid situations, such as attempting to push an element into a full stack, removing an element from an empty stack, or entering invalid input.

## Class Diagram

The project uses two main classes:

* **ArrayStack** – Stores and manages stack elements and provides the stack operations.
* **StackGUI** – Displays the stack and allows users to perform operations through the graphical interface.

`StackGUI` uses an `ArrayStack` object to perform stack operations and update the visual display.

![Stack Class Diagram](stack-class-diagram.png)

## 12. Screenshots

The screenshots below are stored in the `screenshots` folder and demonstrate the application's stack operations and error handling.

PUSH Operation
POP Operation
PEEK Operation
CLEAR Operation
RANDOM Operation
Stack Overflow
Stack Underflow

## 13. Testing and Expected Behavior

The `TESTING.md` file contains the detailed test cases used to check the application's stack operations, boundary conditions, input validation, and error handling.

The test cases cover the following scenarios:

* PUSH elements into an empty and non-empty stack.
* POP an element from a non-empty stack.
* Attempt POP and PEEK operations on an empty stack.
* Check the top element using PEEK without removing it.
* Attempt to PUSH an element when the stack is full.
* Clear the stack using the CLEAR operation.
* Generate random stack elements using RANDOM.
* Enter invalid input or leave the input field empty.
* Check whether the stack is empty.
* Perform multiple operations to verify that the stack behaves correctly.

The detailed test cases, expected outputs, and results are documented in `TESTING.md`. These tests help verify that the application follows the LIFO principle, handles boundary conditions, and updates the graphical display according to the stack's current state.

## 14. Analysis and Conclusion

The Stack Visualization project demonstrates how an array-based stack operates using the Last In, First Out (LIFO) principle. Through the graphical interface, users can observe how elements are added, accessed, and removed.

The maximum capacity of 10 elements demonstrates how stack overflow can be prevented, while checks for empty-stack operations help prevent invalid POP and PEEK operations.

The rectangular blocks make the stack easier to understand because users can see the top element and observe how the stack changes after each operation.

Overall, this project provides practical experience in implementing data structures, using arrays and methods, developing a Java Swing interface, handling errors, and testing program behavior.

## 15. Version Control and Collaboration

Git and GitHub are used to manage the source code and coordinate the contributions of group members.

The group can use separate branches for assigned tasks, commit changes, and submit pull requests for review before merging changes into the main branch.

This workflow helps organize development tasks, track changes, and reduce conflicts when multiple members work on the project.

## 16. AI Assistance Disclosure

AI tools were used as supplementary resources for understanding Java concepts, receiving coding guidance, preparing documentation, and troubleshooting programming-related questions.

### AI Tools Used

* **Claude (Anthropic)** – Used as a supplementary resource for programming-related guidance.
* **ChatGPT** – Used for explanations, coding guidance, documentation, and GitHub instructions.

### Tasks Assisted by AI

AI assistance covered topics such as:

* Understanding the activity requirements.
* Learning about array-based stack implementation and stack operations.
* Understanding the separation between stack logic and GUI logic.
* Getting guidance on error handling and input validation.
* Preparing project documentation and the README.
* Understanding Git branches, commits, and pull requests.

### Extent of AI Assistance

**Estimated AI-assisted portion: 48%.**

### Human Verification and Responsibility

The group is responsible for reviewing the code, understanding how the application works, and verifying that the submitted program meets the activity requirements. Compilation, execution, and testing should only be reported as completed after they have actually been performed.

### Changes to AI-Assisted Outputs

The group reviewed and organized the project documentation. Any reported code modifications, corrections, GUI improvements, or documentation revisions should accurately reflect the work completed by the members.

### What We Learned

Through this activity, we learned how a stack follows the LIFO principle, how stack operations work, and why separating the data structure implementation from the GUI is useful. We also learned about input validation, error handling, and collaboration through Git and GitHub.

AI served as a learning aid, but the group remains responsible for understanding, verifying, and explaining the final program.

## 17. Project Purpose

This project was developed as part of a Data Structures and Algorithms (DSA) group activity to demonstrate the implementation, visualization, and behavior of a stack data structure using Java.

It aims to make stack operations easier to understand through an interactive graphical interface while applying the concepts of arrays, LIFO, error handling, and Java Swing programming.

---

## Contributors

| Member                   | Contribution                                                                              |
| ------------------------ | ----------------------------------------------------------------------------------------- |
| Janice Pabular (Jas)     | Stack implementation (`ArrayStack.java`), GitHub repository setup, and UML class diagram. |
| Kristel Angel Protacio   | Task 1, GUI layout, and buttons (`StackGUI.java`).                                        |
| Kayen Faith S. Antiporta | Stack visualization using `StackGUI.java`.                                                |
| Kier Costumban           | Testing and documentation.                                                                |
| Samraida Mamarda         | Input validation using `StackGUI.java`.                                                   |
| All Group Members        | Participated in answering questions and discussing the project.                           |
