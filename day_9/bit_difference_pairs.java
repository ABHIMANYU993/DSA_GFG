// User function Template for Java

class bit_difference_pairs {

  static int countBits(int N, long A[]) {
    // code here
    long m = 1000000007;
    long total = 0;
    for (int i = 0; i < 32; i++) {
      long countones = 0;
      long mask = 1L << i;
      for (int j = 0; j < N; j++) {
        if ((A[j] & mask) != 0)
          countones++;
      }
      long countzeros = N - countones;
      total = (total + ((2 * countzeros % m) * (countones % m)) % m) % m;

    }
    return (int) total;
  }
}
