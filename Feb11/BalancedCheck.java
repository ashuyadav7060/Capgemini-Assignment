package Feb11;

import java.util.Stack;
import java.util.Scanner;

public class BalancedCheck {

  static boolean isBalanced(String expr) {

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < expr.length(); i++) {
      char ch = expr.charAt(i);

      if (ch == '(') {
        stack.push(ch);
      }

      else if (ch == ')') {

        if (stack.isEmpty()) {
          return false;
        }

        stack.pop();
      }
    }

    return stack.isEmpty();
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter expression: ");
    String expr = sc.nextLine();

    if (isBalanced(expr)) {
      System.out.println("Balanced");
    } else {
      System.out.println("Not Balanced");
    }

    sc.close();
  }
}
