class Solution
{
	int count=0;
	public static void main(String[] args)
	{
		String words= "cba";
		String pattern="abcd";
	}
	public int countSubStrings(String s)
	{
		if(s==null||s.length()==0)
		{
			return 0;
		}
		for(int i=0;i<s.length();i++)
		{
			extendPalindrome(s,i,i);
			extendPalindrome(s,i,i+1);
		}
		return count;
		
	}
	public void extendPalindrome(String str,int left,int right)
	{
		while(left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right))
		{
			count++;
			left--;
			right++;
		}
	}
}