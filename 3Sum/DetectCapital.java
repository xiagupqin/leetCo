public class Solution
{
	public boolean deleteString(String word)
	{
		if(Character.isUpperCase(word.charAt(0)))
		{
			return isHasEmp(word);
		}
		else if(Character.isUpperCase(word.charAt(1)))
		{
			return false;
		}
		else
		{
			return isHasEmp(word);
		}
	}
	public boolean isHasEmp(String word)
	{
		boolean stt=Character.isUpperCase(word.charAt(1));
		for(int i=2;i<word.length();i++)
		{
			if(stt!=Character.isUpperCase(word.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
}