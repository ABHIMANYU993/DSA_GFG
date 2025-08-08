class inverse_modulo {
    public int modInverse(int n, int m) {
        // code here
        int i;
        if(n%m==1)return 1;
        for(i=2;i<=m;i++){
            if((i*n)%m==1)return i;
        }
        return -1;
    }
}
