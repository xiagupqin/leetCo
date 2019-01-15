public static  List<String> findAndReplacePattern(String[] words,String pattern)
	{
		List<String> res=new LinkedList<String>();
		for(String word:words)
		{
			int[] p=new int[26];
			int[] s=new int[26];
			boolean samle=true;
			for(int i=0;i<word.length();i++)
			{
				System.out.println(word.charAt(i)-'a');
				System.out.println(word.charAt(i));
				System.out.println(pattern.charAt(i)-'a');
				if(s[word.charAt(i)-'a']!=p[pattern.charAt(i)-'a'])
				{
					samle=false;
					break;
				}
				else
				{
					s[word.charAt(i)-'a']=p[pattern.charAt(i)-'a']=i+1;
				}
				
			}
			if(samle)
			{
				res.add(word);
			}
		}
		return res;
	}
/*
步骤:1.遍历字符串，利用数组相同位置不相等来作为判断条件
2.如果不相等直接退出循环
3.如果相等则把它加在list中返回
*/