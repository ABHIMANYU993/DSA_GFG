// User function Template for Java

class max_count_of_subarray {

  long countSubarray(int arr[], int n, int k) {

    long pos = 0, count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > k)
        pos = i + 1;
      count += pos;
    }
    return count;

  }
}
