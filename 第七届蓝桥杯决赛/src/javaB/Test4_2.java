package javaB;

import java.util.Scanner;

/**
 * 路径之谜
 * 
 * @author 49944
 *
 */
public class Test4_2 {

	private static int n;
	private static int[][] next = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } }; // 上，下，左，右
	private static boolean[][] isVisted;
	private static int[] roats;
	private static int[] rows;
	private static int[] cols;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		rows = new int[n];
		cols = new int[n];
		for (int i = 0; i < n; i++) {
			cols[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			rows[i] = scan.nextInt();
		}
		roats = new int[n * n];
		isVisted = new boolean[n][n];
		int[] s_row = new int[n];
		int[] s_col = new int[n];
		// 起点
		s_row[0]++;
		s_col[0]++;
		isVisted[0][0] = true;
		dfs(0, 0, s_col, s_row, 0);
	}

	private static void dfs(int x, int y, int[] s_col, int[] s_row, int num) {
		// TODO Auto-generated method stub
		// 如果走到终点
		if (x == n - 1 && y == n - 1) {
			boolean isRow = true, isCol = true;
			for (int i = 0; i < n; i++) {
				if (s_col[i] != cols[i]) {
					isCol = false;
				}
				if (s_row[i] != rows[i]) {
					isRow = false;
				}
			}
			if (isCol && isRow) {
				System.out.print(0 + " ");
				for (int i = 0; i < num; i++) {
					if (roats[i] != 0) {
						System.out.print(roats[i] + " ");
					}else{
						continue;
					}
				}
			} else {
				return;
			}
		}
		for (int i = 0; i < 4; i++) {
			// 下一步走向
			int nX = x + next[i][0];
			int nY = y + next[i][1];
			if (nX < 0 || nY < 0 || nX >= n || nY >= n) {
				continue;
			}
			if (!isVisted[nX][nY]) {
				isVisted[nX][nY] = true;
				roats[num] = n * nX + nY;
				s_col[nY]++;
				s_row[nX]++;
				dfs(nX, nY, s_col, s_row, num + 1);
				// 回退一步
				isVisted[nX][nY] = false;
				roats[num] = 0;
				s_col[nY]--;
				s_row[nX]--;
			}
		}
	}

}
