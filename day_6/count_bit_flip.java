class count_bit_flip {
    
    public static int[] t=new int[256];
    public static void init(){
        t[0]=0;
        for(int i=1;i<256;i++){
            t[i]=t[i&(i-1)]+1;
        }
    }
    public static int count(int n){
        return t[n&255]+t[(n>>8)&255]+t[(n>>16)&255]+t[(n>>24)];
    }
    public static int countBitsFlip(int a, int b) {
        // code here
        init();
        int x=a^b;
        int res = count(x);
        return res;
        
    } 
}
