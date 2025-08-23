
import java.util.ArrayList;

class array_leader {

  public static void reverse(int[] temp, int start, int end) {
    while (start < end) {
      int tem = temp[start];
      temp[start++] = temp[end];
      temp[end--] = tem;
    }
  }

  static ArrayList<Integer> leaders(int arr[]) {
    ArrayList<Integer> res = new ArrayList<>();
    int curr = arr[arr.length - 1];
    int[] temp = new int[arr.length];
    int j = 0;

    temp[j++] = curr;

    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] >= curr) {
        curr = arr[i];
        temp[j++] = curr;
      }
    }

    reverse(temp, 0, j - 1);
    for (int i = 0; i < j; i++) {
      res.add(temp[i]);
    }
    return res;
  }

}
