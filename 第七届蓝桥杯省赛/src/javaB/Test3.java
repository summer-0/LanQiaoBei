package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
private static int count;
/**
 * 
	凑算式
	     B      DEF
	A + --- + ------- = 10
	     C      GHI
	（如果显示有问题，可以参见【图1.jpg】）
	这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。
	比如：
	6+8/3+952/714 就是一种解法，
	5+3/1+972/486 是另一种解法。
	这个算式一共有多少种解法？
	注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
 * @param args
 */
	
	public static void main(String[] args) {
		
       // int a[] = new int[]{1,2,3,4,5,6,7,8,9};//有  n! 种不同排序
        String[] array = new String[]{
                "1","2","3","4","5","6","7","8","9"
        };
        count = 0;
       
       listAll(Arrays.asList(array),"");
       System.out.println(count);
       System.out.println((1*2*3*4*5*6*7*8*9));
	}

	private static void listAll(List asList, String string) {
        if(asList.isEmpty()){
        	char[] charArray = string.toCharArray();
        	int a[] = new int[9];
        	for(int i=0; i<charArray.length; i++){
        		char ch = charArray[i];
        		String string2 = Character.toString(ch);
        		a[i] = Integer.parseInt(string2);
            }
           	if( (a[0] + a[1]/a[2] + (a[3]*100+a[4]*10+a[5])/(a[6]*100+a[7]*10+a[8]) ) == 10 ){
           		   // System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+a[5]+" "+a[6]+" "+a[7]+" "+a[8]);
                	count++;
            }
        }
        for (int i = 0; i < asList.size(); i++) {
        	List temp = new LinkedList(asList);
            //List temp = new  ArrayList(asList);
        	String remove = (String)temp.remove(i);
            //listAll(temp, string+temp.remove(i));
        	listAll(temp, string+remove);
        }
    }
}
