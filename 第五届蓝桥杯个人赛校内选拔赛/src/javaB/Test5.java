package javaB;

import java.util.Scanner;

/**
 * 勾股定理，西方称为毕达哥拉斯定理，它所对应的三角形现在称为：直角三角形。
	  已知直角三角形的斜边是某个整数，并且要求另外两条边也必须是整数。
	  求满足这个条件的不同直角三角形的个数。
	【数据格式】
	输入一个整数 n (0<n<10000000) 表示直角三角形斜边的长度。
	要求输出一个整数，表示满足条件的直角三角形个数。
	例如，输入：
	5
	程序应该输出：
	1
	再例如，输入：
	100
	程序应该输出：
	2
	再例如，输入：
	3
	程序应该输出：
	0
 * @author 49944
 *
 */
public class Test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //斜边长度
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
