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
	1.首先创建一个set集合存每个字符串的电解码值
	2.遍历每个字符串转换成密码保存在stringBuilder里面
	3.set集合的数量返回去 完成
	
	
	
	*/
	public static void main(String[] args)
	{
		String[] str= {"gin", "zen", "gig", "msg"};
		int x=uniqueMorseRepresentations(str);
		System.out.println(x);
		
	}

}
