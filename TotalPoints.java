//https://www.codewars.com/kata/5bb904724c47249b10000131
public class TotalPoints
{
	public static int points(String[] games)
	{
		int sum = 0;
		for (int i = 0; i < games.length; i++)
		{
			if (games[i].charAt(0) > games[i].charAt(2))
				sum += 3;
			else
				if (games[i].charAt(0) == games[i].charAt(2))
					sum += 1;
		}
		return sum;
	}
}