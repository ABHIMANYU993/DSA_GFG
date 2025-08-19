
class modular_exponent {
  public int powMod(int x, int n, int M) {
    int res = 1;
    x = x % M;

    while (n > 0) {
      if ((n & 1) == 1) {
        res = (int) (((long) res * x) % M);
      }
      x = (int) (((long) x * x) % M);
      n = n >> 1;
    }
    return res;
  }
}
