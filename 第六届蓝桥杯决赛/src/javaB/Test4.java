package javaB;

import java.util.LinkedList;
import java.util.Scanner;

/**穿越雷区
	X星的坦克战车很奇怪，它必须交替地穿越正能量辐射区和负能量辐射区才能保持正常运转，否则将报废。
	某坦克需要从A区到B区去（A，B区本身是安全区，没有正能量或负能量特征），怎样走才能路径最短？
	已知的地图是一个方阵，上面用字母标出了A，B区，其它区都标了正号或负号分别表示正负能量辐射区。
	例如：
	A + - + -
	- + - - +
	- + + + -
	+ - + - +
	B + - + -
	坦克车只能水平或垂直方向上移动到相邻的区。
	数据格式要求：
	输入第一行是一个整数n，表示方阵的大小， 4<=n<100
	接下来是n行，每行有n个数据，可能是A，B，+，-中的某一个，中间用空格分开。
	A，B都只出现一次。
	要求输出一个整数，表示坦克从A区到B区的最少移动步数。
	如果没有方案，则输出-1
	例如：
	用户输入：
 5
	A + - + -
	- + - - +
	- + + + -
	+ - + - +
	B + - + -
	则程序应该输出：
	10
 * 
 * @author 49944
 *
 */
public class Test4 {
    private static LinkedList list[];
	private static int n;
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        list = new LinkedList[n];
        //char[][] ch = new char[n][n];
        for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        		list[i].add(scan.next());
        	}
        }
        //深度优先  DFS
        dfs();
	}
	private static void dfs() {
		boolean[][] isVisted = new boolean[n][n];
		dfs("A", isVisted);
	}
	private static void dfs(String s, boolean[][] isVisted){
		
	}

}
