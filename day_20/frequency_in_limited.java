import java.util.ArrayList;
import java.util.List;

class frequency_in_limited {
  public void frequency(int[] arr, int[] freq) {
    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }
  }

  public List<Integer> frequencyCount(int[] arr) {
    // code here
    int[] freq = new int[arr.length + 1];
    List<Integer> res = new ArrayList<>();

    frequency(arr, freq);
    for (int i = 1; i < freq.length; i++)
      res.add(freq[i]);
    return res;
  }
}
