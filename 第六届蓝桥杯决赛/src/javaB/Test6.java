package javaB;

import java.util.Scanner;

/**�̴�ש
	Ϊ�������ű�������˳���Ľ��У����췽�����������Ļ��������̷Ŵ�ש���������Կ���һ��n*m�ľ��Σ������ʹ�õĴ�ש�Ƚ��ر���������״��
	�硾ͼ1.png����ʾ�����̷Ŵ�שʱ��������ת�����췽��֪�������ʹ�������ִ�ש�ѻ����������ж����ַ�����
	�������ʽ��
	����ĵ�һ�а��������������ֱ��ʾ������������ĳ��ȡ�
	�������ʽ��
	���һ����������ʾ���еķ���������������ܴܺ���������������65521��������
	����������1��
	4 4
	���������1��
	2
	������˵��1��
	�����ַ������¡�ͼ2.png����ʾ��
	����������2��
	2 6
	���������2��
	4
	�����ݹ�ģ��Լ����
	����20%�����ݣ�1<=n, m<=5��
	����50%�����ݣ�1<=n<=100��1<=m<=5��
	����100%�����ݣ�1<=n<=10^15��1<=m<=6��
 * 
 * @author 49944
 *
 */

public class Test6 {

	private static int n;
	private static int m;
	private static int arrays[][];
	private static boolean isVisted[][];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); 
		m = scan.nextInt();
		arrays = new int[n][m];
		isVisted = new boolean[n][m];
	}

}
