//https://www.codewars.com/kata/51c8991dee245d7ddf00000e
public class ReverseWords
{
public static String reverseWords(String str)
	{
		String res = "";
		String[] token = str.split(" ");
		for (int i = 0; i < token.length; i++)
			res = token[i] + " " + res;
		return res.trim();
	}
}