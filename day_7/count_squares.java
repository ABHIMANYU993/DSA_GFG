// User function Template for Java

class count_squares {
    static int countSquares(int n) {
        // code here
        int count=0;
        for(int i=1;i*i<n;i++){
            count++;
        }
        return count;
        
    }
}
