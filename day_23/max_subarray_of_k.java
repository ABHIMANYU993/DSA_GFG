class max_subarray_of_k {

  public int maxSubarraySum(int[] arr, int k) {

    int ksum = 0, max = 0;

    for (int i = 0; i < k; i++) {
      ksum += arr[i];
    }
    max = ksum;
    for (int i = k; i < arr.length; i++) {
      ksum = ksum - arr[i - k] + arr[i];
      if (ksum > max)
        max = ksum;
    }
    return max;

  }
}
