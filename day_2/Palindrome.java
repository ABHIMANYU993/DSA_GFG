class Palindrome {
    public boolean isPalindrome(int n) {
        // code here
        int r=0,i,temp=n;
        while(n>0){
            r=r*10+(n%10);
            n=n/10;
        }
        return temp==r;
    }
}
