public class Solution
{
	public static void main(String[] args)
	{
		boolean b=isHappy(19);
		System.out.println(b);

	}
	public static boolean isHappy(Long n)
	{
		final Set<Long> set=new HashSet<Long>();
		long sum=n;
		while(sum!=1)
		{
			sum=CalculateSum(sum);
			if(set.contains(sum))
			{
				return false;
			}
			else
			{
				set.add(sum);
			}
		}
		return true;

	}
	public static Long CalculateSum(Long n)
	{
		long Result=0
		while(n!=0)
		{
			Result+=(n%10)*(n%10);
			n=n/10;
		}
		return Result;

	}
}