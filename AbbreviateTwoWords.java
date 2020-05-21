//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
public class AbbreviateTwoWords {

	  public static String abbrevName(String name)
	{
		char[] nameArray = name.toCharArray();
		char first = nameArray[0];
		char last = nameArray[name.indexOf(" ") + 1];
		String str = first + "." + last;
		return str.toUpperCase();
	}
}