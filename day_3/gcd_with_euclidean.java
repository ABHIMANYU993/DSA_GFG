class gcd_with_euclidean {
    public static int gcd(int n, int m) {
        while(n!=m){
            if(n>m) n-=m;
            else m-=n;
        }
        return n;
    }
}
