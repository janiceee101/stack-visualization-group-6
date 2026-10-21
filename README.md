# Stack Virtualization

# Group 6
# Group Members
1. Janice Pabular
2. Kristel Angel Protacio
3. Kayen Faith S. Antiporta
4. Kier Costumban
5. Samraida Mamarda

1. Project Description

Stack Visualization is a Java Swing application developed for our Data Structures and Algorithms (DSA) subject. It demonstrates how a stack data structure works through a graphical user interface (GUI).

The application uses rectangular blocks to represent stack elements, allowing users to observe how values are added and removed. It uses an array-based stack with a maximum capacity of 10 elements and follows the Last In, First Out (LIFO) principle.

Users can perform different stack operations through buttons and see how the stack changes after each operation. The application also displays status messages to provide feedback about successful operations and errors.

2. Project Objectives

The objectives of this project are:

- To implement a stack data structure using an array in Java.
- To demonstrate the Last In, First Out (LIFO) principle.
- To create a graphical user interface using Java Swing.
- To visually represent stack elements using rectangular blocks.
- To implement the basic stack operations correctly.
- To handle stack overflow, underflow, and invalid input.
- To update the visual representation when the stack changes.
- To help users understand how stack elements are added, accessed, and removed.

3. Features

- Visual Stack Display – Represents stack elements using rectangular blocks.
- PUSH – Adds a new element to the top of the stack if space is available.
- POP – Removes the top element from the stack.
- PEEK – Displays the top element without removing it.
- CHECK STACK – Checks whether the stack is empty and displays its current status.
- CLEAR – Removes all elements from the stack.
- RANDOM – Generates a random value and adds it to the stack if space is available.
- Input Field – Allows users to enter a value for the PUSH operation.
- Status Messages – Displays feedback about operations, including success messages and errors.
- Capacity Limit – Restricts the stack to a maximum of 10 elements.
- Overflow and Underflow Handling – Prevents invalid operations on a full or empty stack.
- Dynamic Visualization – Updates the visual stack display after operations that change its contents.

4. Data Structure Used

The project uses an array-based stack implemented in Java.

An array stores the stack elements, while a variable named "top" tracks the index of the current top element.

Initially, "top" is set to "-1", indicating that the stack is empty. When an element is added, the top index is updated to point to the newly added element.

The stack has a maximum capacity of 10 elements.

Stack Principle: LIFO

LIFO stands for Last In, First Out. This means that the last element added to the stack is the first element removed.

For example, if the user pushes 10, 20, and 30 in that order, the stack will look like this:

       TOP
     +------+
     |  30  |
     +------+
     |  20  |
     +------+
     |  10  |
     +------+

When the POP operation is performed, 30 is removed first because it is the top element. The next elements to be removed are 20 and then 10.

This demonstrates the LIFO principle.

5. Stack Operations

Operation| Description
PUSH| Adds an element to the top of the stack if space is available.
POP| Removes and returns the top element if the stack is not empty.
PEEK| Returns the top element without removing it.
isEmpty| Checks whether the stack contains no elements.
isFull| Checks whether the stack has reached its maximum capacity.
size| Returns the number of elements currently in the stack.
clear| Removes all elements from the stack.
toArray| Returns the stack elements as an array for access or display.
CHECK STACK| Displays the current state of the stack.
RANDOM| Generates a random value and adds it to the stack if space is available.

6. Technologies Used

- Java – The programming language used to implement the application.
- Java Swing – The framework used to create the graphical user interface.
- Array-Based Stack – The data structure used to store and manage elements.
- Java Development Kit (JDK) – Required to compile and run the application.
- JCreator – The development environment used for writing and running the Java code.
- Git and GitHub – Used for version control and collaboration.

7. Program Requirements

The following are required to run the application:

- Java Development Kit (JDK 8 or later).
- JCreator or another compatible Java IDE.
- The "ArrayStack.java" and "StackGUI.java" source files.
- Basic knowledge of Java, arrays, methods, classes, and object-oriented programming.

The application uses standard Java and Swing libraries.

8. Project Files

stack-visualization-group-6/
│
├── ArrayStack.java
├── StackGUI.java
└── README.md

File Descriptions

- ArrayStack.java – Contains the array-based stack implementation, including the stack capacity, elements, top index, and stack operations.
- StackGUI.java – Contains the graphical user interface, input field, operation buttons, status messages, and visual stack display.
- README.md – Contains the project description, objectives, features, setup instructions, and testing information.

Both Java files should be in the same directory and package when using the default package. If a package is declared in the source code, the files must follow the corresponding package structure.

9. How to Install and Run the Program

Using JCreator

1. Install a compatible Java Development Kit (JDK).
2. Open JCreator.
3. Open the project or create a Java project.
4. Add "ArrayStack.java" and "StackGUI.java" to the project.
5. Make sure both files are in the correct directory and package.
6. Compile the Java files.
7. Run "StackGUI", which contains the application's "main()" method.
8. Wait for the graphical user interface to appear.

