class lsb_diff_bit {
    public static int posOfRightMostDiffBit(int m, int n) {
        // code here
        int x=m^n,i;
        if(x==0)return -1;
        int diff = x&(~(x-1));
        for(i=0;i<32;i++){
            if((diff&1)==1)return i+1;
            diff=diff>>1;
        }
        return 0;
    }
}
