
class floor_in_sorted_array {
  public int findFloor(int[] arr, int x) {
    // code here
    int low = 0, high = arr.length - 1, res = -1;
    // if(high==0)return arr[0]<=x?0:-1;
    while (low <= high) {
      int mid = (low + high) / 2;
      // if(mid==arr.length-1 && arr[mid]<=x) return mid;
      if (arr[mid] <= x) {
        res = mid;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return res;
  }
}
