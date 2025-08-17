import java.util.ArrayList;

class power_subset_string_recursive {

  public ArrayList<String> res = new ArrayList<>();

  public void sub(String s, int i, String cur) {
    if (i == s.length()) {
      res.add(cur);
      return;
    }
    sub(s, i + 1, cur);
    sub(s, i + 1, cur + s.charAt(i));
  }

  public ArrayList<String> powerSet(String s) {
    sub(s, 0, "");
    return res;
  }
}
