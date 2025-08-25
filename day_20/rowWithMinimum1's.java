class rowWithMinimum1s {
  int minRow(int mat[][]) {
    // code here
    int count = 0, min = 9999, zero = 0, minrow = 0;
    for (int i = 0; i < mat.length; i++) {
      count = 0;
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == 1)
          count++;
        if (mat[i][j] == 0)
          zero++;
      }
      if (count < min) {
        min = count;
        minrow = i;
      }
    }
    // return zero==(mat.length*mat.length)?1:minrow;
    return minrow + 1;
  }
};
