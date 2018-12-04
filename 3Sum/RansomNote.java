public class solution
{
	public static boolean canConstruct(String ransome,String magizne)
	{
		int[] ran=new int[26];
		int[] mag=new int[26];
		int i=0;
		while(i<magizne.length())
		{
			mag[magizne.charAt(i)-'a']=mag[magizne.charAt(i)-'a']+1;
			if(i<ransome.length())
			{
				ran[ransome.charAt(i)-'a']=ran[ransome.charAt(i)-'a']+1;
			}
			i++;
		}
		for(int j=0;j<ran.length;i++)
		{
			if(ran[i]>mag[i])
			{
				return false;
			
			}
		}
		return true;
	}
}
/*
思路:1.首先定义两个int类型的数组用来装两个字符串每个字符和‘a’字符相减后的值
2.对ran数组进行循环遍历如果子集数组里面的值比mag数组里面的值大说明ran字符串不是magizine的子集返回false
否则返回true;




*/