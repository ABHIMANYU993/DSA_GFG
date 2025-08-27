class majority_element {

  public int maxnum(int[] arr) {
    int max = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[max] || (arr[i] == arr[max] && i > max)) {
        max = i;
      }
    }
    return max;
  }

  public void frequency(int[] arr, int[] freq) {

    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }
  }

  int majorityElement(int arr[]) {
    // code here
    int maxVal = arr[maxnum(arr)];
    int[] freq = new int[maxVal + 1];
    frequency(arr, freq);
    for (int i = 0; i < arr.length; i++) {
      if (freq[arr[i]] > arr.length / 2)
        return arr[i];
    }
    return -1;
  }
}
