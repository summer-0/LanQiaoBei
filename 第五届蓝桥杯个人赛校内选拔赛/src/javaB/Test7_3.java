package javaB;

import java.util.Scanner;
import java.util.Vector;

public class Test7_3 {
	//���ڵ���
    static class Node {
        Vector<Integer> vector = new Vector<Integer>();//ÿ���ڵ�������ڵ㼯��
        int[] dp = new int[2];//ÿ���ڵ㶼��ȥ�벻ȥ����״̬
    }

    static Node node[];//���ṹ

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        node = new Node[N + 1];
        //���ڵ�ĳ�ʼ��
        for (int i = 1; i < node.length; i++) {
            node[i] = new Node();
            node[i].dp[0] = 1;
            node[i].dp[1] = 1;
        }

        for (int i = 2; i < node.length; i++) {
            int m = input.nextInt();//m�ǽڵ�i��ֱ���ϼ�
            node[m].vector.add(i);//��m�ڵ���¼����������i
        }

        for (int i = N; i > 0; i--) {
            int sum = node[i].vector.size();//����������� 
            for (int j = 0; j < sum; j++) {
                int son = node[i].vector.get(j);
                node[i].dp[1] *= node[son].dp[0];
                node[i].dp[0] *= (node[son].dp[0] + node[son].dp[1]);
                node[i].dp[1] %= 10007;
                node[i].dp[0] %= 10007;
            }
        }
        // ��ȥ�����˶�û��ȥ�����
        int result = (node[1].dp[0] + node[1].dp[1] - 1) % 10007;
        System.out.println(result);
    }
}
