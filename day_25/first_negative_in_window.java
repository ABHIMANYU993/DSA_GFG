import java.util.ArrayList;
import java.util.List;

class first_negative_in_window {
  static List<Integer> firstNegInt(int arr[], int k) {

    ArrayList<Integer> res = new ArrayList<>();
    int firstNegIndex = -1;
    for (int i = 0; i < k; i++) {
      if (arr[i] < 0) {
        firstNegIndex = i;
        break;
      }
    }
    res.add(firstNegIndex == -1 ? 0 : arr[firstNegIndex]);

    for (int i = k; i < arr.length; i++) {
      if (firstNegIndex == i - k) {
        firstNegIndex = -1;
        for (int j = i - k + 1; j <= i; j++) {
          if (arr[j] < 0) {
            firstNegIndex = j;
            break;
          }
        }
      } else if (firstNegIndex == -1 && arr[i] < 0) {
        firstNegIndex = i;
      }

      res.add(firstNegIndex == -1 ? 0 : arr[firstNegIndex]);
    }

    return res;
  }
}
