public class Q2 {
  public static void main(String[] args) {

    int[][] m = {
        { 1, 2 },
        { 3, 4 }
    };

    int[][] r = new int[2][2];

    r[0][0] = m[1][0];
    r[0][1] = m[0][0];
    r[1][0] = m[1][1];
    r[1][1] = m[0][1];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(r[i][j] + " ");
      }
      System.out.println();
    }
  }
}
