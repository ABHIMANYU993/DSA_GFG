class count_digits_recursive {
  public static int countDigits(int n) {
    // Code here
    if (n == 0)
      return 0;
    int count = 0;
    count++;
    return count + countDigits(n / 10);
  }
}
