public class Solution
{
	public static int removeDuplicates(int[] nums)
	{
		if(nums.length==0)
		{
			return 0;
		}
		int i=0;
		for(int j=0;j<nums.length;i++)
		{
			if(num[i]!=num[j])
			{
				i++;
				num[i]=num[j];
			}
		}
		return i+1;

	}
}
/*
˼·:1.����������ж�
2.�����������ظ��ľ�������ֱ���������һλ



*/