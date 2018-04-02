package javaB;

import java.util.Scanner;

public class Test4_1 {

	public static int n;
	public static int[] row, ring;
	public static boolean[][] visited;
	public static int[][] move = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
/**
 * 
 * @param s_row
 * @param s_ring
 * @param x  现在的行
 * @param y  现在的列
 * @param roat ：每一个值存储的是下一个二维数组的坐标  0~16
 * @param num
 */
	public void dfs(int[] s_row, int[] s_ring, int x, int y, int[] roat, int num) {
		if (x == n - 1 && y == n - 1) {
			boolean judgeX = true, judgeY = true;
			for (int i = 0; i < n; i++) { //判断对应的行 和 列的靶子的箭数是否相等
				if (s_row[i] != row[i])
					judgeX = false;
				if (s_ring[i] != ring[i])
					judgeY = false;
			}
			if (judgeX && judgeY) {
				System.out.print("0 ");
				for (int i = 0; i < num; i++)
					System.out.print(roat[i] + " ");
				System.out.println();
			}
			return;
		}
		for (int i = 0; i < 4; i++) {
			int tempX = x + move[i][0];
			int tempY = y + move[i][1];
			if (tempX >= 0 && tempX < n && tempY >= 0 && tempY < n && !visited[tempX][tempY]) {
				visited[tempX][tempY] = true;
				s_row[tempX]++; //行++
				s_ring[tempY]++;//列++
				roat[num] = tempX * n + tempY;
				dfs(s_row, s_ring, tempX, tempY, roat, num + 1);
				visited[tempX][tempY] = false;
				s_row[tempX]--;
				s_ring[tempY]--;
			}
		}
	}

	public void getResult() {
		int[] roat = new int[n * n + 1];//路线
		int[] s_row = new int[n];
		int[] s_ring = new int[n];
		visited[0][0] = true;
		s_row[0]++;
		s_ring[0]++;
		dfs(s_row, s_ring, 0, 0, roat, 0);
	}

	public static void main(String[] args) {
		Test4_1 test = new Test4_1();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		row = new int[n];
		ring = new int[n];
		visited = new boolean[n][n];
		for (int i = 0; i < n; i++)
			ring[i] = in.nextInt();
		for (int i = 0; i < n; i++)
			row[i] = in.nextInt();
		test.getResult();
	}

}
