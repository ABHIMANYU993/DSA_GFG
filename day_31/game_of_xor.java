// User function Template for Java

class game_of_xor {
  static int gameOfXor(int N, int[] A) {
    // code here
    int res = A[0];
    if (N % 2 == 0)
      return 0;
    for (int i = 2; i < N; i += 2) {
      res ^= A[i];
    }
    return res;
  }
};
