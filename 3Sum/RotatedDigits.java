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
1.˼·:��С��10�ķ�����Ч��Ϊ2����Ч�����Ϸ�Ϊ1��
���Ϸ���Ϊ0��
2.ʵ�֣���i<10�Ľ��б�������ֵ
3.��i>10�Ľ��б��� Ȼ���ȡ���ȡ��
��i<10�Ľ��бȽ��������2�Ϸ�count++�����򲻺Ϸ�


*/