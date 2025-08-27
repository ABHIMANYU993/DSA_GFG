// User function Template for Java
class one_even_occurence {

  public int maxnum(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[max])
        max = i;
    }
    return max;
  }

  public void frequency(int[] arr, int[] freq) {

    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }
  }

  public int findDuplicate(int[] arr) {
    // code here
    int maxVal = arr[maxnum(arr)];
    int[] freq = new int[maxVal + 1];
    frequency(arr, freq);
    for (int i = 0; i < freq.length; i++) {
      if (freq[arr[i]] > 1)
        return arr[i];
    }
    return 0;
  }
}
