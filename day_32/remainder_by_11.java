
// User function Template for Java

class remainder_by_11 {
  static int xmod11(String x) {
    // code here
    int res = 0;
    for (int i = 0; i < x.length(); i++) {
      int key = x.charAt(i) - '0' + (10 * res);
      res = key % 11;
    }
    return res;
  }
}
