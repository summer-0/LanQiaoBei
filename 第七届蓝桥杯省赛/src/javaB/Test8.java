package javaB;

import java.util.Scanner;

/**
 * ��ƽ����
	��ƽ���Ͷ����ֳ�Ϊ�������ն���
	ÿ�������������Ա�ʾΪ����4����������ƽ���͡�
	�����0������ȥ�������ÿ��Ա�ʾΪ4������ƽ���͡�
	���磺
	5 = 0^2 + 0^2 + 1^2 + 2^2
	7 = 1^2 + 1^2 + 1^2 + 2^2
	��^���ű�ʾ�˷�����˼��
	����һ�������������������ܴ��ڶ���ƽ���͵ı�ʾ����
	Ҫ�����4��������
	0 <= a <= b <= c <= d
	�������еĿ��ܱ�ʾ���� a,b,c,d Ϊ���������������У���������һ����ʾ��
	��������Ϊһ��������N (N<5000000)
	Ҫ�����4���Ǹ�����������С���������м��ÿո�ֿ�
	���磬���룺
	5
	�����Ӧ�������
	0 0 1 2
	�����磬���룺
	12
	�����Ӧ�������
	0 2 2 2
	�����磬���룺
	773535
	�����Ӧ�������
	1 1 267 838
 * @author 49944
 *
 */
public class Test8 {

	public static void main(String[] args) {
		int count=0;
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
        double sqrt = Math.sqrt(N);
        int m = (int) (sqrt);
        //long start = System.currentTimeMillis();
        //System.out.println(sqrt);
        getSerial(m, N);
        //long end = System.currentTimeMillis();
        //System.out.println(count);
        //System.out.println(end-start);
	}
	public static void getSerial(int m, int N){
		for(int d=1; d<=m; d++){
        	for(int c=0; c<=d; c++ ){
        		for(int b=0; b<=c; b++){
        			for(int a=0; a<=b; a++){
        				if(N == (a*a)+(b*b)+(c*c)+(d*d)){
        					System.out.print(a+" "+b+" "+c+" "+d);
        					return;
        				}
        			}
        		}
        	}
        }
	}

}
