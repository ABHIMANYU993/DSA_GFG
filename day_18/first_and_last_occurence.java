import java.util.ArrayList;
// User function Template for Java

class first_and_last_occurence {
  ArrayList<Integer> find(int arr[], int x) {
    // code here
    ArrayList<Integer> res = new ArrayList<>();
    int first = -1, last = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != x)
        continue;
      if (arr[i] == x && first == -1)
        first = i;
      if (arr[i] == x && first != -1)
        last = i;
    }
    res.add(first);
    res.add(last);
    return res;
  }
}
