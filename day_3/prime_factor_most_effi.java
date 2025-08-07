import java.util.ArrayList;

class prime_factor_most_effi {

    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        if(n%2==0){
            while(n%2==0){
            n/=2;
        }
        list.add(2);
        }
        if(n%3==0){
            while(n%3==0){
            n/=3;
        }
        list.add(3);
        }        
      for(i=5;i*i<=n;i+=6){
          if(n%i==0) {
              while(n%i==0){
                  n/=i;
              }
              list.add(i);
          }
          if(n%(i+2)==0){
              while(n%(i+2)==0){
                  n/=i+2;
              }
              list.add(i+2);
          }
          }
          if(n>3)list.add(n);
          return list;
      }
        
    }
