class digits_in_factorial {
    public int digitsInFactorial(int n) {
        if(n==1 || n==0) return 1;
        double dig=0;
        for(int i=2;i<=n;i++){
            dig+=Math.log10(i);
        }
        return (int)dig+1;
    }
}
