package javaB;

import java.util.LinkedList;
import java.util.Queue;

/**加法变乘法
	我们都知道：1+2+3+ ... + 49 = 1225
	现在要求你把其中两个不相邻的加号变成乘号，使得结果为2015
	比如：
	1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015
	就是符合要求的答案。
	请你寻找另外一个可能的答案，并把位置靠前的那个乘号左边的数字提交（对于示例，就是提交10）。
 * 
 * @author 49944
 *
 */
public class Test6 {

	public static void main(String[] args) {
        int k = 1225;
        int sum = 0;
		for(int i=1; i<=49; i++){
			for(int j=i; j<=49; j++){
				int temp = i*(i+1) + j*(j+1);
				if(k-(i+i+1)-(j+j+1)+temp == 2015){
					System.out.println("i:"+i+"  j:"+j);
					//return;
				}
			}
		}
	}

}
