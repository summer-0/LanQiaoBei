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
	    if(code==n){//到达终点  
	        if(a.size()!=0){//栈不能为空，也就是不能都不去  
	            sum++;  
	        }  
	        return;  
	    }  
	    if(a.contains((Integer)s[code])){  
	        s(code+1,n,s);  
	    }else{  
	        s(code+1,n,s);//不去  
	        a.add(code+1);//加入栈，代表去  
	        s(code+1,n,s);//去  
	        a.remove(a.size()-1);//每次一种情况过后，从后往前出栈，防止影响其他情况  
	    }  
	}  
}
