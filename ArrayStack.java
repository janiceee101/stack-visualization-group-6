/*Description: Array-based bounded stack (max 10 elements). Handles only the stack data and opearations. It has no GUI code.
  Programmed by: <Janice Pabular> <BSIT-48079> <Data Structures and Algorithm>
  Last Modified: October 19, 2026
  Version: 1.0
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
    if (top == CAPACITY - 1) {
      return false;
    }
    top++;
    data[top] = value;
    return true;
  }

  // removes and returns the top element, throws if empty(underflow)
  public int pop() {
    if (top == -1) {
      throw new IllegalStateException("STACK UNDERFLOW: Cannot pop, stack is empty");
    }
    int value = data[top];
    top--;
    return value;
  }
}
