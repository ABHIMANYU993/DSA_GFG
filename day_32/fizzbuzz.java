import java.util.*;

public class fizzbuzz {
  public static void main(String args[]) {
    // Your Code Here
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();

    if (a % 3 == 0 && a % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if (a % 3 == 0) {
      System.out.println("Fizz");
    } else if (a % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(a);
    }
  }
}
