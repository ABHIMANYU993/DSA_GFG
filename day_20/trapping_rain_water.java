
class trapping_rain_water {

  public int maxelem(int arr[]) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[max])
        max = i;
    }
    return max;
  }

  public int maxWater(int arr[]) {
    // code here
    int start = arr[0], end = arr[arr.length - 1], water = 0;
    int max = maxelem(arr);
    int i = 1, j = arr.length - 2;
    while (i < max && j > max) {
      if (arr[i] < start)
        water += start - arr[i];
      else
        start = arr[i];
      if (arr[j] < end)
        water += end - arr[j];
      else
        end = arr[j];
      i++;
      j--;

    }
    if (i != max) {
      while (i < max) {
        if (arr[i] < start)
          water += start - arr[i];
        else
          start = arr[i];
        i++;
      }

    }
    if (j != max) {
      while (j > max) {
        if (arr[j] < end)
          water += end - arr[j];
        else
          end = arr[j];
        j--;
      }
    }

    /*
     * for(i=1;i<max;i++){
     * if(arr[i]<start)water+=start-arr[i];
     * else start=arr[i];
     * }
     * for(int j=arr.length-2;j>max;j--){
     * if(arr[j]<end)water+=end-arr[j];
     * else end=arr[j];
     * }
     */
    return water;
  }
}
