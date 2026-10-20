/*Description: Array-based bounded stack (max 10 elements). Handles only the stack data and opearations. It has no GUI code.
  Programmed by: <Janice Pabular> <BSIT-48079> <Data Structures and Algorithm>
  Last Modified: October 19, 2026
  Version: 1.2
  Acknowledgements: Claude Sonnet 5.5 (Anthropic) was used to draft this code.
  Prompt: Guide and explain this file to me step by step on how to create or edit an ArrayStack.java based on our project's requirements.
*/

public class ArrayStack {
  
  public static final int CAPACITY = 10;

  private int[] data; // arrays that stores the elements
  private int top; // index of the top element, -1 when empty

  public ArrayStack() {
    data = new int[CAPACITY];
    top = -1;
  }

  // adds value on top, return false if the stack is full(overflow)
  public boolean push(int value) {
    if (isFull()) {
      return false;
    }
    top++;
    data[top] = value;
    return true;
  }

  // removes and returns the top element, throws if empty(underflow)
  public int pop() {
    if (isEmpty()) {
      throw new IllegalStateException("STACK UNDERFLOW: Cannot pop, stack is empty");
    }
    int value = data[top];
    top--;
    return value;
  }

  // returns the top element without removing it, throws if empty
  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("STACK EMPTY: Nothing to peek, stack is empty");
    }
    return data[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == CAPACITY - 1;
  }

  public int size() {
    return top + 1;
  }

  public void clear() {
    top = -1;
  }

  // returns a copy of the contents (bottom first) so the gui can draw
  // without touching the internal array
  public int[] toArray() {
    int[] copy = new int[size()];
    for (int i = 0; i < copy.length; i++) {
      copy[i] = data[i];
    }
    return copy;
  }
}
