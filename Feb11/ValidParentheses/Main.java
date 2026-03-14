package Feb11.ValidParentheses;

import java.util.Stack;

public class Main {

  static boolean isBalanced(String expr) {

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < expr.length(); i++) {
      char ch = expr.charAt(i);

      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      }

      else if (ch == ')' || ch == '}' || ch == ']') {

        if (stack.isEmpty()) {
          return false;
        }

        char top = stack.pop();

        if (!isMatchingPair(top, ch)) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  static boolean isMatchingPair(char open, char close) {
    if (open == '(' && close == ')')
      return true;
    if (open == '{' && close == '}')
      return true;
    if (open == '[' && close == ']')
      return true;
    return false;
  }

  public static void main(String[] args) {

    String expr = "{[()]}";

    if (isBalanced(expr)) {
      System.out.println("Balanced Expression");
    } else {
      System.out.println("Not Balanced Expression");
    }
  }
}
