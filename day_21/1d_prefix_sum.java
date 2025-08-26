import java.util.ArrayList;

class prefix_sum {

  public ArrayList<Integer> a = new ArrayList<>();

  public int sum(int[] arr, int n) {
    if (n == 0)
      return arr[n];
    return arr[n] + a.get(n - 1);

  }

  public ArrayList<Integer> prefSum(int[] arr) {
    // code here
    for (int i = 0; i < arr.length; i++) {
      a.add(sum(arr, i));
    }
    return a;
  }
}
