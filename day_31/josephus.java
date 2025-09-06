class josephus {

  public static int kill(int n, int k) {
    if (n == 1)
      return 0;

    return ((k) + kill(n - 1, k)) % n;
  }

  static int safePos(int n, int k) {
    // code here
    int a = kill(n, k);
    return a + 1;
  }
};
