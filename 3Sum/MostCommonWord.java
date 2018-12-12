class Solution
{
	public static String mostCommonString(String string,String[] ban)
	{
		String st=string.split("[!?',;. ]");
		String str=null;
		Set<String> set=new HashSet<String>();
		for(String s:ban)
		{
			set.add(s);
		}
		int max=0;
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String tr:st)
		{
			tr=tr.toLowerCase();
			if(tr.length()==0||set.contains(tr))
			{
				continue;
			}
			map.put(tr,map.getOrDefault(tr,0)+1);
			if(map.get(tr)>max)
			{
				max=map.get(tr);
				str=tr;
			}
			
		}
		return str;
	}
}