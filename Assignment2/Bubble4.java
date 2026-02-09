package Assignment2;

import java.util.*;

class NewStudents {
  String name;
  int roll;
  int[] marks;

  NewStudents(String name, int roll, int[] marks) {
    this.name = name;
    this.roll = roll;
    this.marks = marks;

  }
}

public class Bubble4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    NewStudents[] arr = new NewStudents[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter you name: ");
      String name = sc.nextLine();
      System.out.println("enter you roll: ");
      int roll = sc.nextInt();
      System.out.println("enter number of subjects: ");
      int m = sc.nextInt();
      int[] marks = new int[m];
      System.out.println("Enter your marks: ");
      for (int j = 0; j < m; j++) {
        marks[j] = sc.nextInt();
      }
      arr[i] = new NewStudents(name, roll, marks);
      sc.nextLine();
    }
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        int min = Math.min(arr[j].marks.length, arr[j + 1].marks.length);
        for (int k = 0; k < min; k++) {
          if (arr[j].marks[k] > arr[j + 1].marks[k]) {
            NewStudents temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            break;
          }
        }
      }
    }
    for (NewStudents s : arr) {
      System.out.println(s.name + " " + s.roll + " " + Arrays.toString(s.marks));
    }
  }

}
