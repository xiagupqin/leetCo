public class Solution
{
	public static int firstUniq(String s)
	{
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character c:s.toChArray())
		{
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==1)
			{
				return i;
			}
		}
		return -1;
	}
}