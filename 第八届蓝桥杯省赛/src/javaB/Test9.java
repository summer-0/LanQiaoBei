package javaB;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���ɿ��� ��ͯ��������KλС���ѵ�С�������͡�С���ó�����ص��ɿ����д�С�����ǡ�
 *  С��һ����N���ɿ��������е�i����Hi x Wi�ķ�����ɵĳ����Ρ�
 * Ϊ�˹�ƽ�����С����Ҫ���� N ���ɿ������г�K���ɿ����ָ�С�����ǡ�
 * �г����ɿ�����Ҫ���㣺 1. ��״�������Σ��߳������� 2. ��С��ͬ
 * ����һ��6x5���ɿ��������г�6��2x2���ɿ�������2��3x3���ɿ����� 
 * ��ȻС�����Ƕ�ϣ���õ����ɿ��������ܴ����ܰ�СHi��������ı߳��Ƕ���ô��
 * ���� ��һ�а�����������N��K��(1 <= N, K <= 100000) 
 * ����N��ÿ�а�����������Hi��Wi��(1 <= Hi, Wi <=100000) 
 * ���뱣֤ÿλС���������ܻ��һ��1x1���ɿ����� 
 * ��� ����г����������ɿ��������ܵı߳���
 * 
 * �������룺 
 * 2 10 
 * 6 5 
 * 5 6
 * ��������� 2
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
