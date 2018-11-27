public class Solution
{
	public int rotatedDigits(int N)
	{
		int count =0;
		int[] ss=new int[N+1];
		for(int i=0;i<=N;i++)
		{
			if(i<10)
			{
				if(i==0||i==1||i==8)
				{
					ss[i]=1;
				}
				else if(i==2||i==5||i==6||i==9)
				{
					ss[i]=2;
					count++;
				}
			}
			else
			{
				int a=ss[i/10];
				int b=ss[i%10];
				if(a==1&&b==1)
				{
					ss[i]=1;
				}
				else if(a>=1&&a>=2)
				{
					ss[i]=2;
					count++;
				}
			}
		}
	}
	return count;
}
/*
1.思路:把小于10的符合有效的为2，有效但不合法为1，
不合法的为0；
2.实现：对i<10的进行遍历并设值
3.对i>10的进行遍历 然后对取余和取除
与i<10的进行比较如果大于2合法count++，否则不合法


*/