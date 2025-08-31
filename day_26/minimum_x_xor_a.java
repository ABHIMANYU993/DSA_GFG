// User function Template for Java

class minimum_x_xor_a {

  public static int[] table = new int[256];

  public static void init() {
    table[0] = 0;
    int i;
    for (i = 1; i < 256; i++) {
      table[i] = table[i & (i - 1)] + 1;
    }
  }

  public static int count(int n) {
    return table[n & 255] + table[(n >> 8) & 255] + table[(n >> 16) & 255] + table[(n >> 24)];
  }

  public static int minVal(int a, int b) {
    // code here
    init();
    int bita = count(a);
    int bitb = count(b);
    // System.out.print(bita+" "+bitb);
    int ans = a;
    // if(bita==bitb)return ans;
    if (bita > bitb) {
      while (bita > bitb) {
        a = a & (a - 1);
        ans = a;
        bita--;
      }
    } else {
      while (bita < bitb) {
        a = a | (a + 1);
        ans = a;
        bita++;
      }
    }
    return ans;
  }
}
