class palindrome_string {
  boolean isPalindrome(String s) {
    // code here
    int i = 0, j = s.length() - 1, str = 0;
    while (i < j) {
      if (s.charAt(i) == s.charAt(j)) {
        str++;
      }
      i++;
      j--;
    }
    return str == (s.length()) / 2 ? true : false;

  }
}
