package javaB;

import java.util.Scanner;
import java.util.Vector;

public class Test7_3 {
	//树节点类
    static class Node {
        Vector<Integer> vector = new Vector<Integer>();//每个节点的下属节点集合
        int[] dp = new int[2];//每个节点都有去与不去两种状态
    }

    static Node node[];//树结构

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        node = new Node[N + 1];
        //树节点的初始化
        for (int i = 1; i < node.length; i++) {
            node[i] = new Node();
            node[i].dp[0] = 1;
            node[i].dp[1] = 1;
        }

        for (int i = 2; i < node.length; i++) {
            int m = input.nextInt();//m是节点i的直接上级
            node[m].vector.add(i);//向m节点的下级集合中添加i
        }

        for (int i = N; i > 0; i--) {
            int sum = node[i].vector.size();//获得下属集合 
            for (int j = 0; j < sum; j++) {
                int son = node[i].vector.get(j);
                node[i].dp[1] *= node[son].dp[0];
                node[i].dp[0] *= (node[son].dp[0] + node[son].dp[1]);
                node[i].dp[1] %= 10007;
                node[i].dp[0] %= 10007;
            }
        }
        // 减去所有人都没有去的情况
        int result = (node[1].dp[0] + node[1].dp[1] - 1) % 10007;
        System.out.println(result);
    }
}
