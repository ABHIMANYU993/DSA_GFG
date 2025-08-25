import java.util.ArrayList;

class transposeOfMatrix {
  public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
    // code here
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    for (int i = 0; i < mat.length; i++) {
      ArrayList<Integer> mat3 = new ArrayList<>();
      for (int j = 0; j < mat[i].length; j++) {
        mat3.add(mat[j][i]);
      }
      res.add(mat3);
    }
    return res;
  }
}
