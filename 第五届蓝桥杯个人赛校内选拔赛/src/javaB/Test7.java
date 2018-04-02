package javaB;

import java.util.Scanner;

/**G������һ֧ѵ�����صľ��ӣ�������ӳ���G�����⣬ÿ��ʿ������һ��ֱ���ϼ�������������ʿ����Ҳ������G������������G����������һ���ر������
 *  ��Ҫ��ǲһ����ʿ��������һ�������һ�������ӣ�Ϊ�����Ӹ����Ӷ�Ա�Ķ����ԣ�Ҫ�����һ��ʿ���ڸ������У�����ֱ���ϼ������ڸ������С�
	���ʣ�G�����ж������ɳ������ӵķ�����ע�⣬G����Ҳ������Ϊһ��ʿ����������ӡ�
	�����ʽ
	����ĵ�һ�а���һ������n����ʾ����G�������ڵľ��ӵ����������ӵ�ʿ����1��n��ţ�G�������Ϊ1��
	������n-1�������ֱ��ʾ���Ϊ2, 3, ..., n��ʿ����ֱ���ϼ���ţ����i��ʿ����ֱ���ϼ��ı��С��i��
	�����ʽ
	���һ����������ʾ�ɳ������ӵķ�������������Ŀ���ܴܺ���ֻ��Ҫ����������10007���������ɡ�
	��������1
	3
	1 1
	�������1
	4
	����˵��
	�����ַ�ʽ�ֱ��ǣ�
	1. ѡ1��
	2. ѡ2��
	3. ѡ3��
	4. ѡ2, 3��
	��������2
	7
	1 1 2 2 3 3
	�������2
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
	private int n; // ���  --- 1~n
	private int k; // �ϼ��ĺ�  i < n
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