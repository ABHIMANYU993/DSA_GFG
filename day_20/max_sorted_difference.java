import java.util.Arrays;

class max_sorted_difference {
  int maxDiff(int[] arr) {
    // code here

    Arrays.sort(arr);

    int max = 0;

    for (int i = 1; i < arr.length; i++) {
      int res = arr[i] - arr[i - 1];
      max = (res > max) ? res : max;
    }

    return max;
  }
}
