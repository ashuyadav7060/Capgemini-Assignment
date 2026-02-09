package Assignment2;

import java.util.*;

class Student {
  String name;
  int marks;

  Student(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }
}

public class Selection2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    Student[] arr = new Student[n];

    for (int i = 0; i < n; i++) {
      String name = sc.nextLine();
      int marks = sc.nextInt();
      sc.nextLine();
      arr[i] = new Student(name, marks);
    }
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j].marks < arr[minIndex].marks) {
          minIndex = j;
        }
      }
      Student temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
    for (Student s : arr) {
      System.out.println(s.name + ": " + s.marks);
    }

    sc.close();
  }
}
