// User function Template for Java

class position_of_setbit {
    
    static int setbits(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    
    static int findPosition(int n) {
        // code here
        if(setbits(n)>2)return -1;
        for(int i = 0; i<32;i++){
            if((n&1)==1) return i+1;
           n= n>>1;
        }
        return -1;
    }
}
