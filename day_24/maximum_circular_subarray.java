
class maximum_circular_subarray {

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

  public int kadane(int[] arr) {
    int i = 0, res = 0;
    int[] maxsub = new int[arr.length];
    maxsub[0] = arr[0];
    for (i = 1; i < arr.length; i++) {
      maxsub[i] = maxval(arr[i] + maxsub[i - 1], arr[i]);

    }
    return maxarr(maxsub);
  }

  public int maxCircularSum(int arr[]) {
    // code here
    int maxsum = kadane(arr);
    if (maxsum < 0)
      return maxsum;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      arr[i] = -arr[i];
    }
    int minsum = sum + kadane(arr);

    return maxval(maxsum, minsum);
  }
}
