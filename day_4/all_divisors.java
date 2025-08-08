class all_divisors {
    public static void print_divisors(int n) {
        // code here
        int i;
        if(n==1){
            System.out.print(1);
            return ;
        }
        for(i=1;i*i<=n;i++){
            if(n%i==0 ){
                System.out.print(i+" ");
            }
        }
        i=i-1;
        for( ;i>0;--i){
             if(n%i==0 && i!=n/i){
                    System.out.print(n/i+" ");
            }
            
        }
    }
}
