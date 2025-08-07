class trailing_zeros_in_factorial {
    static int trailingZeroes(int n) {
        // code here
        int zeros=0,i;
        for(i=5; i<=n; i*=5){
         zeros= zeros + (n/i);
        }
        return zeros;
    }
}
