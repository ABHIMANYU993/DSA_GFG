// User function Template for Java

class xor_game {
  static int xorCal(int k) {
    int n = 0;
    for (int i = 1; i <= 100; i++) {
      n = (i) ^ (i + 1);
      if (k == n) {
        return i;
      }
    }
    return -1;
  }
}
