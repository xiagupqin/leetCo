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
˼·:1.��StringBuilder���Aֱ������B
2.�ж�sb���Ƿ����B ����������� �������������-1��
*/