package Feb11;

class Node<T> {
  T data;
  Node<T> next;

  Node(T data) {
    this.data = data;
    this.next = null;
  }
}

class Stack<T> {
  Node<T> top;

  void push(T val) {
    Node<T> newNode = new Node<T>(val);
    newNode.next = top;
    top = newNode;
    System.out.println(val + " pushed to stack");
  }

  T pop() {
    if (top == null) {
      throw new RuntimeException("Stack underflow");
    }
    T popped = top.data;
    top = top.next;
    return popped;
  }

  T peek() {
    if (top == null) {
      System.out.println("stack underflow");
    }
    return top.data;
  }

  boolean isEmpty() {
    if (top == null) {
      return true;
    }
    return false;
  }

  void print() {
    Node<T> temp = top;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}

class StackImplement {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);
    s.pop();
    s.push(40);

    // System.out.println(s.pop());
    System.out.println(s.peek());
    // boolean flag = s.isEmpty();
    // if (flag) {
    // System.out.println("yes stack is empty");
    // } else {
    // System.out.println("stack is not empty");
    // }
    s.print();

  }
}
