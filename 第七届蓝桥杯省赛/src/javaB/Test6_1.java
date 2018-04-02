package javaB;

/**
 * 方格填数 如下的10个格子 +--+--+--+ | | | | +--+--+--+--+ | | | | | +--+--+--+--+ | | |
 * | +--+--+--+ 填入0~9的数字。要求：连续的两个数字不能相邻。 （左右、上下、对角都算相邻） 一共有多少种可能的填数方案？
 * 
 * @author 49944
 *
 */
public class Test6_1 {

	private static boolean[][] isVisteds;
	private static int[] arrays;
	private static int roats[][];
	private static int[][] next = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
	private static boolean[] is;
    private static int count = 0;
	public static void main(String[] args) {
		arrays = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		is = new boolean[10];
		roats = new int[3][4];
		isVisteds = new boolean[3][4];
		isVisteds[0][0] = true;
		isVisteds[2][3] = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				roats[i][j] = Integer.MAX_VALUE;
			}
		}
		for(int i=0; i<=9; i++){
			is[i] = true;
			dfs(0, 1, arrays[i]);
			is[i] = false;
		}
		System.out.println(count);

	}

	/**
	 * 
	 * @param x:
	 *            行
	 * @param y:
	 *            列
	 */
	private static void dfs(int x, int y, int k) {
		// 填充到最后一个格子
		if (x == 2 && y == 3) {
            count++;
            return;
		}
		roats[x][y] = k;
		// 下一个位置
		int nX = x + (y + 1) / 4;
		int nY = (y + 1) % 4;
		for (int i = 0; i <= 9; i++) {
			// 判断其上下左右及对角互不相邻
			if (!isVisteds[nX][nY]  && !is[i] && i!=k  && judge(nX, nY, i) ) {
				isVisteds[nX][nY] = true;
				is[i] = true;
                dfs(nX, nY, i);
                is[i] = false;
                isVisteds[nX][nY] = false;
			}
		}
	}

	private static boolean judge(int x, int y, int i) {
		// 若是第一行
		if (x == 0) {
			if (Math.abs(i - roats[x][y - 1]) != 1) {
				return true;
			}
			return false;
		}
		if (x == 1) {
			if (y == 0 && Math.abs(i - roats[0][1]) != 1) {
				return true;
			}
			if (y == 3 && Math.abs(i - roats[0][2]) != 1 && Math.abs(i - roats[1][2]) != 1
					&& Math.abs(i - roats[0][3]) != 1) {
				return true;
			}
			if (y == 1 && Math.abs(i - roats[0][1]) != 1 && Math.abs(i - roats[0][2]) != 1
					&& Math.abs(i - roats[1][0]) != 1) {
				return true;

			}
			if (y == 2 && Math.abs(i - roats[0][1]) != 1 && Math.abs(i - roats[0][2]) != 1
					&& Math.abs(i - roats[0][3]) != 1 && Math.abs(i - roats[1][1]) != 1) {
				return true;

			}
			return false;
		}
		if (x == 2) {
			if (y == 0 && Math.abs(i - roats[1][0]) != 1 && Math.abs(i - roats[1][1]) != 1) {
				return true;
			}
			if (y == 1 && Math.abs(i - roats[1][0]) != 1 && Math.abs(i - roats[1][1]) != 1
					&& Math.abs(i - roats[1][2]) != 1 && Math.abs(i - roats[2][0]) != 1) {
				return true;
			}
			if (y == 2 && Math.abs(i - roats[1][1]) != 1 && Math.abs(i - roats[1][2]) != 1
					&& Math.abs(i - roats[1][3]) != 1 && Math.abs(i - roats[2][1]) != 1) {
				return true;
			}
			return false;
		}
		return false;
	}

}
