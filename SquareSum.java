//https://www.codewars.com/kata/515e271a311df0350d00000f
public class Kata
 {
  public static int squareSum(int[] n)
  {
   int sum = 0;
   for (int i = 0; i < n.length; i++)
   sum += Math.pow(n[i],2);
   return sum;
  }
 }