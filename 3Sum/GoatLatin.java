public class Solution
{
	public static void main(String s)
	{
		StringBuilder newString=new StringBuilder();
		StringBuilder as=new StringBuilder();
		String st="aeiouAEIOU";
		String[] ss=s.split(" ");
		for(int i=0;i<ss.length;i++)
		{
			as.append("a");
			char firstword=ss[i].charAt(0);
			if(st.indexOf(firstword)!=-1)
			{
				newString.append(ss[i]+"ma"+as);
			}
			else
			{
				newString.append(ss[i].subString(1)+firstword+"ma"+as);
			}
			if(i!=ss.length-1)
			{
				newString.append(" ");
			}
		}
		return newString.toString();

	}
}
/*
˼·��1.׼������StringBuilder�������ַ���
	  2.�����������ַ��ÿո��зֳ��ַ�������
	  3.ѭ�������ַ����ж������һ���ַ���Ԫ���Ļ��ں����ma��as����������ַ�a�ģ�
	  4.����ȥ����һ���ַ����ں���Ȼ���ma��as
	  5.��󷵻��ַ�����
*/