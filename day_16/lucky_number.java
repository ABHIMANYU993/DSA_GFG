class lucky_number {
  public static boolean isLucky(int n) {
    // code here
    for (int i = 2; i <= n; i++) {
      if (n % i == 0 && i <= n)
        return false;
      n = n - (n / i);
    }
    return true;
  }
}
