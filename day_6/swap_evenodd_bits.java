class swap_evenodd_bits {
    public static int swapBits(int n) {
        // code here
        int even=n & 0xAAAAAAAA;
        int odd= n & 0x55555555;
        even >>=1;
        odd <<=1;
        
        return (even | odd);
    }
}
