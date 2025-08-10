import java.util.ArrayList;
class test_bits {
    public static ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        ArrayList<Integer> elem=new ArrayList<>();
        int i,x=arr[0];
        for(i=1;i<arr.length;i++){
      System.out.println("x: "+x+" arr["+i+"]: "+arr[i]+" arr&x: "+(arr[i]^x));
      x=x^arr[i];
        }

        int k = (x&(~(x-1)));
        int n1=0,n2=0;
        for(i=0;i<arr.length;i++){
            if((arr[i]&k)!=0){
            System.out.println("k: "+k+" arr["+i+"]: "+arr[i]+"arr&k: "+(arr[i]&k));
            n1=n1^arr[i];
      }
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


public static void main (String[] agrs){

int[] arr = {4,2,4,5,2,3,3,1};
    System.out.println(twoOddNum(arr));


  }


}
