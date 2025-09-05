
// User function Template for Java

class transform_to_prime {

  static boolean isPrime(int n) {
    // code here
    int i;
    if (n == 1)
      return false;
    if (n == 2 || n == 3)
      return true;
    if (n % 2 == 0 || n % 3 == 0)
      return false;
    for (i = 5; i * i <= n; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0)
        return false;
    }
    return true;
  }

  public static int nextPrime(int n) {
    int count = 0;
    if (n == 1) {
      return n;
    }
    if (isPrime(n) == true)
      return 0;
    n++;
    while (!isPrime(n)) {
      count++;
      n++;
    }
    return count + 1;
  }

  public int minNumber(int arr[], int N) {

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    int count = nextPrime(sum);
    return count;
  }
}
