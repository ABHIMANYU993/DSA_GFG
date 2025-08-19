// User function Template for Java

class lucky_person {

  public static int kill(int N) {
    if (N == 1)
      return 0;
    return ((2) + kill(N - 1)) % N;
  }

  static int find(int N) {
    // int a=kill(N);
    return kill(N) + 1;
  }
}
