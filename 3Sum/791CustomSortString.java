public static String customSortString(String S,String T)
	{
		StringBuilder sb=new StringBuilder();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:T.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		for(char c:S.toCharArray())
		{
			if(exitsCharacter(c,T))
			{
				if(map.get(c)>0)
				{
					sb.append(c);
					map.put(c, map.get(c)-1);
				}
			}
		}
		System.out.println(map);
		Set<Map.Entry<Character,Integer>> pairs=map.entrySet();
		for(Map.Entry<Character, Integer> pair:pairs)
		{
			if(pair.getValue()>0)
			{
				System.out.println(pair.getValue());
				System.out.println(pair.getKey());
				int size=pair.getValue();
				for(int i=0;i<size;i++)
				{
					sb.append(pair.getKey());
					System.out.println(sb.toString());
				}
			}
		}
		return sb.toString();
	}
	public static  boolean exitsCharacter(char c,String T)
	{
		if(T.indexOf(c)>=0)
		{
			return true;
		}
		return false;
	}