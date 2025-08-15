class nth_fibonacci_recursive {
  static int fibonacci(int n) {
    // Code here
    if (n == 1)
      return 1;
    if (n == 2)
      return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);

  }
}
