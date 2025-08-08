class factorial {
    static int factorial(int n) {
        // code here
        if(n==0)return 1;
        else return n*factorial(n-1);
        
    }
  public int factor(int n) {
        // code here
        int fac=1,i;
        for(i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }
}
