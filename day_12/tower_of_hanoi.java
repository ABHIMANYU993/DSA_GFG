class tower_of_hanoi {

  public int count = 0;

  public int towerOfHanoi(int n, int from, int to, int aux) {
    // code here
    if (n == 0)
      return 0;
    towerOfHanoi(n - 1, from, to, aux);
    count++;
    towerOfHanoi(n - 1, to, aux, from);
    return count;
  }
}
