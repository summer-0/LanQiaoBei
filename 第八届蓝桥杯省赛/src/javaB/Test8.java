package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ���Ӵ���
С������ÿ���糿������һ�Ұ����̳���͡���������Ұ�������N�����������е�i������ǡ���ܷ�Ai�����ӡ�ÿ���������зǳ�������������Ϊ����������
ÿ���й˿�����X�����ӣ������ӵĴ���ͻ�Ѹ��ѡ����������������ʹ������������ǡ��һ����X�����ӡ�����һ����3���������ֱ��ܷ�3��4��5�����ӡ�
���˿�����11������ʱ������ͻ�ѡ2��3�����ټ�1��5���ģ�Ҳ����ѡ��1��3�����ټ�2��4���ģ���
��Ȼ��ʱ���Ӵ����������Ҳ�ղ����˿����������������һ����3���������ֱ��ܷ�4��5��6�����ӡ����˿�����7������ʱ������ʹղ������ˡ�
С����֪��һ���ж�������Ŀ�ǰ��Ӵ���ղ������ġ�
����
----
��һ�а���һ������N��(1 <= N <= 100)
����N��ÿ�а���һ������Ai��(1 <= Ai <= 100)  
���
----
һ����������𰸡�����ղ�������Ŀ�����޶�������INF��
���磬
���룺
2  
4  
5   
����Ӧ�������
6  
�����磬
���룺
2  
4  
6    
����Ӧ�������
INF
�������ͣ�
��������1���ղ�������Ŀ������1, 2, 3, 6, 7, 11��  
��������2�������������ղ����������������޶����
 * @author 49944
 *
 */
public class Test8 {

	private static int[] arrays;
	private static boolean isVisted = false;
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        arrays = new int[N];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //�����ƽ�
        for(int i=0; i<N; i++){
        	arrays[i] = scan.nextInt();
        }
        for(int i=1; i<1000; i++){
        	getCount(i);
        	if(!isVisted){
        		arrayList.add(i);
        	}
        	isVisted = false;
        }
        for(int i=0; i<arrayList.size(); i++){
        	System.out.print(arrayList.get(i)+" ");
        }
        
	}
	public static void getCount(int i){
		for(int m=0; m<i; m++){
    		for(int n=0; n<i; n++){
    			for(int k=0; k<i; k++){
    				if(arrays[0]*m + arrays[1]*n + arrays[2]*k == i){
    					isVisted = true;
    					return;
    				}
    			}
    		}
    	}
	}

}
