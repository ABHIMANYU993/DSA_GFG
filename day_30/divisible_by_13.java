class divisible_by_13 {
  public boolean divby13(String s) {
    // code here
    int num = 0;
    // if(Integer.parseInt(s)%13==0)return true;
    for (int i = 0; i < s.length(); i++) {
      num = ((num * 10) + (s.charAt(i) - '0')) % 13;
    }
    // System.out.println(num);
    if (num == 0)
      return true;
    return false;
  }
}
