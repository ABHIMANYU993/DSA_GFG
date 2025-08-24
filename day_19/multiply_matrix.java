import java.util.ArrayList;

class multiply_matrix {
  public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
    // code here
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    int[][] mat3 = new int[mat1.length][mat1[0].length];
    for (int i = 0; i < mat1.length; i++) {
      ArrayList<Integer> mat4 = new ArrayList<>();
      for (int j = 0; j < mat1[0].length; j++) {
        mat3[i][j] = 0;
        for (int k = 0; k < mat1.length; k++) {
          mat3[i][j] = mat3[i][j] + (mat1[i][k] * mat2[k][j]);
        }
        mat4.add(mat3[i][j]);

      }
      res.add(mat4);
    }
    return res;
  }
}
