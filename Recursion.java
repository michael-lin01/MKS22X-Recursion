public class Recursion{
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

 public static double sqrtH(double n, double guess, double tolerance){
   if(Math.abs((n-(guess*guess)) / n)  <= tolerance) {
     return guess;
   }
   return sqrtH(n, (n/guess+guess)/2,tolerance);
 }

 public static void main(String args[]){
   System.out.println(sqrt(100,0.00001));
 }

}