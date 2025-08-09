class Kth_bit {
    static boolean checkKthBit(int n, int k) {
        // code here
        n=n>>k;
        int set= n&1;
        return set==1?true:false;
        
        
    }
}
