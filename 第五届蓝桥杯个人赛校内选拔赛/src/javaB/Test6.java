package javaB;

import java.util.Scanner;

/**
 * 你一定听说过“数独”游戏。
 * 如【图1.png】，玩家需要根据9×9盘面上的已知数字，推理出所有剩余空格的数字，并满足每一行、每一列、每一个同色九宫内的数字均含1-9，不重复。
 * 数独的答案都是唯一的，所以，多个解也称为无解。
 * 本图的数字据说是芬兰数学家花了3个月的时间设计出来的较难的题目。但对会使用计算机编程的你来说，恐怕易如反掌了。
 * 本题的要求就是输入数独题目，程序输出数独的唯一解。我们保证所有已知数据的格式都是合法的，并且题目有唯一的解。
 * 格式要求，输入9行，每行9个字符，0代表未知，其它数字为已知。 输出9行，每行9个数字表示数独的解。 例如： 输入（即图中题目）： 
 * 005300000
 * 800000020 
 * 070010500 
 * 400005300
 * 010070006 
 * 003200080 
 * 060500009 
 * 004000030
 * 000009700 
 * 程序应该输出： 
 * 145327698 
 * 839654127 
 * 672918543 
 * 496185372 
 * 218473956 
 * 753296481
 * 367542819 
 * 984761235 
 * 521839764 
 * 再例如，输入： 
 * 800000000 
 * 003600000 
 * 070090200 
 * 050007000
 * 000045700 
 * 000100030 
 * 001000068 
 * 008500010 
 * 090000400 
 * 程序应该输出： 
 * 812753649 
 * 943682175
 * 675491283 
 * 154237896 
 * 369845721 
 * 287169534 
 * 521974368 
 * 438526917 
 * 796318452
 * 
 * @author 49944
 *
 */

public class Test6 {
	private static int N = 9;
	private static int[][] arrays = new int[N][N];
	private static long start;
	private static long end;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*for (int i = 0; i < N; i++) {
			// arrays[i][j] = scan.nextInt(); //没有空格隔开 不能这样
			String str = scan.next();
			char[] charArray = str.toCharArray();
			for (int k = 0; k < charArray.length; k++) {
				arrays[i][k] = Integer.parseInt(charArray[k]+"");
			}
		}*/
		for(int i=0; i<N; i++){
	    	   for(int j=0; j<N; j++){
	    		   arrays[i][j] = scan.nextInt();
	    	   }
	       }
		start = System.currentTimeMillis();
		dfs(0, 0);
		
	}

	/**
	 * 
	 * @param row
	 *            行
	 * @param col
	 *            列
	 */
	private static void dfs(int row, int col) {
		if ( row == 9 ) { // row == 9 就可以了   row>=8 && col>=8
			// 表示ok了
			print();
			end = System.currentTimeMillis();
			System.out.println(end - start+"ms");
            System.exit(0);
		}
		// 如果有格子为0
		if (arrays[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				// 判断 arrays[row][col] = i; 是否会与其他格子有冲突（不能重复）横竖1~9, 九宫格1~9
				if (noRowColsRepeat(row, col, i) && noSquaresRepeat(row, col, i)) {
					arrays[row][col] = i;
					dfs(row + (col + 1) / 9, (col + 1) % 9); // 继续寻找下一个
					arrays[row][col] = 0;
				}
			}
			
			//return; //
		}else{
			dfs(row + (col + 1) / 9, (col + 1) % 9); // 继续寻找下一个
		}
		
	}

	private static void print() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arrays[i][j] + "");
			}
			System.out.println();
		}
		
		
	}

	/**
	 * 检验九宫格是否重复
	 * 
	 * @param row
	 * @param col
	 * @param n
	 * @return
	 */
	private static boolean noRowColsRepeat(int row, int col, int n) {
		// 判断行
		for (int i = 0; i < N; i++) {
			if (arrays[i][col] == n) {
				return false;
			}
		}
		// 判断列
		for (int i = 0; i < N; i++) {
			if (arrays[row][i] == n) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 检验横竖是否重复
	 * 
	 * @param row
	 * @param col
	 * @param n
	 *            传入的值 1~9
	 * @return
	 */
	private static boolean noSquaresRepeat(int row, int col, int n) {
		int startRow, startCol ;
		if (row <= 2) {
			startRow = 0;
		} else if (row <= 5) {
			startRow = 3;
		} else {
			startRow = 6;
		}

		if (col <= 2) {
			startCol = 0;
		} else if (col <= 5) {
			startCol = 3;
		} else  {
			startCol = 6;
		}
		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				if (arrays[i][j] == n) {
					return false;
				}
			}
		}
		return true;
	}

}
