package javaB;

import java.util.Scanner;

/**G将军有一支训练有素的军队，这个军队除开G将军外，每名士兵都有一个直接上级（可能是其他士兵，也可能是G将军）。现在G将军将接受一个特别的任务，
 *  需要派遣一部分士兵（至少一个）组成一个敢死队，为了增加敢死队队员的独立性，要求如果一名士兵在敢死队中，他的直接上级不能在敢死队中。
	请问，G将军有多少种派出敢死队的方法。注意，G将军也可以作为一个士兵进入敢死队。
	输入格式
	输入的第一行包含一个整数n，表示包括G将军在内的军队的人数。军队的士兵从1至n编号，G将军编号为1。
	接下来n-1个数，分别表示编号为2, 3, ..., n的士兵的直接上级编号，编号i的士兵的直接上级的编号小于i。
	输出格式
	输出一个整数，表示派出敢死队的方案数。由于数目可能很大，你只需要输出这个数除10007的余数即可。
	样例输入1
	3
	1 1
	样例输出1
	4
	样例说明
	这四种方式分别是：
	1. 选1；
	2. 选2；
	3. 选3；
	4. 选2, 3。
	样例输入2
	7
	1 1 2 2 3 3
	样例输出2
	40
 * 
 * @author 49944
 *
 */
public class Test7 {

	private static int n;
    private static int arrays[];
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arrays = new int[n-1];
        for(int i=0; i<n-1; i++){
        	arrays[i] = scan.nextInt();
        }
        TreeNode root = new TreeNode(1,0);
        for(int i=0; i<n-1; i++){
        	root.addNode(i+2, arrays[i]);
        }
        preOrder(root);
	}
	private static void preOrder(TreeNode root) {
		if(root == null){
			return;
		}
		preOrder(root.left);
		System.out.println(root.getN());
		preOrder(root.right);
	}
}
class TreeNode{
	private int n; // 序号  --- 1~n
	private int k; // 上级的号  i < n
	TreeNode left = null;
	TreeNode right = null;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public TreeNode(int n, int k) {
		super();
		this.k = k;
		this.n = n;
	}
	public void addNode(int n, int k){
		if(this.n == k){
			if(left == null){
				left = new TreeNode(n, k);
			}else if(right == null){
				right = new TreeNode(n, k);
			}else{
				left.addNode(n, k);
				right.addNode(n, k);
			}
		}
	}
	
}