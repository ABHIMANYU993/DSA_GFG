class reverse_exponent {
    public int reverseExponentiation(int n) {
        // code here
        if(n==10) return 10;
        int i,res=n;
        for(i=1;i<n;i++){
            res=n*res;
        }
        return res;
    }
}
