// User function Template for Java

class water_collection {

  public static int maxval(int[] arr) {
    int max = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[max])
        max = i;
    }
    return max;
  }

  public static int maxWater(int[] arr) {
    // code here

    int max = maxval(arr);
    int start = arr[0], end = arr[arr.length - 1], water = 0;
    for (int i = 0; i < max; i++) {
      if (start > arr[i])
        water += start - arr[i];
      else
        start = arr[i];
    }

    for (int j = arr.length - 1; j > max; j--) {
      if (end > arr[j])
        water += end - arr[j];
      else
        end = arr[j];
    }
    return water;

  }
}
