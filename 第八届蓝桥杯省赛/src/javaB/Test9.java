package javaB;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 分巧克力 儿童节那天有K位小朋友到小明家做客。小明拿出了珍藏的巧克力招待小朋友们。
 *  小明一共有N块巧克力，其中第i块是Hi x Wi的方格组成的长方形。
 * 为了公平起见，小明需要从这 N 块巧克力中切出K块巧克力分给小朋友们。
 * 切出的巧克力需要满足： 1. 形状是正方形，边长是整数 2. 大小相同
 * 例如一块6x5的巧克力可以切出6块2x2的巧克力或者2块3x3的巧克力。 
 * 当然小朋友们都希望得到的巧克力尽可能大，你能帮小Hi计算出最大的边长是多少么？
 * 输入 第一行包含两个整数N和K。(1 <= N, K <= 100000) 
 * 以下N行每行包含两个整数Hi和Wi。(1 <= Hi, Wi <=100000) 
 * 输入保证每位小朋友至少能获得一块1x1的巧克力。 
 * 输出 输出切出的正方形巧克力最大可能的边长。
 * 
 * 样例输入： 
 * 2 10 
 * 6 5 
 * 5 6
 * 样例输出： 2
 * 
 * @author 49944
 *
 */
public class Test9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int array[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		
		int max[] = new int[N];
		int min[] = new int[N];
		int newMax[] = new int[N];
		
		int m[] = new int[20];
		for(int i=0; i<N; i++){
			max[i] = (int)Math.max(array[i][0], array[i][1]);
			min[i] = (int)Math.min(array[i][0], array[i][1]);
		}
		newMax = max;
		for(int hi = 1; hi<=max[0]; hi++){
			for(int wi = 1; wi<=min[0]; wi++){
				
			}
		}
		//
		Arrays.sort(newMax);
		for(int i=1; i<=newMax[N-1]; i++){
			int sum = 0;
			for(int j=0; j<N; j++){
				sum = sum + (max[j]/i) *(min[j]/i);
			}
			if(sum >= K){
				m[i] = i;
			}
		}
		Arrays.sort(m);
		System.out.println(m[19]);
	}

}
