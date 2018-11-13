public class Solution {
	public static int uniqueMorseRepresentations(String[] words)
	{
		String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
		Set<String> set=new HashSet<String>();
		for(String word:words)
		{
			StringBuilder code=new StringBuilder();
			for(char c:word.toCharArray())
			{
				code.append(MORSE[c-'a']);
			}
			set.add(code.toString());
		}
		return set.size();
	}
	/*
	1.���ȴ���һ��set���ϴ�ÿ���ַ����ĵ����ֵ
	2.����ÿ���ַ���ת�������뱣����stringBuilder����
	3.set���ϵ���������ȥ ���
	
	
	
	*/
	public static void main(String[] args)
	{
		String[] str= {"gin", "zen", "gig", "msg"};
		int x=uniqueMorseRepresentations(str);
		System.out.println(x);
		
	}

}
