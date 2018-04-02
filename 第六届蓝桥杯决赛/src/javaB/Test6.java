package javaB;

import java.util.Scanner;

/**铺瓷砖
	为了让蓝桥杯竞赛更顺利的进行，主办方决定给竞赛的机房重新铺放瓷砖。机房可以看成一个n*m的矩形，而这次使用的瓷砖比较特别，有两种形状，
	如【图1.png】所示。在铺放瓷砖时，可以旋转。主办方想知道，如果使用这两种瓷砖把机房铺满，有多少种方案。
	【输入格式】
	输入的第一行包含两个整数，分别表示机房两个方向的长度。
	【输出格式】
	输出一个整数，表示可行的方案数。这个数可能很大，请输出这个数除以65521的余数。
	【样例输入1】
	4 4
	【样例输出1】
	2
	【样例说明1】
	这两种方案如下【图2.png】所示：
	【样例输入2】
	2 6
	【样例输出2】
	4
	【数据规模与约定】
	对于20%的数据，1<=n, m<=5。
	对于50%的数据，1<=n<=100，1<=m<=5。
	对于100%的数据，1<=n<=10^15，1<=m<=6。
 * 
 * @author 49944
 *
 */

public class Test6 {

	private static int n;
	private static int m;
	private static int arrays[][];
	private static boolean isVisted[][];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); 
		m = scan.nextInt();
		arrays = new int[n][m];
		isVisted = new boolean[n][m];
	}

}
