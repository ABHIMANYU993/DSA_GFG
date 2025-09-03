// User function Template for Java

class max_subset_xor {
  public int maxXor(int arr[], int n) {
    int idx = 0, max = 0;

    for (int bit = 31; bit >= 0; bit--) {
      int maxidx = idx;
      int maxval = Integer.MIN_VALUE;
      for (int i = idx; i < arr.length; i++) {
        if (((arr[i] >> bit) & 1) == 1 && arr[i] > maxval) {
          maxval = arr[i];
          maxidx = i;
        }
      }
      if (maxval == Integer.MIN_VALUE)
        continue;

      int temp = arr[idx];
      arr[idx] = arr[maxidx];
      arr[maxidx] = temp;

      for (int i = 0; i < arr.length; i++) {
        if (i != idx && ((arr[i] >> bit) & 1) == 1)
          arr[i] ^= arr[idx];
      }
      idx++;
    }
    for (int i = 0; i < arr.length; i++) {
      max ^= arr[i];
    }
    return max;
  }
}
