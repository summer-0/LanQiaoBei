package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ���⣺ֽ��������
	A,2,3,4,5,6,7,8,9 ��9��ֽ���ų�һ���������Σ�A��1���㣩��Ҫ��ÿ���ߵĺ���ȡ�
	��ͼ����һ���ŷ������ж������⣬�ο�p1.png����
	      A
	     9 6
	    4   8
	   3 7 5 2
	�������ŷ����ܻ��кܶࡣ
	���������ת���������ͬ����ͬһ�֣�һ���ж����ֲ�ͬ���ŷ��أ�
	������㲢�ύ�����֡�
	
	
	
	����˼·���Ѿ����������һ��1-9�����飬����ȫ���У�4������Ϊһ�飬�������ֺ���ͬ�����������
          �ų���ת���������ͬ�ķ�����ֻҪ��֤�������ϣ��±� 0 3 6����������ϲ�ͬ������ʵ����������Ϊ1 2 3��
          ��������Ϊ123ʱ�������ŷ���123��132��213��231��312��321����ͬһ�֣�����ֻ�轫ȫ���з��ϵĴ𰸳���6���ɵó��𰸡�


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
