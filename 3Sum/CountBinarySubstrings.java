public class Solution
{
	public static int countBinarySubtring(String s)
	{
		if(s.length==1)
		{
			return 0;
		}
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				cur++;
			}
			else
			{
				pre=cur;
				cur=1;
			}
			if(pre >= cur)
			{
				count++;
			}
		}
	}
	return count;
}