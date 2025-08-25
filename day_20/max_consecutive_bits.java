
class max_consecutive_bits {
  public int maxConsecBits(int[] arr) {
    // code here

    int one = 0, zero = 0, maxone = -1, maxzero = -1;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == 1) {
        if (arr[i + 1] == 0) {
          if ((one + 1) > maxone)
            maxone = one++;
          one = 0;
        } else
          one++;
      }
      if (arr[i] == 0) {
        if (arr[i + 1] == 1) {
          if (zero + 1 > maxzero)
            maxzero = zero++;
          zero = 0;
        } else
          zero++;
      }
    }
    if ((one) > maxone)
      maxone = one;
    if (zero > maxzero)
      maxzero = zero;

    return maxone > maxzero ? maxone + 1 : maxzero + 1;
  }
}
