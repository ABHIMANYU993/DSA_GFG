class kth_of_two_array {
  public int kthElement(int a[], int b[], int k) {
    // code here
    int length_a = a.length, length_b = b.length;
    if (length_a > length_b) {
      return kthElement(b, a, k);
    }
    int low = 0 >= (k - length_b) ? 0 : k - length_b;
    int high = k <= length_a ? k : length_a;
    while (low <= high) {
      int mid_a = (low + high) / 2;
      int mid_b = k - mid_a;

      int la = mid_a == 0 ? Integer.MIN_VALUE : a[mid_a - 1];
      int lb = mid_b == 0 ? Integer.MIN_VALUE : b[mid_b - 1];
      int ra = mid_a == length_a ? Integer.MAX_VALUE : a[mid_a];
      int rb = mid_b == length_b ? Integer.MAX_VALUE : b[mid_b];

      if (la <= rb && lb <= ra) {
        return la >= lb ? la : lb;
      }
      if (la > rb) {
        high = mid_a - 1;
      } else {
        low = mid_a + 1;
      }

    }
    return -1;

  }
}
