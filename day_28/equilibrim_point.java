
class equilibrim_point {

  public static int findEquilibrium(int arr[]) {
    int sum = 0;
    for (Integer n : arr) {
      sum += n;
    }

    int n = arr.length;
    int left = 0;
    for (int i = 0; i < n; i++) {
      left += arr[i];
      if (sum == left)
        return i;
      sum -= arr[i];
    }
    return -1;
  }
}
