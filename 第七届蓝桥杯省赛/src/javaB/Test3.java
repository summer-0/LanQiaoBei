package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
private static int count;
/**
 * 
	����ʽ
	     B      DEF
	A + --- + ------- = 10
	     C      GHI
	�������ʾ�����⣬���Բμ���ͼ1.jpg����
	�����ʽ��A~I����1~9�����֣���ͬ����ĸ����ͬ�����֡�
	���磺
	6+8/3+952/714 ����һ�ֽⷨ��
	5+3/1+972/486 ����һ�ֽⷨ��
	�����ʽһ���ж����ֽⷨ��
	ע�⣺���ύӦ���Ǹ���������Ҫ��д�κζ�������ݻ�˵�������֡�
 * @param args
 */
	
	public static void main(String[] args) {
		
       // int a[] = new int[]{1,2,3,4,5,6,7,8,9};//��  n! �ֲ�ͬ����
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
