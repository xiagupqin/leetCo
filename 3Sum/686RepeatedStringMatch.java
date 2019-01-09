class Solution
{
	public int repeatStringMatch(String A,String B)
	{
		int count=0;
		StringBuilder sb=new StringBuilder();
		while(sb.length()<B.length())
		{
			sb.append(A);
			count++;
		}
		if(sb.toString().contains(B))
		{
			return count;
		}
		if(sb.append(A).toString().contaions(B)
		{
			return ++count;

		}
		return -1;
	}
}
/*
思路:1.用StringBuilder添加A直到等于B
2.判断sb中是否包含B 如果包含返回 如果不包含返回-1；
*/