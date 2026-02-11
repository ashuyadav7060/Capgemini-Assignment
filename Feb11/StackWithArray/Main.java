package Feb11.StackWithArray;

class Stack<T> {

  private T[] arr;
  private int top;
  private int capacity;

  @SuppressWarnings("unchecked")
  Stack(int size) {
    capacity = size;
    arr = (T[]) new Object[capacity]; // Generic array creation workaround
    top = -1;
  }

  void push(T val) {
    if (top == capacity - 1) {
      throw new RuntimeException("Stack overflow");
    }
    arr[++top] = val;
    System.out.println(val + " pushed to stack");
  }

  T pop() {
    if (top == -1) {
      throw new RuntimeException("Stack underflow");
    }
    return arr[top--];
  }

  T peek() {
    if (top == -1) {
      throw new RuntimeException("Stack underflow");
    }
    return arr[top];
  }

  boolean isEmpty() {
    return top == -1;
  }

  void print() {
    for (int i = top; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

public class Main {
  public static void main(String[] args) {

    Stack<Integer> s = new Stack<>(5);

    s.push(10);
    s.push(20);
    s.push(30);

    System.out.println("Popped: " + s.pop());
    System.out.println("Top: " + s.peek());

    s.print();
  }
}
