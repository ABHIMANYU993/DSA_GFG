// User function Template for Java
class armstrong_number {
    
    public static int power(int a, int b) {
        // Write your code here
        int res=1;
        for(int i=1;i<=b;i++){
            res=a*res;
        
    }
    return res;
    }
    static boolean armstrongNumber(int n) {
        // code here
        //int low= n/100;
        int mid=(n/10)%10;
       // int high= n%10;
       // System.out.print(low);
       // System.out.print(mid);
        //System.out.print(power(high,3));
        return ((power(n%10,3))+(power(mid,3))+(power(n/100,3)))==n?true:false;
        
    }
}
