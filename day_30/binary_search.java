class binary_search {
  public int binarysearch(int[] arr, int k) {
    // Code Here
    int low = 0, high = arr.length - 1, mid = low + high / 2;
    while (low <= high) {
      mid = (low + high) / 2;
      if (arr[mid] == k) {
        if (mid - 1 < 0 || arr[mid - 1] != k)
          return mid;
        low = mid - 1;
        high = mid - 1;
      } else if (arr[mid] < k) {
        low = mid + 1;
      } else if (arr[mid] > k) {
        high = mid - 1;
      }
    }
    return -1;
  }
}
