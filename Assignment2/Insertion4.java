package Assignment2;

class Stude {
  String name;
  int[] marks;
  int total;

  Stude(String name, int[] marks) {
    this.name = name;
    this.marks = marks;

    total = 0;
    for (int m : marks) {
      total += m;
    }
  }
}

public class Insertion4 {
  public static void insertionSort(Stude[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      Stude key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j].total > key.total) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {

    Stude[] arr = {
        new Stude("Ashu", new int[] { 80, 75, 85 }),
        new Stude("Rahul", new int[] { 70, 65, 72 }),
        new Stude("Neha", new int[] { 90, 88, 92 }),
        new Stude("Priya", new int[] { 78, 80, 76 })
    };

    insertionSort(arr);

    for (Stude s : arr) {
      System.out.print(s.name + "  ");
      for (int m : s.marks) {
        System.out.print(m + " ");
      }
      System.out.println("| Total = " + s.total);
    }
  }
}
