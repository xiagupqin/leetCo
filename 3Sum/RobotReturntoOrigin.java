public class Solution
{
	public static boolean spillter(String str)
	{
		int[] ass=new int[2];
		for(char c:str.toCharArrary())
		{
			switch(c)
			{
				case 'U':{ass[0]++;break;}
				case 'D':{ass[0]--;break;}
				case 'L':{ass[1]++;break;}
				case 'R':{ass[1]--;break;}
			}
		}
		return ass[0]==0&&ass[1]==0;
	}
}