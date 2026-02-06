public class Q4 {
  public static void main(String[] args) {

    int[][] a = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
        { 10, 11, 12 }
    };

    int rows = 4;
    int cols = 3;
    for (int i = 0; i < rows; i++) {
      for (int j = cols - 1; j >= 0; j--) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
