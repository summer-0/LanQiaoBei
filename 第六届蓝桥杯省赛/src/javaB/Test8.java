package javaB;

import java.util.Scanner;

/**
 * ���ϻ���
	���������ϳ����ھٰ�һ�δ����Żݻ��������C�����ϣ�ƾ3��ƿ�ǿ����ٻ�һƿC�����ϣ����ҿ���һֱѭ����ȥ�������������ˡ�
	�������һ�£����С�����˷�ƿ�ǣ������زμӻ����ô����������ʼ�����nƿ���ϣ������һ���ܵõ�����ƿ���ϡ�
	���룺һ������n����ʾ��ʼ���������������0<n<10000��
	�����һ����������ʾʵ�ʵõ���������
	���磺
	�û����룺
	100
	����Ӧ�������
	149
	�û����룺
	101
	����Ӧ�������
	151
 * @author 49944
 *
 */
public class Test8 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        for(int i=1; i<=n; i++){
        	if(i%3 == 0){
        		n++;
        	}
        }
        System.out.println(n);
	}

}
