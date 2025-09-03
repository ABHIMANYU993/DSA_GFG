// User function Template for Java

class equal_sum {

  String equilibrium(int arr[]) {
    int sum = 0;
    for (Integer n : arr) {
      sum += n;
    }

    int n = arr.length;
    int left = 0;
    for (int i = 0; i < n; i++) {
      left += arr[i];
      if (sum == left)
        return "true";
      sum -= arr[i];
    }
    return "false";
  }
}
