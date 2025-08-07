// User function Template for Java

class Greatest_common_divisor_or_hcf {

    // Function for finding maximum and value pair
    public static int common_divisor(int n, int m) {
        // Complete the function
        int i=1,res=0;
        while(i<n+m){
            
            if(n%i==0 && m%i==0) res=i;
            i++;

        }
        return res;
    }
}
