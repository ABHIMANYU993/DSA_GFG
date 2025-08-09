class ispower_of_2 {
    public static boolean isPowerofTwo(int n) {
        // code here
        return (n&(n-1))==0?true:false;
    }
}
