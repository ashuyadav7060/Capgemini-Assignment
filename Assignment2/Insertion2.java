package Assignment2;

public class Insertion2 {
  public static void insertionSort(Student[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      Student key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j].marks > key.marks) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {

    Student[] arr = {
        new Student("Ashu", 85),
        new Student("Rahul", 72),
        new Student("Neha", 90),
        new Student("Priya", 78)
    };

    insertionSort(arr);

    for (Student s : arr) {
      System.out.println(s.name + " " + s.marks);
    }
  }
}
