import java.util.*;

public class next_prime {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(nextPrime(n));

  }

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

    if (n == 1) {
      return n + 1;
    }
    n++;

    while (!isPrime(n)) {
      n++;
    }
    return n;
  }
}
