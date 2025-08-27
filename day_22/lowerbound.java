
class lowerbound {
  int lowerBound(int[] arr, int target) {
    // code here
    int i = 0;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] >= target)
        return i;
    }
    return i;
  }
}
