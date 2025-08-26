// User function Template for Java

class array_sorted_or_not {
  public boolean arraySortedOrNot(int[] arr) {
    // code here
    if (arr.length == 1)
      return true;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] >= arr[i - 1])
        continue;
      else
        return false;
    }
    return true;
  }
}
