class count_even_odd {
  public int[] countOddEven(int[] arr) {
    // Code here
    int even = 0, odd = 0;
    for (int i = 0; i < arr.length; i++) {
      if ((arr[i] & 1) != 1)
        even++;
      else
        odd++;
    }
    return new int[] { odd, even };
  }
}
