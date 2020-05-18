//https://www.codewars.com/kata/54edbc7200b811e956000556
public class Counter
{

  public int countSheeps(Boolean[] arrayOfSheeps)
  {
    int sum = 0;
    for (int i = 0; i < arrayOfSheeps.length; i++)
    {
      if (arrayOfSheeps[i] instanceof Boolean &&
          arrayOfSheeps[i])
          sum++;
    }
    return sum;
  }