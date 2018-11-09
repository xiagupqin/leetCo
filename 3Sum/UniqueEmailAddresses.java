public class Solution
{
	public static void main(String[] args)
	{
		String[] s={"test.email+alex@leetcode.com",
			"test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int x=numUniqeEmials(s);
		System.out.println(x);


	}
	/*
	思路:1.根据规则：先把邮件名称用@切分
	     2.然后对切分后的第一个字符串进行过滤
		 3.把过滤之后的字符串保存在set中利用set的不可重复性
		 4.返回
	
	
	*/
	public static int numUniqeEmails(String[] emials)
	{
		Set<String> set=new HashSet<String>();
		for(String emial:emials)
		{
			String[] localName=emial.split("@");
			String str=localName[0].replace(".","");
			int x=str.index("+");
			set.add(str.subString(0,x)+"@"+localName[1]);
		}
		return set.size();
	}
}