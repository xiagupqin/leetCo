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
����:1.�����ַ���������������ͬλ�ò��������Ϊ�ж�����
2.��������ֱ���˳�ѭ��
3.���������������list�з���
*/