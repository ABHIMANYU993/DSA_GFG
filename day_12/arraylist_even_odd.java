import java.util.ArrayList;

// User function Template for Java
class arraylist_even_odd {
  public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> list) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 0)
        a.add(list.get(i));
      else
        b.add(list.get(i));
    }

    res.add(a);
    res.add(b);
    return res;

  }
}
