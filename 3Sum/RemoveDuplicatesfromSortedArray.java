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
思路:1.对数组进行判断
2.数组里面有重复的就跳过，直到数组最后一位



*/