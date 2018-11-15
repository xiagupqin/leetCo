public class Solution
{
	public static String reverseString(String str)
	{
		StringBuilder st=new StringBuilder();
		String[] stt=str.split(" ");
		for(String s:stt)
		{
			StringBuilder sa=new StringBuilder(s);
			st.append(sa.reverse());
			st.append(" ");

		}
		return st.toString().trim();
	}
}