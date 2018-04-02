package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 五星填数
	如【图1.png】的五星图案节点填上数字：1~12，除去7和11。
	要求每条直线上数字和相等。
	如图就是恰当的填法。
	请你利用计算机搜索所有可能的填法有多少种。
	注意：旋转或镜像后相同的算同一种填法。
 * @author 49944
 *
 */
public class Test2 {

	private static int count;
/**
 * 此方法不行
 * @param args
 */
	public static void main(String[] args) {
        String str[] = {"1","2","3","4","5","6","8","9","10","12"};  //"10 12" -->String   "1012"
        int[] array = {1,2,3,4,5,6,8,9,10,12};
        long start = System.currentTimeMillis();
        count = 0;
        //List asList = ;
        allList(Arrays.asList(str), "");
        System.out.println(count/10);
        long end = System.currentTimeMillis();
        System.out.println(end - start +"ms");
	}

	private static void allList(List asList, String string) {
		 if(asList.isEmpty()){
			 char[] charArray = string.toCharArray();
			 int array[] = new int[charArray.length];
			 //Character.toString(c);
			 for(int i=0; i<charArray.length; i++){
				 array[i] = Integer.parseInt(Character.toString(charArray[i]));
			 }
			 int s1 = array[0] + array[1] + array[3] + array[4];
			 int s2 = array[0] + array[9] + array[7] + array[6];
			 int s3 = array[2] + array[1] + array[9] + array[8];
			 int s4 = array[2] + array[3] + array[5] + array[6];
			 int s5 = array[4] + array[5] + array[7] + array[8];
			 if(s1==s2 && s1==s3 && s1==s4 && s1==s5 &&
					 s2==s3 && s2==s4 && s2==s5 &&
					 s3==s4 && s3==s5 &&
					 s4==s5){
				 count++;
				 
			 }
		 }
		 for(int i=0; i<asList.size(); i++){
			 List temp = new ArrayList(asList);
			 allList(temp, string+temp.remove(i));
		 }
	}

}
