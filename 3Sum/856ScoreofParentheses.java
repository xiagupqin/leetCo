public static  int scoreOfParentheses(String s)
	{
		int score=0;
		int multiply=1;
		for(int i=0;i<s.length();i++)
		{
			if(i!=s.length()-1&&s.charAt(i)=='('&&s.charAt(i+1)==')')
			{
				score+=multiply;
				i++;
			}
			else if(s.charAt(i)=='(')
			{
				multiply <<= 1;
				
			}
			else if(s.charAt(i)==')')
			{
				multiply >>=1;
			}
		}
		return score;
	}
	public static void main(String[] args)
	{
		String s="(";
		int st=scoreOfParentheses(s);
		System.out.println(st);
	}