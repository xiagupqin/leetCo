public class Solution
{
	public static boolean RepeatedSubstringPattern(String str)
	{
		int l=str.length();
		for(int i=l/2;i>=1;i--)
		{
			if(l%i==0)
			{
				int m=l/i;
				String sunstr=str.subString(0,i);
				StringBuilder strbuilder=new StringBuilder();
				for(int j=0;j<m;j++)
				{
					strbuilder.append(sunstr);
				}
				if(strbuilder.toString.toLowerCase().equals(str))
				{
					return true;
				}
			}
		}
		return false;
	}
}