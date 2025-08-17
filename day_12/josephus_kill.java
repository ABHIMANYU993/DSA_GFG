class josephus_kill {

  public int kill(int n, int k) {
    if (n == 1)
      return 0;

    return ((k) + kill(n - 1, k)) % n;
  }

  public int josephus(int n, int k) {
    int a = kill(n, k);
    return a + 1;
  }
}
