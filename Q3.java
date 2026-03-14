public class Q3 {
  public static void main(String[] args) {

    int[][] A = {
        { 1, 2 },
        { 3, 4 },
        { 5, 6 }
    };

    int[][] B = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 }
    };

    int[][] C = new int[3][4];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 2; k++) {
          C[i][j] += A[i][k] * B[k][j];
        }
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(C[i][j] + " ");
      }
      System.out.println();
    }
  }
}
