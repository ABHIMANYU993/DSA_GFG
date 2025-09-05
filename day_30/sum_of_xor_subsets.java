// User function Template for Java
class sum_of_xor_subsets {
  int subsetXORSum(int arr[]) {
    // code here
    int ans = 0;
    int n = arr.length;
    for (int i = 0; i < arr.length; i++) {
      ans |= arr[i];
    }

    int val = (1 << (n - 1));

    return (val * ans);
  }
}
