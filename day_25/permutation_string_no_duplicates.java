import java.util.ArrayList;

class permutation_string_no_duplicates {

  public ArrayList<String> res = new ArrayList<>();

  public void per(char[] s, int i) {
    if (i == s.length - 1) {
      res.add(new String(s));
      return;
    }
    boolean[] used = new boolean[256];
    for (int j = i; j < s.length; j++) {
      if (!used[s[j]]) {
        used[s[j]] = true;
        swap(s, i, j);
        per(s, i + 1);
        swap(s, i, j);
      }
    }
  }

  public void swap(char[] s, int i, int j) {
    char temp = s[i];
    s[i] = s[j];
    s[j] = temp;
  }

  public ArrayList<String> findPermutation(String s) {
    // Code here
    int flag = 0;
    for (int i = 1; i < s.length(); i++) {
      flag += s.charAt(i) == s.charAt(0) ? 1 : 0;
    }
    if (flag == s.length() - 1) {
      res.add(s);
      return res;
    }
    per(s.toCharArray(), 0);
    // Collections.sort(res);
    return res;
  }
}
