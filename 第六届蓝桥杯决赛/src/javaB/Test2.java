package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��������
	�硾ͼ1.png��������ͼ���ڵ��������֣�1~12����ȥ7��11��
	Ҫ��ÿ��ֱ�������ֺ���ȡ�
	��ͼ����ǡ�������
	�������ü�����������п��ܵ���ж����֡�
	ע�⣺��ת�������ͬ����ͬһ�����
 * @author 49944
 *
 */
public class Test2 {

	private static int count;
/**
 * �˷�������
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
