import java.lang.Math; 
class lcm_gcd {
    public int gcd(int n ,int m){
        if(m==0) return n;
        return gcd(m,n%m);
    }
    public int lcm(int n, int m){
        return (n*m)/gcd(n,m);
    }
    public int[] lcmAndGcd(int a, int b) {
        
        int[] arr={lcm(a,b),gcd(a,b)};
       return arr;
    }
    
}
