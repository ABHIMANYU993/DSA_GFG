class issparse {
    public static boolean isSparse(int n) {
        // code here
        int curr=0,max=0;
        while(n>0){
            if((n&1)==1){
                curr++;
            }
            else curr=0;
            n=n>>1;
            max= max>curr?max:curr;
        }
        return max>1?false:true;
    }
}
