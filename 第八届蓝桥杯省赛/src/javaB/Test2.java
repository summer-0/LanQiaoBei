package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 标题：纸牌三角形
	A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
	下图就是一种排法（如有对齐问题，参看p1.png）。
	      A
	     9 6
	    4   8
	   3 7 5 2
	这样的排法可能会有很多。
	如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
	请你计算并提交该数字。
	
	
	
	解题思路：把九张牌想成是一个1-9的数组，利用全排列，4个数字为一组，三组数字和相同则符合条件。
          排除旋转、镜像后相同的方法：只要保证三个角上（下标 0 3 6）的数字组合不同，例如实例中三个角为1 2 3，
          则当三个角为123时有六种排法（123，132，213，231，312，321）算同一种，所以只需将全排列符合的答案除以6即可得出答案。


 * @author 49944
 *
 */
public class Test2 {
    
	private static int count;
	public static void main(String[] args) {
        count = 0;	
        String[] str = new String[]{"1","2","3","4","5","6","7","8","9"};
        List<String> asList = Arrays.asList(str);
        long start = System.currentTimeMillis();
        allList(asList, "");
        System.out.println(count/6);
        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
	}
    public static void allList(List asList, String str){
    	if(asList.isEmpty()){
    		char[] charArray = str.toCharArray();
    		int array[] = new int[charArray.length];
    		for(int i=0; i<charArray.length; i++){
    			String string = Character.toString(charArray[i]);
    			array[i] = Integer.parseInt(string);
    		}
    		//System.out.println(str);
    		int s1 = array[0] + array[1]+array[2]+array[3];
    		int s2 = array[3] + array[4]+array[5]+array[6];
    		int s3 = array[6] + array[7]+array[8]+array[0];
    		if(s1==s2 && s2==s3 && s1==s3){
    			count++;
    		}
    	}
    	for(int i=0; i<asList.size(); i++){
    		List temp = new ArrayList(asList);
    		allList(temp, str+temp.remove(i));
    	}
    }
}
