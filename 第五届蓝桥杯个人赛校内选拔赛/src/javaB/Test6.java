package javaB;

import java.util.Scanner;

/**
 * ��һ����˵������������Ϸ��
 * �硾ͼ1.png���������Ҫ����9��9�����ϵ���֪���֣����������ʣ��ո�����֣�������ÿһ�С�ÿһ�С�ÿһ��ͬɫ�Ź��ڵ����־���1-9�����ظ���
 * �����Ĵ𰸶���Ψһ�ģ����ԣ������Ҳ��Ϊ�޽⡣
 * ��ͼ�����־�˵�Ƿ�����ѧ�һ���3���µ�ʱ����Ƴ����Ľ��ѵ���Ŀ�����Ի�ʹ�ü������̵�����˵���������練���ˡ�
 * �����Ҫ���������������Ŀ���������������Ψһ�⡣���Ǳ�֤������֪���ݵĸ�ʽ���ǺϷ��ģ�������Ŀ��Ψһ�Ľ⡣
 * ��ʽҪ������9�У�ÿ��9���ַ���0����δ֪����������Ϊ��֪�� ���9�У�ÿ��9�����ֱ�ʾ�����Ľ⡣ ���磺 ���루��ͼ����Ŀ���� 
 * 005300000
 * 800000020 
 * 070010500 
 * 400005300
 * 010070006 
 * 003200080 
 * 060500009 
 * 004000030
 * 000009700 
 * ����Ӧ������� 
 * 145327698 
 * 839654127 
 * 672918543 
 * 496185372 
 * 218473956 
 * 753296481
 * 367542819 
 * 984761235 
 * 521839764 
 * �����磬���룺 
 * 800000000 
 * 003600000 
 * 070090200 
 * 050007000
 * 000045700 
 * 000100030 
 * 001000068 
 * 008500010 
 * 090000400 
 * ����Ӧ������� 
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
			// arrays[i][j] = scan.nextInt(); //û�пո���� ��������
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
	 *            ��
	 * @param col
	 *            ��
	 */
	private static void dfs(int row, int col) {
		if ( row == 9 ) { // row == 9 �Ϳ�����   row>=8 && col>=8
			// ��ʾok��
			print();
			end = System.currentTimeMillis();
			System.out.println(end - start+"ms");
            System.exit(0);
		}
		// ����и���Ϊ0
		if (arrays[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				// �ж� arrays[row][col] = i; �Ƿ�������������г�ͻ�������ظ�������1~9, �Ź���1~9
				if (noRowColsRepeat(row, col, i) && noSquaresRepeat(row, col, i)) {
					arrays[row][col] = i;
					dfs(row + (col + 1) / 9, (col + 1) % 9); // ����Ѱ����һ��
					arrays[row][col] = 0;
				}
			}
			
			//return; //
		}else{
			dfs(row + (col + 1) / 9, (col + 1) % 9); // ����Ѱ����һ��
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
	 * ����Ź����Ƿ��ظ�
	 * 
	 * @param row
	 * @param col
	 * @param n
	 * @return
	 */
	private static boolean noRowColsRepeat(int row, int col, int n) {
		// �ж���
		for (int i = 0; i < N; i++) {
			if (arrays[i][col] == n) {
				return false;
			}
		}
		// �ж���
		for (int i = 0; i < N; i++) {
			if (arrays[row][i] == n) {
				return false;
			}
		}
		return true;
	}

	/**
	 * ��������Ƿ��ظ�
	 * 
	 * @param row
	 * @param col
	 * @param n
	 *            �����ֵ 1~9
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
