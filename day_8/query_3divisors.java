import java.util.ArrayList;
// User function Template for Java
class query_3divisors {
    
    public static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2 || n==3 )return true;
        if(n%2==0 || n%3==0)return false;
        for(int i =5; i*i<=n;i+=6)if(n%i==0 || n%(i+2)==0)return false;
        return true;
    }
    public static int exactly3Divisors(long n) {
        // code here
        int count=0,i;
        for(i=2;i*i<=n;i++){
        if(isPrime(i))count++;
        }
        return count;
    }
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        // code here
        ArrayList<Integer> out = new ArrayList<>();
        //System.out.print(query.get(0));
        for(int i=0;i<q;i++){
            out.add(exactly3Divisors(query.get(i)));
        }
        return out;
    }
}
