
class smallest_positive_missing {

  public int maxval(int arr[]) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    return max;
  }

  public void frequency(int[] arr, int[] freq) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0)
        freq[arr[i]]++;
    }
  }

  public int missingNumber(int[] arr) {
    // code here
    // if(arr.length==1 && arr[0]<0)return 1;
    int max = maxval(arr);
    if (max < 0)
      return 1;
    int[] freq = new int[max + 2];
    frequency(arr, freq);
    for (int i = 1; i < freq.length; i++) {
      if (freq[i] == 0)
        return i;
    }
    return 0;
  }
}
