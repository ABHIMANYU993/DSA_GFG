import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// User function Template for Java
class split_3_equal {

  public List<Integer> findSplit(int[] arr) {
    // Return an array of possible answer, driver code will judge and return true or
    // false based on
    List<Integer> res = new ArrayList<>();

    int sum = 0;
    for (int i = 0; i < arr.length; i++)
      sum += arr[i];
    if (sum % 3 != 0)
      return Arrays.asList(-1, 1);

    int prefix = 0;
    for (int i = 0; i < arr.length; i++) {
      prefix += arr[i];

      if (prefix == sum / 3) {
        res.add(i);
        prefix = 0;
      }
      if (res.size() == 2)
        return res;

    }
    return Arrays.asList(-1, 1);
  }
}
