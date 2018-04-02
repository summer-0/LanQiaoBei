package javaB;

import java.util.Scanner;

/**
 * k倍区间
	给定一个长度为N的数列，A1, A2, ... AN，如果其中一段连续的子序列Ai, Ai+1, ... Aj(i <= j)之和是K的倍数，我们就称这个区间[i, j]是K倍区间。  
	你能求出数列中总共有多少个K倍区间吗？  
	输入
	-----
	第一行包含两个整数N和K。(1 <= N, K <= 100000)  
	以下N行每行包含一个整数Ai。(1 <= Ai <= 100000)  
	输出
	-----
	输出一个整数，代表K倍区间的数目。  
	例如，
	输入：
	5 2
	1  
	2  
	3  
	4  
	5  
	程序应该输出：
	6
 * @author 49944
 *
 */
public class Test10 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int array[] = new int[N];
        for(int i=0; i<N; i++){
        	array[i] = scan.nextInt();
        }
        int count=0;
        for(int i=0; i<N; i++){
        	int sum=0;
        	for(int j=i; j<N; j++){
        		
        		sum = sum + array[j];
        		if(sum % K == 0){
        			count++;
        		}
        	}
        }
        System.out.println(count);
	}

}
