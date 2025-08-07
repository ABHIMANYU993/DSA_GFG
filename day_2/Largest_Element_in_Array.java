class Largest_Element_in_Array {
    public static int largest(int[] arr) {
        // code here
        int min=0,i=0;
       // n= sizeOf(arr)/sizeOf(arr[0]);
        while(i<arr.length){
            if(arr[i]>min) min=arr[i];
            i++;
        }
        return min;
    }
}
