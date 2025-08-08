class GP_term {
    public double power(double a, int b){
        
        if(b==0)return 1;
        double temp= power(a,b/2);
        temp=temp*temp;
        if(b%2==0){
            return temp;
        }
        else return temp*a;
    }
    public double termOfGP(int a, int b, int n) {
        
        // code here
        double c=(double)b/a;
        if(n==1)return a;
        return a*(power(c,n-1));
    }
}
