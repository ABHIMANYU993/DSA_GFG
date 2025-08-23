// User function Template for Java

class row_with_maxOnes {
  public int rowWithMax1s(int arr[][]) {
    // code here
    int idx, count = 0, max = 0;
    int[] countrow = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == 1)
          countrow[i]++;
      }
    }
    for (int i = 1; i < countrow.length; i++) {
      if (countrow[i] > countrow[max])
        max = i;
    }
    return max;
  }
}
