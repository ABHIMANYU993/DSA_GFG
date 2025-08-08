// User function Template for Java
class quick_exponent {
    static int quickExponents(long a, long b) {
        // Write your code here
        long lastdigit,exp,i,result=1;
        if(b==0)return 1;
        lastdigit=a%10;
        exp=b%4;
        if(exp==0)exp=4;
        for(i=0;i<exp;i++){
            result=(result*lastdigit)%10;
        }
        return (int)result;
    }
}
