class move_zeros_toEnd {

  void pushZerosToEnd(int[] arr) {
    int j = 0, i = 0;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[j++] = arr[i];
      }
    }
    while (j < arr.length) {
      arr[j++] = 0;
    }
  }
}
