public class Solution
{
	public static boolean isLongPressedName(String name,String typed)
	{
		int j=0,i=0;
		char c='-';
		for(i=0;i<typed.length();i++)
		{			
			if(j<name.length()&&name.charAt(j)==typed.charAt(i))
			{
				j++;
			
			}
			else if(typed.charAt(i)!=c)
			{
				return false
			}
			c=typed.charAt(i);
		}
		return j==name.length();
	}
}