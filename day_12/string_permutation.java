import java.util.ArrayList;
import java.util.Collections;
// User function Template for Java

class string_permutation {

  public ArrayList<String> res = new ArrayList<>();

  public void per(char[] s, int i) {

    char temp;
    if (i == s.length - 1) {
      res.add(new String(s));
      return;
    }
    for (int j = i; j < s.length; j++) {
      temp = s[i];
      s[i] = s[j];
      s[j] = temp;
      per(s, i + 1);
      temp = s[i];
      s[i] = s[j];
      s[j] = temp;
    }

  }

  public ArrayList<String> permutation(String S) {
    // Your code here

    per(S.toCharArray(), 0);
    Collections.sort(res);
    return res;
  }
}
