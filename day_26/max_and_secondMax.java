import java.util.ArrayList;

class max_and_secondMax {

  public static int maxval(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++)
      if (arr[i] > arr[max])
        max = i;
    return max;
  }

  public static ArrayList<Integer> largestAndSecondLargest(int arr[]) {
    // code here.
    ArrayList<Integer> result = new ArrayList<>();
    int max = maxval(arr);
    int res = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != arr[max]) {
        if (res == -1)
          res = i;
        else if (arr[i] > arr[res])
          res = i;
      }
    }
    result.add(arr[max]);
    result.add(res == -1 ? res : arr[res]);
    return result;
  }
}
