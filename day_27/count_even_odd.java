/*Class solution with countOddEven() as its member function
 * arr : input array
 */
class count_even_odd {
  public static void countOddEven(Integer arr[]) {

    int odd = 0, even = 0;
    for (int num : arr) {
      if (num % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println(odd + " " + even);
  }
}
