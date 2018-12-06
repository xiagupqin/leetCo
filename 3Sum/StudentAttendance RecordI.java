public class Solution
{
	public static boolean(String s)
	{
		if(s.contains("LLL"))
		{
			return false;
		}
		String str=s.replaceAll("A","");
		if(s.length()-str.length()>1)
		{
			return false;
		}
		return true;
	}
}