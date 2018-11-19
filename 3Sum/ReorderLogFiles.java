public class Solution {
	
	public String[] reorderLogFiles(String[] logs)
	{
		List<String> digitLog=new ArrayList<String>();
		Map<String,String> charLog=new TreeMap<String,String>();
		String[] ans=new String[logs.length];
		for(String s:logs)
		{
			if(isDigit(s))
			{
				digitLog.add(s);
			}
			else
			{
				String log=extractLog(s);
				charLog.put(log, s);
			}
		}
		int i=0;
		for(String key:charLog.keySet())
		{
			ans[i++]=charLog.get(key);
			
		}
		for(String d:digitLog)
		{
			ans[i++]=d;
		}
		return ans;
	}
	public boolean isDigit(String s)
	{
		int i=0;
		while(s.charAt(i)!=' ')
		{
			i++;
		}
		return Character.isDigit(s.charAt(i+1));
	}
	public String extractLog(String s)
	{
		int i=0;
		while(s.charAt(i)!=' ')
		{
			i++;
		}
		return s.substring(i+1);
	}

}