//https://www.codewars.com/kata/5a00e05cc374cb34d100000d
public class Sequence
{
	public static int[] reverse(int n)
	{
		int[] arr = new int[n];
		for (int i = n; i > 0; i--)
			arr[i - 1] = n - i + 1;
		return arr;
	}
}