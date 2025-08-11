class isperfect {
    static boolean isPerfect(int n) {
        // code here
        //if(n==0)return 0;
        int i,sum=0;
        for(i=1;i*i<=n;i++){
            if(n%i==0)sum+=i;
        }
        i=i-1;
        for(;i>0;--i){
            if(n%i==0 && i!=n/i)sum+=n/i;
        }
        return (sum-n)==n?true:false;
    }
}
