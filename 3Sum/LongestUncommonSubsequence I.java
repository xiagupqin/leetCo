public class Solution
{
	public int subQuenceString(String a,String b)
	{
		if(a.equals(b))
		{
			return -1;
		}
		else {
			return a.length()>b.length()?a.length():b.length();
		}
	}
}
