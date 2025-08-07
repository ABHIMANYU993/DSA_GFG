class isprime_O_root_n {
    static boolean isPrime(int n) {
        // code here
        int i;
        if(n==1) return false;
        for (i=2;i*i<=n;i++){
        if(n%i==0)return false;
        }
        return true;
    }
}
