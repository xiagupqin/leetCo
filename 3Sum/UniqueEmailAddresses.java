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
	˼·:1.���ݹ����Ȱ��ʼ�������@�з�
	     2.Ȼ����зֺ�ĵ�һ���ַ������й���
		 3.�ѹ���֮����ַ���������set������set�Ĳ����ظ���
		 4.����
	
	
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