// User function Template for Java
class set_bits_number {
    static int setBits(int n) {
        // code here
        int i,set=0;
        for(i=0;i<=31;i++){
            if((n&1)==1)set++;
            n=n>>1;
            
    }
    return set;
}
}
