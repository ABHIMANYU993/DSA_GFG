class colsum {
  public static int[] colSum(int mat[][]) {
    // Code here
    int[] a = new int[mat[0].length];
    int n = mat.length;
    int m = mat[0].length;
    // System.out.print(n+" "+m);
    for (int i = 0; i < mat[0].length; i++) {
      for (int j = 0; j < n; j++) {
        a[i] += mat[j][i];
      }
    }
    return a;
  }
}
