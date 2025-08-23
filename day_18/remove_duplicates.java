import java.util.ArrayList;

class remove_duplicates {

  public int maxnum(int[] arr) {
    int max = 0;
    for (int i = 1; i < arr.length; i++) {
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

  // Function to remove duplicates from the given array.
  ArrayList<Integer> removeDuplicates(int[] arr) {
    // code here
    ArrayList<Integer> res = new ArrayList<>();
    int maxVal = arr[maxnum(arr)];
    int[] freq = new int[maxVal + 1];
    frequency(arr, freq);
    for (int i = 0; i < freq.length; i++) {
      if (freq[i] > 0)
        res.add(i);
    }
    return res;
  }
}
