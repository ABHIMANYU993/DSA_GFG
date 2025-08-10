class first_set_bit_loc {
    public static int getFirstSetBit(int n) {
        // code here
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1)return i+1;
        }
        return -1;
        
    }
}
