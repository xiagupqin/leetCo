public class Solution
{
	public int RomanToInteger(String s)
	{
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		int ans=0;
		for(int i=0;i<s.length();i++)
		{
			if(i+1<s.length())
			{
				int a=map.get(s.charAt(i));
				int b=map.get(s.charAt(i+1));
				if(a>b)
				{
					ans=ans+map.get(s.charAt(i));
				}
				else
				{
					ans=ans-map.get(s.charAt(i));
				}
				
				
			}
			else
			{
				ans=ans+map.get(s.charAt(i));
			}
			
		}
		return ans;
	}
}