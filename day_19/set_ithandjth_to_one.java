class set_ithandjth_to_one {
  void booleanMatrix(int mat[][]) {
    // code here
    int[] row = new int[mat.length];
    int[] col = new int[mat[0].length];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == 1) {
          row[i] = 1;
          col[j] = 1;
        }
      }
    }

    for (int i = 0; i < row.length; i++) {
      for (int j = 0; j < col.length; j++) {
        if (row[i] == 1 || col[j] == 1) {
          // System.out.print(row[i]);
          // System.out.println(col[i]);
          mat[i][j] = 1;
          // mat[i]=1;
        }
      }
    }
  }
}
