
import java.util.ArrayList;

class index_subarray {
  static ArrayList<Integer> subarraySum(int[] arr, int target) {
    // code here
    ArrayList<Integer> res = new ArrayList<>();
    int sum = 0, start = 0, end = 0;
    for (int i = 0; i < arr.length; i++) {
      if ((sum) < target) {
        sum += arr[i];
        end = i;
      }
      if (sum > target) {
        while (sum > target) {
          sum = sum - arr[start];
          start++;
        }
      }
      if (sum == target) {
        break;
      }
    }
    if (sum == target) {
      res.add(start + 1);
      res.add(end + 1);
    } else {
      res.add(-1);
    }
    return res;

  }
}
