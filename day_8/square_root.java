class square_root {
    int floorSqrt(int n) {
        // code here
        int i,res=0;
        for(i=1;i*i<=n;i++){
            res=i;
        }
        return res;
        
    }
}