Using the Command Line

1. Open Command Prompt or a terminal.

2. Navigate to the folder containing the Java source files.

3. Compile the program:
   
   javac ArrayStack.java StackGUI.java

4. Run the application:
   
   java StackGUI

The Stack Visualization application should open if compilation is successful.

10. How to Use the Application

1. Launch the Stack Visualization application.
2. Enter an integer in the input field when using PUSH.
3. Click PUSH to add the value to the top of the stack.
4. Click POP to remove the top element.
5. Click PEEK to view the top element without removing it.
6. Click CHECK STACK to check the current state of the stack.
7. Click CLEAR to remove all elements.
8. Click RANDOM to generate and add a random value if space is available.
9. Observe the visual stack display and status messages after each operation.

11. How the Program Works

The program stores stack elements in an array. The "top" variable tracks the index of the most recently added element.

When PUSH is performed, the program checks whether the stack has reached its maximum capacity. If space is available, the new value is added to the top of the stack.

When POP is performed, the program checks whether the stack is empty. If it contains elements, the top element is removed and returned.

When PEEK is performed, the program retrieves the top element without removing it.

The "isEmpty()" operation checks whether the stack contains any elements, while "isFull()" checks whether the stack has reached its maximum capacity of 10 elements.

The "clear()" operation removes all elements from the stack and resets it to an empty state. The "size()" operation returns the current number of elements, while "toArray()" provides the stack elements in array form.

The GUI displays the stack contents and provides feedback through status messages. When an operation changes the stack, the visual representation is updated to reflect the current contents.

The application also handles invalid situations, such as attempting to push an element into a full stack or remove an element from an empty stack.

12. Screenshots

Main Interface

"Stack Visualization Main Interface" (screenshots/main-interface.png)

PUSH Operation

"Stack Visualization PUSH Operation" (screenshots/push-operation.png)

POP Operation

"Stack Visualization POP Operation" (screenshots/pop-operation.png)

PEEK Operation

"Stack Visualization PEEK Operation" (screenshots/peek-operation.png)

CLEAR Operation

"Stack Visualization CLEAR Operation" (screenshots/clear-operation.png)

Error Handling

"Stack Visualization Error Handling" (screenshots/error-handling.png)

13. Testing and Expected Behavior

The following test cases can be used to verify the application's behavior.

Test Case| Expected Result
PUSH an element into an empty stack| The element is added and displayed.
PUSH several elements| The newest element appears at the top.
POP from a non-empty stack| The top element is removed.
PEEK a non-empty stack| The top element is displayed without removal.
POP from an empty stack| An appropriate error or status message is displayed.
PEEK an empty stack| An appropriate error or status message is displayed.
PUSH when the stack is full| The application prevents adding another element and displays a message.
CHECK STACK when empty| The application reports that the stack is empty.
CHECK STACK when not empty| The application reports that the stack contains elements.
CLEAR a non-empty stack| All elements are removed.
PUSH after CLEAR| The stack accepts new elements again.
RANDOM when space is available| A random value is generated and added to the stack.
RANDOM when the stack is full| The application prevents adding another element.
Enter invalid input| The application handles the input appropriately without crashing.
Perform multiple operations| The visual display remains consistent with the stack contents.

14. Analysis and Conclusion

The Stack Visualization project demonstrates how an array-based stack operates using the Last In, First Out (LIFO) principle. Through the graphical interface, users can observe how elements are added, accessed, and removed.

The maximum capacity of 10 elements demonstrates how stack overflow can be prevented, while checks for empty-stack operations help prevent invalid POP and PEEK operations.

The rectangular blocks make the stack easier to understand because users can see the top element and observe how the stack changes after each operation.

Overall, this project provides practical experience in implementing data structures, using arrays and methods, developing a Java Swing interface, handling errors, and testing program behavior.

15. Version Control and Collaboration

Git and GitHub are used to manage the source code and coordinate the contributions of group members.

The group can use separate branches for assigned tasks, commit changes, and submit pull requests for review before merging changes into the main branch.

This workflow helps organize development tasks, track changes, and reduce conflicts when multiple members work on the project.

16. AI Assistance Disclosure

AI tools may be used as supplementary resources for understanding Java concepts, reviewing code, improving documentation, and troubleshooting programming errors.

The group is responsible for reviewing, understanding, and testing the code to ensure that the final application meets the project requirements.

17. Project Purpose

This project was developed as part of a Data Structures and Algorithms (DSA) group activity to demonstrate the implementation, visualization, and behavior of a stack data structure using Java.

It aims to make stack operations easier to understand through an interactive graphical interface while applying the concepts of arrays, LIFO, error handling, and Java Swing programming.


Course: Data Structures and Algorithms (DSA)
Project Title: Stack Visualization
Group Name: Stack Visualization Group 6
Programming Language: Java
GUI Framework: Java Swing
Data Structure: Array-Based Stack
Maximum Stack Capacity: 10 elements


