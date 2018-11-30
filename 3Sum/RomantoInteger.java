public class Solution {
	public static  String tree2str(TreeNode t)
	{
		if(t==null)
		{
			return "";
		}
		String left=tree2str(t.left);
		String right=tree2str(t.right);
		left=left.isEmpty()&&right.isEmpty()?"":"("+left+")";
		right=right.isEmpty()?"":"("+right+")";
		return t.val+left+right;
		
	}
	public static void main(String[] args)
	{
		TreeNode t=new TreeNode(3);
		String s=tree2str(t);
		System.out.println(s);
	}
	

}
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x)
	{
		val=x;
	}
	
}