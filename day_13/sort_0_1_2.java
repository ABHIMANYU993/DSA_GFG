class sort_0_1_2 {
  public void sort012(int[] arr) {
    // code here
    int i = 0, zeros = 0, ones = 0;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] == 0)
        zeros++;
      if (arr[i] == 1)
        ones++;
    }
    for (i = 0; i < zeros; i++) {
      arr[i] = 0;
    }
    for (i = zeros; i < zeros + ones; i++) {
      arr[i] = 1;
    }
    for (; i < arr.length; i++) {
      arr[i] = 2;
    }
  }
}
