class SUM {
//public static int sum=1;
  public static int sum_n(int n){
    int sum=0,i=1;
    while(i<=n){
      sum+=i++;
      
    }
return sum;
  }


public static int sum_rec(int n,int sum){
    if(n==0) return sum;
    else return sum+n+sum_rec(n-1,sum);
  }

  public static void main (String[] agrs){
    int n=59, sum=0, i;
    for(i=1;i<=n;i++)
        sum+=i;
    System.out.println("sum of "+n+ "numbers is:" +sum);
    
    sum=sum_n(n);
    
    System.out.println("sum of "+n+ "numbers is:" +sum);

    sum=sum_rec(n,0);
    
    System.out.println("sum of "+n+ "numbers is:" +sum);
    
  }
}
