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
     *            ʿ������
     * @param s
     *            ���2-nʿ����ֱ���ϼ�
     */
    public static void getResult(int index, int n, int[] s) {
        if (index == n) {// �����յ�
            if (a.size() != 0) {// ջ����Ϊ�գ�Ҳ���ǲ��ܶ���ȥ
                sum++;
            }
            return;
        }
        if (a.contains((Integer) s[index])) { //��������
            getResult(index + 1, n, s);
        } else {
            getResult(index + 1, n, s);// ��ȥ
            a.add(index + 1);// ����ջ������ȥ
            getResult(index + 1, n, s);// ȥ
            a.remove(a.size() - 1);// ÿ��һ��������󣬴Ӻ���ǰ��ջ����ֹӰ���������
        }
    }
}
