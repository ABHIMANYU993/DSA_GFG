// User function Template for Java

class oddone_out_ola {
    static int findSingle(int[] arr) {
        // code here
        int x=arr[0];
        for(int i=1;i<arr.length;i++)x=x^arr[i];
        return x;
    }
}
