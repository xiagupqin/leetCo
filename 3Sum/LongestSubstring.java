public class Solution
{
	public static int lengthOfLongestSubstring(String ss)
	{
		int[] cnt=new int[256];
		char[] rs=ss.toCharArray();
		int ans=0;
		for(int l=0,r=0;r<ss.length;r++)
		{
			cnt[rs[r]]++;
			while(cnt[rs[r]]>1)
			{
				cnt[rs[l]]--;
				l++;

			}
			ans=Math.max(ans,r-l+1);
		}
		return ans;

	}
}