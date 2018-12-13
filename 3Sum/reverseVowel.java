public class Solution
{
	public static String reverseVowel(String str)
	{
		char[] charArray=str.toCharArray();
		int p=0;
		int q=str.length-1;
		while(p<q)
		{
			while(p<q&&!isVowel(charArray[p]))
			{
				p++;
			}
			while(p<q&&!isVowel(charArray[q]))
			{
				q--;
			}
			if(p<q)
			{
				char st=charArray[p];
				charArray[p]=charArray[q];
				charArray[q]=st;
				p++;
				q--;
			}
		}
		return new String(charArray);
	}
	public static boolean isVowel(char c)
	{
		switch(c)
		{
			case 'i':
		    case 'o':
			case 'e':
			case 'a':
			case 'u':
			case 'A':
			case 'I':
			case 'E':
			case 'O':
			case 'U':
				return true;
		    default:
				return false;
		}
	}
}