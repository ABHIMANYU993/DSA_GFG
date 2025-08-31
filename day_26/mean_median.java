import java.util.Arrays;

class mean_median {
  public int mean(int[] arr) {
    // code here
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
      sum += arr[i];
    return sum / arr.length;
  }

  public int median(int[] arr) {
    Arrays.sort(arr);
    if (arr.length % 2 == 1)
      return arr[arr.length / 2];
    else
      return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
  }
}
