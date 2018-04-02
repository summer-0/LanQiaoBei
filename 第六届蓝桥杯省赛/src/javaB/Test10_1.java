package javaB;

import java.util.LinkedList;
import java.util.Scanner;

public class Test10_1 {
	public static int MAX = 1000010;
	public static int MIN = -1000010;
	public static int dp[][];
	public static int value[];
	public static LinkedList<Integer> list[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		value = new int[n + 1];  //每个节点的分数
		for (int i = 1; i <= n; i++) {
			value[i] = sc.nextInt();
		}
		list = new LinkedList[n + 1];
		for (int i = 1; i < list.length; i++) {
			list[i] = new LinkedList<Integer>();
		}
		dp = new int[n + 1][2];
		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = MIN;
			dp[i][1] = MIN;
		}
		for (int i = 1; i < n; i++) {    //////////////////用list[] 来保存类似“图”的关系
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		dfs(1, -1);
		System.out.println(dp[1][0]);
	}

	private static void dfs(int p, int fa) {
		dp[p][0] = Math.max(dp[p][0], value[p]);
		dp[p][1] = Math.max(dp[p][1], value[p]);

		for (int i = 0; i < list[p].size(); i++) {
			int son = list[p].get(i);
			if ((son ^ fa) != 0) {
				dfs(son, p);
				dp[p][0] = Math.max(dp[p][0], dp[son][0]);
				if (dp[son][1] > 0)
					dp[p][1] += dp[son][1];
			}
		}
		dp[p][0] = Math.max(dp[p][0], dp[p][1]);
	}

}
