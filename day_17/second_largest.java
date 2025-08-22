class second_largest {

  public int maxnum(int[] arr) {
    int max = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[max])
        max = i;
    }
    return max;
  }

  public int getSecondLargest(int[] arr) {
    int max = maxnum(arr);
    int res = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != arr[max]) {
        if (res == -1)
          res = i;
        else if (arr[i] > arr[res])
          res = i;
      }
    }

    return res == -1 ? res : arr[res];
  }
}
