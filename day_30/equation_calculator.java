
class equation_calculator {
  private double det(double[][] m) {
    return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
        - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
        + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
  }

  public double[] myCalculator(double[][] Arr) {
    double[][] A = { { Arr[0][0], Arr[0][1], Arr[0][2] }, { Arr[1][0], Arr[1][1], Arr[1][2] },
        { Arr[2][0], Arr[2][1], Arr[2][2] } };
    double[] D = { Arr[0][3], Arr[1][3], Arr[2][3] };
    double detA = det(A);
    if (Math.abs(detA) > 1e-9) {
      double[][] AX = { { D[0], A[0][1], A[0][2] }, { D[1], A[1][1], A[1][2] }, { D[2], A[2][1], A[2][2] } };
      double[][] AY = { { A[0][0], D[0], A[0][2] }, { A[1][0], D[1], A[1][2] }, { A[2][0], D[2], A[2][2] } };
      double[][] AZ = { { A[0][0], A[0][1], D[0] }, { A[1][0], A[1][1], D[1] }, { A[2][0], A[2][1], D[2] } };
      return new double[] { Math.floor(det(AX) / detA), Math.floor(det(AY) / detA), Math.floor(det(AZ) / detA) };
    }
    double[][] Aug1 = { { D[0], A[0][1], A[0][2] }, { D[1], A[1][1], A[1][2] }, { D[2], A[2][1], A[2][2] } };
    double[][] Aug2 = { { A[0][0], D[0], A[0][2] }, { A[1][0], D[1], A[1][2] }, { A[2][0], D[2], A[2][2] } };
    double[][] Aug3 = { { A[0][0], A[0][1], D[0] }, { A[1][0], A[1][1], D[1] }, { A[2][0], A[2][1], D[2] } };
    return (Math.abs(det(Aug1)) < 1e-9 && Math.abs(det(Aug2)) < 1e-9 && Math.abs(det(Aug3)) < 1e-9)
        ? new double[] { Double.POSITIVE_INFINITY }
        : new double[] { Double.NEGATIVE_INFINITY };
  }
}
