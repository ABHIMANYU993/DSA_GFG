// User function Template for Java
class count_setbits_lookuptable {
    public static int[] table=new int[256];
    
    public static void init(){
        table[0]=0;
        for(int i=1;i<256;i++){
            table[i]=table[(i&(i-1))]+1;
        }
    }
    public static int countbit(int n){
        return table[n&255]+table[(n>>8)&255]+table[(n>>16)&255]+table[(n>>24)];
    }

    
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
         //   if((n&1)==1)set++;
           // n=n>>1;
            // set=setbit(n);
    //}
    // return set;
    init();
    set=countbit(n);
    return set;
}

}
