package javaB;

import java.util.ArrayList;
import java.util.Scanner;

public class Test7_1 {

	static ArrayList<Integer> a = new ArrayList<Integer>();  
	static int sum = 0;  
	public static void main(String[] args) {  
	    Scanner sc = new Scanner(System.in);  
	    int n = sc.nextInt();  
	    int[] s = new int[n];  
	    for (int i = 1; i < n; i++) {  
	        s[i] = sc.nextInt();  
	    }  
	    s(0,n,s);  
	    System.out.println(sum);  
	}  
	public static void s(int code,int n,int[] s){  
	    if(code==n){//�����յ�  
	        if(a.size()!=0){//ջ����Ϊ�գ�Ҳ���ǲ��ܶ���ȥ  
	            sum++;  
	        }  
	        return;  
	    }  
	    if(a.contains((Integer)s[code])){  
	        s(code+1,n,s);  
	    }else{  
	        s(code+1,n,s);//��ȥ  
	        a.add(code+1);//����ջ������ȥ  
	        s(code+1,n,s);//ȥ  
	        a.remove(a.size()-1);//ÿ��һ��������󣬴Ӻ���ǰ��ջ����ֹӰ���������  
	    }  
	}  
}
