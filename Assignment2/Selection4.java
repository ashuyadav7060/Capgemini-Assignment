package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Selection4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    NewStudents[] arr = new NewStudents[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter your name:");
      String name = sc.nextLine();

      System.out.println("Enter your roll:");
      int roll = sc.nextInt();

      System.out.println("Enter number of subjects:");
      int sub = sc.nextInt();

      int[] marks = new int[sub];
      System.out.println("Enter your marks:");
      for (int j = 0; j < sub; j++) {
        marks[j] = sc.nextInt();
      }
      sc.nextLine();

      arr[i] = new NewStudents(name, roll, marks);
    }

    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < arr.length; j++) {

        int len = Math.min(arr[minIndex].marks.length,
            arr[j].marks.length);

        for (int k = 0; k < len; k++) {
          if (arr[j].marks[k] < arr[minIndex].marks[k]) {
            minIndex = j;
            break;
          } else if (arr[j].marks[k] > arr[minIndex].marks[k]) {
            break;
          }
        }
      }
      NewStudents temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

    for (NewStudents s : arr) {
      System.out.println(
          s.name + " " + s.roll + " " + Arrays.toString(s.marks));
    }

    sc.close();
  }
}
