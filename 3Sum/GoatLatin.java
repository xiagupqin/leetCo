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
思路：1.准备两个StringBuilder用来存字符串
	  2.将传进来的字符用空格切分成字符串数组
	  3.循环遍历字符串判断如果第一个字符是元音的话在后面加ma和as（用来存放字符a的）
	  4.否则去除第一个字符加在后面然后加ma和as
	  5.最后返回字符数组
*/