//https://www.codewars.com/kata/56f69d9f9400f508fb000ba7
public class MonkeyCounter
{
	public static int[] monkeyCount(final int n)
	{
		int[] arr = new int[n];
		for (int j = 0; j < n; j++)
		{
			arr[j] = j + 1;
		}
		return arr;
	}
}