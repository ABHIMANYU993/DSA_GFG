class reverse_array_group {

  public void reverse(int[] arr, int start, int end) {

    while (start < end) {
      int temp = arr[start];
      arr[start++] = arr[end];
      arr[end--] = temp;
    }
  }

  public void reverseInGroups(int[] arr, int k) {
    // code here
    int i = 0;
    if (k > arr.length) {
      reverse(arr, 0, arr.length - 1);
      return;
    }
    if (k == 1)
      return;
    if (k > arr.length / 2) {
      reverse(arr, 0, k - 1);
      reverse(arr, k, arr.length - 1);
      return;
    }
    // System.out.print(arr);
    while (i < arr.length - k + 1) {
      reverse(arr, i, i + k - 1);
      i += k;
    }
    reverse(arr, i, arr.length - 1);
  }
}
