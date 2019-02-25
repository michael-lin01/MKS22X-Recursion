import java.util.ArrayList;

public class recursion{
  /*
  *@param n any non-negative value you want to take the sqrt of
  *@return the approximate sqrt of n within a tolerance of 0.001%
  */
  public static double sqrt(double n, double tolerance){
     if (n==0){
       return 0;
    }
     return sqrtH(n,1,tolerance);
  }

  private static double sqrtH(double n, double guess, double tolerance){
     if(Math.abs((n-(guess*guess)) / n )  <= tolerance/100) {
       return guess;
    }
    return sqrtH(n, (n/guess+guess)/2,tolerance);
  }

  public static int fib(int n){
    return fibH(n,0,1);
  }

  private static int fibH(int n, int first, int second){
    if(n == 0) return first;
    return fibH(n-1,second,first+second);
  }

  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> sums = new ArrayList<>();
    makeAllSumsH(n,0,sums);
    return sums;
  }


  private static void makeAllSumsH(int n, int partial, ArrayList<Integer> sums){
    if(n==0){
      sums.add(partial);
    }
    else{
      makeAllSumsH(n-1,partial,sums);
      makeAllSumsH(n-1,partial+n,sums);
    }
  }

 public static void main(String args[]){
   System.out.println(sqrt(100,0.001));
   System.out.println(sqrt(10,0.001));
   System.out.println(sqrt(2,0.001));
   for(int i = 0; i < 15; i++){
    System.out.println(fib(i));
   }
  System.out.println(makeAllSums(3));
  System.out.println(makeAllSums(4));
 }
}
