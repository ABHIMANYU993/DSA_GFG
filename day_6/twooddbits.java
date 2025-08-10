import java.util.ArrayList;
class  twooddbits {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        ArrayList<Integer> elem=new ArrayList<>();
        int i,x=arr[0];
        for(i=1;i<arr.length;i++)x=x^arr[i];
        int k = (x&(~(x-1)));
        int n1=0,n2=0;
        for(i=0;i<arr.length;i++){
            if((arr[i]&k)!=0)n1=n1^arr[i];
            else n2=n2^arr[i];
        }
        if(n1>n2){
            elem.add(n1);
            elem.add(n2);
        }
        else{
            elem.add(n2);
            elem.add(n1);
        }
        return elem;
    }
}
