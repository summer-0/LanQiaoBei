package javaB;

import java.util.Scanner;

/**
 * ���ɶ���������Ϊ�ϴ����˹����������Ӧ�����������ڳ�Ϊ��ֱ�������Ρ�
	  ��ֱ֪�������ε�б����ĳ������������Ҫ������������Ҳ������������
	  ��������������Ĳ�ֱͬ�������εĸ�����
	�����ݸ�ʽ��
	����һ������ n (0<n<10000000) ��ʾֱ��������б�ߵĳ��ȡ�
	Ҫ�����һ����������ʾ����������ֱ�������θ�����
	���磬���룺
	5
	����Ӧ�������
	1
	�����磬���룺
	100
	����Ӧ�������
	2
	�����磬���룺
	3
	����Ӧ�������
	0
 * @author 49944
 *
 */
public class Test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //б�߳���
        int count = 0;
        for(int i=1; i<n; i++){
        	for(int j=1; j<n; j++){
        		if(i*i + j*j == n*n){
        			//System.out.println(i+" "+j);
        			count++;
        		}
        	}
        }
        System.out.println(count/2); //
	}

}
