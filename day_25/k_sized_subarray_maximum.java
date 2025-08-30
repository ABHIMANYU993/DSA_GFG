import java.util.ArrayList;

class k_sized_subarray_maximum {
  public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
    // code here
    int ksum = 0, curmax = 0;
    ArrayList<Integer> res = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      ksum += arr[i];
      if (arr[i] > curmax)
        curmax = arr[i];
    }
    res.add(curmax);
    for (int i = k; i < arr.length; i++) {
      if (arr[i - k] == curmax) {
        curmax = arr[i - k + 1];
        for (int j = i - k + 1; j <= i; j++) {
          if (arr[j] > curmax)
            curmax = arr[j];
        }
      } else if (arr[i] > curmax) {
        curmax = arr[i];
      }
      res.add(curmax);
    }
    return res;
  }
}
