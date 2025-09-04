
import java.util.List;
import java.util.Collections;

class max_occured_element {

  public int maxOccured(List<Integer> L, List<Integer> R) {
    // code here
    int max = 0;
    int maxL = Collections.max(L);
    int maxR = Collections.max(R);
    int maxValue = Math.max(maxL, maxR);

    int[] freq = new int[maxValue + 2];
    for (int i = 0; i < L.size(); i++) {
      freq[L.get(i)]++;
      freq[R.get(i) + 1]--;
    }
    for (int i = 1; i < freq.length; i++)
      freq[i] = freq[i - 1] + freq[i];
    // for(int i=0;i<freq.length;i++)System.out.println(freq[i]);
    for (int i = 0; i < freq.length; i++)
      if (freq[i] > freq[max])
        max = i;
    return max;
  }
}
