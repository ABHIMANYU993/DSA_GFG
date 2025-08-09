class odd_occurrence {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int i=1,res=arr[0];
        while(i<arr.length){
            res=res^arr[i++];
        }
        return res;
    }
}
