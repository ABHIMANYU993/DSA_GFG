class frequency_in_sorted {
  int findFrequency(int arr[], int x) {
    // code here
    int start = 0, end = arr.length - 1, count = 0;
    while (start <= end) {
      if (arr[start] == x && arr[end] == x && start != end) {
        count += 2;
      } else if (arr[start] == x || arr[end] == x)
        count++;
      start++;
      end--;
    }
    return count;
  }
}
