package javaB;

import java.util.Scanner;

/**
 * k������
	����һ������ΪN�����У�A1, A2, ... AN���������һ��������������Ai, Ai+1, ... Aj(i <= j)֮����K�ı��������Ǿͳ��������[i, j]��K�����䡣  
	��������������ܹ��ж��ٸ�K��������  
	����
	-----
	��һ�а�����������N��K��(1 <= N, K <= 100000)  
	����N��ÿ�а���һ������Ai��(1 <= Ai <= 100000)  
	���
	-----
	���һ������������K���������Ŀ��  
	���磬
	���룺
	5 2
	1  
	2  
	3  
	4  
	5  
	����Ӧ�������
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
