public class Solution {
	static class Result
	{
		String str;
		double value;
	}
	public static String optimalDivision(int[] nums)
	{
		int len=nums.length;
		return getMax(nums,0,len-1).str;
	}
	private static Result getMax(int[] nums,int start,int end)
	{
		Result r=new Result();
		r.value=-1.0;
		if(start==end)
		{
			r.str=nums[start]+"";
			r.value=(double)nums[start];
		}
		else if(start+1 == end)
		{
			r.str=nums[start]+"/"+nums[end];
			r.value=(double)nums[start]/(double)nums[end];
		}
		else
		{
			for(int i=start;i<end;i++)
			{
				Result r1=getMax(nums,start,i);
				Result r2=getMin(nums,i+1,end);
				if(r1.value/r2.value>r.value)
				{
					r.str=r1.str+"/"+(end-i >= 2 ? "("+r2.str+")":r2.str);
					r.value=r1.value/r2.value;
				}
				
			}
		}
		return r;
	}
	private static Result getMin(int[] nums,int start,int end)
	{
		Result r=new Result();
		r.value=Double.MAX_VALUE;
		if(start==end)
		{
			r.str=nums[start]+"";
			r.value=(double)nums[start];
		}
		else if(start+1==end)
		{
			r.str=nums[start]+"/"+nums[end];
			r.value=(double)nums[start]/(double)nums[end];	
		}
		else
		{
			for(int i=start;i<end;i++)
			{
				Result r1=getMin(nums,start,i);
				Result r2=getMax(nums,i+1,end);
				if(r1.value/r2.value<r.value)
				{
					r.str=r1.str+"/"+(end-i>=2 ? "("+r2.str+")":r2.str);
					r.value=r1.value/r2.value;
				}
			}
		}
		return r;
	}
	public static void main(String[] args)
	{
		int[] nums= {1000,100,10,2};
		String optimal=optimalDivision(nums);
		System.out.println(optimal);
	}
}
