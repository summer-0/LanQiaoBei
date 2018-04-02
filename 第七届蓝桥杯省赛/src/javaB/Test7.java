package javaB;
/**
 * 剪邮票
	如【图1.jpg】, 有12张连在一起的12生肖的邮票。
	现在你要从中剪下5张来，要求必须是连着的。
	（仅仅连接一个角不算相连）
	比如，【图2.jpg】，【图3.jpg】中，粉红色所示部分就是合格的剪取。
	请你计算，一共有多少种不同的剪取方法。
	1  2  3  4
	5  6  7  8
	9  10 11 12
	
 * @author 49944
 *  回溯  类似八皇后
 */
public class Test7 {
    private static int array[][] = new int[3][4];
    private static boolean isVisted[][] = new boolean[3][4];
    private static int MAXCOLS = 4;
    private static int cols[] = new int[MAXCOLS];//记录每列存留的
	
	public static void main(String[] args) {
		int num=0;
		for(int i=0; i<=2; i++){
			for(int j=0; j<=3; j++){
				array[i][j] = ++num;
				System.out.println(array[i][j]);
			}
		}
        getCount(0);
	}

	private static void getCount(int n) {
		boolean rows[] = new boolean[3];
		for(int i=0; i<n; i++){
			
		}
	}

}
