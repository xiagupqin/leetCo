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
˼·:1.���ȶ�������int���͵���������װ�����ַ���ÿ���ַ��͡�a���ַ�������ֵ
2.��ran�������ѭ����������Ӽ����������ֵ��mag���������ֵ��˵��ran�ַ�������magizine���Ӽ�����false
���򷵻�true;




*/