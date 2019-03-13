class Solution
{
	public static  List<List<String>> groupAnagrams(String[] strs)
	{
		Map<String,List<String>> hm=new HashMap<>();
		for(int i=0;i<=strs.length-1;i++)
		{
			String key=sortString(strs[i]);
			if(hm.containsKey(key))
			{
				List<String> temp=hm.get(key);
				temp.add(strs[i]);
				hm.put(key, temp);
			}
			else
			{
				List<String> temp=new ArrayList<>();
				temp.add(strs[i]);
				hm.put(key, temp);
			}
			
		}
		List<List<String>> result=new ArrayList<List<String>>(hm.values());
		return result;
		
	}
	public static String sortString(String s)
	{
		char[] charArr=s.toCharArray();
		Arrays.sort(charArr);
		return String.valueOf(charArr);
	}

}