
class diagonal_sum_mat {
  public int DiagonalSum(int[][] matrix) {
    // code here
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
      sum += matrix[i][matrix.length - i - 1];
    }
    return sum;
  }
}
