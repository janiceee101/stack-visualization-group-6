# Stack Virtualization
# Group 6
# Group Members
1. Janice Pabular
2. Kristel Angel Protacio
3. Kayen Faith S. Antiporta
4. Kier Costumban
5. Samraida Mamarda

# Description of the Program
A Java Swing application that shows a stack as a 2D drawing. Each element is a rectangular block, and the newest element is at the top. The stack is array-based and bounded, with a maximum capacity of 10 elements. The stack logic (ArrayStack) and the graphical interface (StackGUI) are separate components. The GUI only calls the stack's methods, and it redraws the blocks after every operation so the picture always matches the real state of the stack.

# Features
- PUSH: adds the typed integer to the top of the stack
- POP: removes only the top element
- PEEK: highlights the top element without removing it
- CLEAR: empties the stack
- CHECK STACK: reports whether the stack is empty or not, with its size and top element
- RANDOM: clears the stack, then pushes 1 to 10 random integers from 1 to 100
- "Top ->" label that marks the current top element
- Status messages for:
  - STACK OVERFLOW: Cannot push, stack is full
  - STACK UNDERFLOW: Cannot pop, stack is empty
  - STACK EMPTY: Nothing to peek, stack is empty
  - Empty or non-numeric input

# Requirements
- Java Development Kit (JDK) 8 or later
- Any Java IDE or text editor (we used JCreator)
- No external libraries. The program uses only javax.swing, java.awt, java.awt.event and java.util.Random.

# How to Run the Program
*Using JCreator*
1. Create a new Empty Project and add ArrayStack.java and StackGUI.java.
2. Open StackGUI.java.
3. Choose Build, then Compile Project.
4. Choose Build, then Execute Project.

*Using the command line*
javac ArrayStack.java StackGUI.java
java StackGUI

# Project Structure
stack-visualization-group-[PALITAN]/
├── ArrayStack.java              (stack component: data and operations)
├── StackGUI.java                (GUI component: input, buttons, drawing)
├── README.md
├── stack-class-diagram.drawio   (UML class diagram)
└── screenshots/                 (program screenshots)

# Stack Implementation
The stack is implemented in our own class, ArrayStack, using a fixed array.

- data is an int[] array of size CAPACITY (10).
- top is the index of the top element. It is -1 when the stack is empty.
- Both data and top are private, so the GUI cannot change them directly.

| Method | What it does |
|---|---|
| push(int value) | Adds the value at top + 1. Returns false if the stack is full (overflow). |
| pop() | Removes and returns the element at top. Throws an error if the stack is empty (underflow). |
| peek() | Returns the element at top without removing it. Throws an error if the stack is empty. |
| isEmpty() | Returns true when top == -1. |
| isFull() | Returns true when top == CAPACITY - 1. |
| size() | Returns top + 1. |
| clear() | Sets top to -1. |
| toArray() | Returns a copy of the elements so the GUI can draw them without touching the internal array. |

LIFO behavior: the last element pushed is always at top, so it is the first one removed by pop().

# Screenshots
![Push](screenshots/push.png)
![Pop](screenshots/pop.png)
![Peek](screenshots/peek.png)
![Random](screenshots/random.png)
![Stack overflow](screenshots/overflow.png)
![Stack underflow](screenshots/underflow.png)

Stack Visualization is a Java-based application that demonstrates how a stack data structure works using a graphical user interface   



