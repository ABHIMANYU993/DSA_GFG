
class kadane_algorithm {

  int maxval(int a, int b) {
    return a > b ? a : b;
  }

  int maxarr(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    return max;
  }

  int maxSubarraySum(int[] arr) {
    // Code here
    int i = 0, res = 0;
    int[] maxsub = new int[arr.length];
    maxsub[0] = arr[0];
    for (i = 1; i < arr.length; i++) {
      maxsub[i] = maxval(arr[i] + maxsub[i - 1], arr[i]);

    }
    return maxarr(maxsub);
  }
}
