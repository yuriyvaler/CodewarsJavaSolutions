//https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/java
class FirstNonConsecutive
{
    static Integer find(final int[] array)
    {
    Integer result = null;
    for (int i = 1; i < array.length; i++)
    {
         if (array[i] - 1 != array[i - 1])
             {
            result = array[i];
            break;
            }
    }
    return result;
    }
}