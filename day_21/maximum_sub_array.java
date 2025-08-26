
// User function Template for Java
import java.util.ArrayList;

class maximum_sub_array {
  public ArrayList<Integer> findSubarray(int arr[]) {
    // code here
    int max = -1, sum = 0, i;
    ArrayList<Integer> temp = new ArrayList<>();
    ArrayList<Integer> res = new ArrayList<>();
    // ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(arr.length, 0));

    for (i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        sum += arr[i];
        temp.add(arr[i]);

      } else {
        if (sum > max) {
          max = sum;
          res = new ArrayList<>(temp);
        }
        sum = 0;
        temp.clear();
      }

    }
    if (sum > max) {
      max = sum;
      res = new ArrayList<>(temp);
    }
    if (max == -1 || res.isEmpty()) {
      res.clear();
      res.add(-1);
    }
    return res;
  }
}
