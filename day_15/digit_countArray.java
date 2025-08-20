class digit_countArray {
  public int num(int k, int arr[]) {
    // code here
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      while (arr[i] > 0) {
        if (arr[i] % 10 == k)
          count++;
        arr[i] = arr[i] / 10;
      }
    }
    return count;
  }
}
