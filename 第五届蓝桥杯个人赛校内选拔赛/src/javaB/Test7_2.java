package javaB;

import java.util.ArrayList;
import java.util.Scanner;

public class Test7_2 {
	static ArrayList<Integer> a = new ArrayList<Integer>();
    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 1; i < n; i++) {
            s[i] = sc.nextInt();
        }
        getResult(0, n, s);
        System.out.println(sum);
    }

    /**
     * 
     * @param index
     * @param n
     *            士兵总数
     * @param s
     *            存放2-n士兵的直接上级
     */
    public static void getResult(int index, int n, int[] s) {
        if (index == n) {// 到达终点
            if (a.size() != 0) {// 栈不能为空，也就是不能都不去
                sum++;
            }
            return;
        }
        if (a.contains((Integer) s[index])) { //跳过本人
            getResult(index + 1, n, s);
        } else {
            getResult(index + 1, n, s);// 不去
            a.add(index + 1);// 加入栈，代表去
            getResult(index + 1, n, s);// 去
            a.remove(a.size() - 1);// 每次一种情况过后，从后往前出栈，防止影响其他情况
        }
    }
}
