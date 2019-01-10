class Solution
{
	public int indexStr(String hystack,String needle)
	{
		StringBuilder str=new StringBuilder(hystack);
		return str.indexOf(needle);
	}
}