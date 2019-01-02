class Solution
{
	public int compress(char[] chars)
	{
		if(chars.length==1)
		{
			return 1;
		}
		int count=0;
		int endIndex=0;
		for(int i=0;i<chars.length;i++)
		{
			count++;
			if(i==chars.length-1||chars[i]!=chars[i+1])
			{
				chars[endIndex++]=chars[i];
				if(count>1)
				{
					String s=Integer.toString(count);
					for(int x=0;x<s.length();x++)
					{
						chars[endIndex++]=s.charAt(x);
						
					}
					count=0;
				}
			}
		}
		return endIndex;
	}
	
}