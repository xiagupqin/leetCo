package cn.itcast.File;

public class Solution {
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2)
	{
		if(l1==null && l2==null)
		{
			return null;
		}
		ListNode head=new ListNode(0);
		ListNode point=head;
		int carry=0;
		while(l1!=null&&l2!=null)
		{
			int sum=carry +l1.val+l2.val;
			point.next=new ListNode(sum%10);
			carry=sum/10;
			l1=l1.next;
			l2=l2.next;
			point=point.next;		
		}
		while(l1!=null)
		{
			int sum=carry+l1.val;
			point.next=new ListNode(sum%10);
			carry=sum/10;
			l1=l1.next;
			point=point.next;
		}
		while(l2!=null)
		{
			int sum=carry+l2.val;
			point.next=new ListNode(sum%10);
			carry=sum/10;
			l1=l1.next;
			point=point.next;
		}
		if(carry!=0)
		{
			point.next=new ListNode(carry);
		}
		return head.next;
	}
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x)
		{
			val=x;
			next=null;
		}
	}
	public static void main(String[] args)
	{
		ListNode l1=new ListNode(243);
		ListNode l2=new ListNode(564);
		ListNode l3=addTwoNumbers(l1,l2);
		System.out.println(String.valueOf(l3));
	}

}