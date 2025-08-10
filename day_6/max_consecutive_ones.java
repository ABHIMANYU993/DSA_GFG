class max_consecutive_ones {
    public static int maxConsecutiveOnes(int n) {
        int curr=0,max=0;
        while(n>0){
            if((n&1)==1){
                curr++;
            }
            else curr=0;
            n=n>>1;
            max = curr>max?curr:max;
        }
        return max;
    }
}
