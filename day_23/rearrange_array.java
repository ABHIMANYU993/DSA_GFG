class rearrange_array {
  public void arrange(long[] arr) {
    long[] arrt = new long[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arrt[i] = arr[(int) arr[i]];
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arrt[i];

    }

  }
}
