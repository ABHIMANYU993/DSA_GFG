class left_index {
  public int leftIndex(int[] arr, int x) {
    // code here
    int low = 0, high = arr.length - 1, res = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == x) {
        res = mid;
        high = mid - 1;
      } else if (arr[mid] > x) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return res;
  }
}
