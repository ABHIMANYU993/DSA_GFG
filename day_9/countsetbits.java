class countsetbits {

  public static int highpow(long N) {
    long x = 1;
    int i = 0;
    for (i = 0; i < 32; i++) {
      if (x <= N)
        x = x << 1;
      else
        return i - 1;
    }
    return 0;
  }

  public static long countBits(long N) {
    // code here
    // System.out.println(highpow(N));
    if (N == 0)
      return 0;
    int x = highpow(N);
    long count = x * (1 << (x - 1)) + ((N - (1 << x)) + 1) + countBits(N - (1 << x));
    return count;

  }
}
