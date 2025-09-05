
class max_xor_subarray_k_window {
  public int maxSubarrayXOR(int[] arr, int k) {
    // code here
    int kxor = 0;
    for (int i = 0; i < k; i++) {
      kxor ^= arr[i];
    }

    int res = kxor;

    for (int i = k; i < arr.length; i++) {
      kxor ^= arr[i - k];
      kxor ^= arr[i];

      res = res > kxor ? res : kxor;
    }
    return res;
  }
}
