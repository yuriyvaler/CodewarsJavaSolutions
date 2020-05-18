//https://www.codewars.com/kata/57eae20f5500ad98e50002c5
class Kata
{
	static String noSpace(final String x)
	{
		String str = "";
		for (int i = 0; i < x.length(); i++)
		{
			if (x.charAt(i) != ' ')
				str += x.charAt(i);
		}
		return str;
	}
}