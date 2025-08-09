// User function Template for Java
class setbits_number_O_setbits {
    
    public static int setbit(int n){
        int res=0;
    while(n>0){
        n=n&(n-1);
        res=res+1;
    }
    return res;
    
}
    static int setBits(int n) {
        // code here
        int i,set=0;
        //for(i=0;i<=31;i++){
          //  if((n&1)==1)set++;
            //n=n>>1;
            set=setbit(n);
    //}
    return set;
}

}
