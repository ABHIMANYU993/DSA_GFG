class unique_number_II {
    public int[] singleNum(int[] arr) {
        // Code here
        int i,x=arr[0];
        for(i=1;i<arr.length;i++)x=x^arr[i];
        int k = x&(~(x-1));
        int n1=0,n2=0;
        for(i=0;i<arr.length;i++){
            if((arr[i]&k)!=0)n1=n1^arr[i];
            else n2=n2^arr[i];
        }
        int[] a=new int[2];
        if(n1>n2){
            a[0]=n2;
            a[1]=n1;
            
        }
        else {
            a[1]=n2;
            a[0]=n1;
        }
        return a;

    }
}
