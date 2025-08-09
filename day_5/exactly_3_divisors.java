class exactly_3_divisors {
    
    public boolean isPrime(int n){
        if(n==1)return false;
        if(n==2||n==3)return true;
        if(n%2==0 || n%3==0)return false;
        for(int i=5;i*i<=n;i+=6)if(n%i==0 || n%(i+2)==0)return false;
        return true;
    }
    public int exactly3Divisors(int n) {
        // code here
        int count=0,i;
        for(i=1;i*i<=n;i++){
        if(isPrime(i))count++;
        }
        return count;
    }
}
