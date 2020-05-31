//https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a
public class Clock
{
  public static int Past(int h, int m, int s)
  {
    return (s + 60 * (m + 60 * h)) * 1000;
  }
}