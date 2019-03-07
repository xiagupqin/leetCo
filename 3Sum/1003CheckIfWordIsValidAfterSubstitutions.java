class Solution
{
	public boolean ValidString(String s)
	{
		char[] arr=new char[s.length()];
		int j=0;
		for(char c:s.toCharray())
		{
			if(c=='c')
			{
				if(j<2||arr[j-1]!='b'||arr[j-2]!='a')
				{
					return false;
				}
			    j=j-2;

			}
			else
			{
				arr[j]=c;
				j++;
			}
		}
		return j==0;
	}
}