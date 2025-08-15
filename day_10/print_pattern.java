import java.util.ArrayList;

class print_pattern {
  public ArrayList<Integer> a = new ArrayList<>();

  public ArrayList<Integer> pattern(int n) {
    // code here

    if (n <= 0) {
      a.add(n);
      return a;
    }
    a.add(n);
    pattern(n - 5);
    a.add(n);

    return a;
  }
}
