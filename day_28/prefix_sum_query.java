import java.util.ArrayList;

class prefix_sum_query {

  public int[] prefix_sum(int[] arr) {
    int[] sum = new int[arr.length];
    sum[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      sum[i] = sum[i - 1] + arr[i];
    }
    return sum;
  }

  public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
    // code here
    ArrayList<Integer> res = new ArrayList<>();
    int[] sum = prefix_sum(arr);
    // for(int i=0;i<sum.length;i++)System.out.print(sum[i]);
    for (int i = 0; i < queries.length; i++) {
      if (queries[i][0] == 0)
        res.add(sum[queries[i][1]]);
      else
        res.add(sum[queries[i][1]] - sum[queries[i][0] - 1]);
    }
    return res;
  }
}
