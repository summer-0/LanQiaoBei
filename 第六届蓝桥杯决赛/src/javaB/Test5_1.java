package javaB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test5_1 {
	public static String[][] input;
	public static double[][] output;
	public static boolean[][] flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		input = new String[n + 1][m + 1];
		flag = new boolean[n + 1][m + 1];
		output = new double[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				input[i][j] = scan.next();
				int temp = input[i][j].charAt(0);
				if (temp >= 48 && temp <= 57) { //判断是字符还是数字
					flag[i][j] = true;
					output[i][j] = Double.valueOf(input[i][j]);
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (!flag[i][j])
					func(input[i][j], i, j);
			}
		}
		DecimalFormat format = new DecimalFormat("0.00");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(format.format(output[i][j]) + " ");
			}
			System.out.println();
		}
	}

	private static Double func(String input, int i, int j) {
		if (input.startsWith("SUM")) {
			if (flag[i][j]) {
				return output[i][j];
			} else {
				output[i][j] = sum(input.charAt(4) - 48, input.charAt(6) - 48, input.charAt(8) - 48,
						input.charAt(10) - 48);
				flag[i][j] = !flag[i][j];
				return output[i][j];
			}
		} else if (input.startsWith("AVG")) {
			if (flag[i][j]) {
				return output[i][j];
			} else {
				output[i][j] = avg(input.charAt(4) - 48, input.charAt(6) - 48, input.charAt(8) - 48,
						input.charAt(10) - 48);
				flag[i][j] = !flag[i][j];
				return output[i][j];
			}
		} else {
			if (flag[i][j]) {
				return output[i][j];
			} else {
				output[i][j] = std(input.charAt(4) - 48, input.charAt(6) - 48, input.charAt(8) - 48,
						input.charAt(10) - 48);
				flag[i][j] = !flag[i][j];
				return output[i][j];
			}
		}
	}

	private static double std(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		double avg = avg(x1, y1, x2, y2);
		double temp = 0;
		int count = 0;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				temp += Math.pow((func(input[i][j], i, j) - avg), 2);
				count++;
			}
		}
		return Math.sqrt(temp / count);
	}

	private static double avg(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		double temp = 0;
		int count = 0;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				temp += func(input[i][j], i, j);
				count++;
			}
		}
		return temp / count;
	}

	private static double sum(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		double temp = 0;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				if (flag[i][j]) {
					temp += output[i][j];
				} else {
					temp += func(input[i][j], i, j);
				}
			}
		}
		return temp;
	}
}
