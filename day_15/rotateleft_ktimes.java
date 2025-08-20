// User function Template for Java

class rotateleft_ktimes {
  // Function to rotate an array by d elements in counter-clockwise direction

  public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start++] = arr[end];
      arr[end--] = temp;
    }

  }

  static void rotateArr(int arr[], int d) {
    // add your code here

    d = d % arr.length;
    // System.out.print(d);
    reverse(arr, 0, d - 1);
    reverse(arr, d, arr.length - 1);
    reverse(arr, 0, arr.length - 1);

  }
}
