package Assignment2;

class Studen {
  String name;
  int m1, m2, m3, total;

  Studen(String name, int m1, int m2, int m3) {
    this.name = name;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    this.total = m1 + m2 + m3;
  }
}

public class Insertion3 {

  public static void insertionSort(Studen[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      Studen key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j].total > key.total) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    Studen[] arr = {
        new Studen("Ashu", 80, 75, 85),
        new Studen("Rahul", 70, 65, 72),
        new Studen("Neha", 90, 88, 92),
        new Studen("Priya", 78, 80, 76)
    };

    insertionSort(arr);

    for (Studen s : arr) {
      System.out.println(
          s.name + " - " +
              s.m1 + " " + s.m2 + " " + s.m3 +
              " | Total = " + s.total);
    }
  }
}
