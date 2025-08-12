// User function Template for Java
import java.math.BigInteger;
class  lasytdigit_exponent {
    static int getLastDigit(String a, String b) {
       
        BigInteger na = new BigInteger(a);
        BigInteger nb = new BigInteger(b);
        // System.out.print(na+" "+nb);
        if(nb.equals(BigInteger.ZERO))return 1;
        int res=1;
        // int lastdigit = na%10
        int lastDigit = na.mod(BigInteger.TEN).intValue();
        // int exp=nb%4;
        int exp=nb.mod(BigInteger.valueOf(4)).intValue();
        if(exp==0)exp=4;
        for(int i= 0;i<exp;i++){
            res=(res*lastDigit)%10;
        }
        return res;
        
    }
}
