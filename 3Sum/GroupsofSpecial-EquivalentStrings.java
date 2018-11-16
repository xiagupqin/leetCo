public class Solution
{
	public int numSpecialEquivGroups(String[] A)
	{
		set<String> set=new HashSet<String>();
		for(String s:A)
		{
			int n=s.length();
			char[] odd=new char[(n+1)/2];
			char[] even=new char[(n+1)/2];
			int to=0,int te=0;
			for(int i=0;i<s.length();i++)
			{
				if(i%2==0)
				{
					even[te++]=s.charAt(i);

				}
				else
				{
					odd[to++]=s.charAt[i];

				}
			}
			Arrays.sort(odd);
			Arrays.sort(even);
			set.add(String.valueof(odd)+String.valueof(even));
		}
		return set.size();
	}
}