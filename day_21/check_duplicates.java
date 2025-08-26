// User function Template for Java

class check_duplicates {

  public int maxnum(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    return max;
  }

  public void frequency(int[] arr, int[] freq) {
    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }
  }

  public boolean checkDuplicates(int arr[]) {
    // Code here

    int maxVal = maxnum(arr);
    int[] freq = new int[maxVal + 1];
    frequency(arr, freq);
    for (int i = 0; i < freq.length; i++) {
      if (freq[i] > 1)
        return true;

    }
    return false;
  }
}
