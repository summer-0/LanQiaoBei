package javaB;

import java.util.Scanner;

/**
 * 饮料换购
	乐羊羊饮料厂正在举办一次促销优惠活动。乐羊羊C型饮料，凭3个瓶盖可以再换一瓶C型饮料，并且可以一直循环下去，但不允许赊账。
	请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，那么，对于他初始买入的n瓶饮料，最后他一共能得到多少瓶饮料。
	输入：一个整数n，表示开始购买的饮料数量（0<n<10000）
	输出：一个整数，表示实际得到的饮料数
	例如：
	用户输入：
	100
	程序应该输出：
	149
	用户输入：
	101
	程序应该输出：
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
