class longest_even_odd_subarray {
  public static int maxEvenOdd(int arr[]) {
    // code here
    int max = -1, count = 0;
    for (int i = 1; i < arr.length; i++) {
      if ((arr[i] % 2 == 0 && arr[i - 1] % 2 == 0) || (arr[i] % 2 == 1 && arr[i - 1] % 2 == 1)) {
        max = count > max ? count : max;
        count = 0;
      }
      if (arr[i] % 2 == 0 && arr[i - 1] % 2 == 1) {
        count++;
      } else if (arr[i] % 2 == 1 && arr[i - 1] % 2 == 0) {
        count++;
      }
    }
    return max > count ? max + 1 : count + 1;
  }
}
