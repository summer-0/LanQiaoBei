package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ���÷�
	�ҹ��ż�����ͼ�����
	2 9 4
	7 5 3
	6 1 8
	����һ�����׻÷���ÿ��ÿ���Լ��Խ����ϵ�������Ӷ���ȡ�
	���濼��һ���෴�����⡣
	�ɲ������� 1~9 ����������Ź���
	ʹ�ã�ÿ��ÿ��ÿ���Խ����ϵ����ֺͶ���������أ�
	��Ӧ����������
	���磺
	9 1 2
	8 4 3
	7 5 6
	����������������е����׷��÷�����ͳ�Ƴ�һ���ж����֡�
	��ת������ͬһ�֡�
	���磺
	9 1 2
	8 4 3
	7 5 6
	
	7 8 9
	5 4 1
	6 3 2
	
	2 1 9
	3 4 8
	6 5 7
	�ȶ�����ͬһ�������
	���ύ���׷��÷�һ�������֡�����һ����������Ҫ��д�κζ������ݡ�
 * @author 49944
 *
 */
public class Test2 {

	private static int count;
	public static void main(String[] args) {
        String[] str = {"1","2","3","4","5","6","7","8","9"};
        count = 0;
        List asList = Arrays.asList(str);
        allSortList(asList, "");
        
        System.out.println(count/8);  //��Ϊ��ÿ����8���ظ�����תһ�£�
	}
	public static void allSortList(List list, String str){
		if(list.isEmpty()){
			int array[][] = new int[3][3];
			int a[] = new int[str.length()];
			char[] charArray = str.toCharArray();
			for(int i=0; i<charArray.length; i++){
				String string = Character.toString(charArray[i]);
				a[i] = Integer.parseInt(string);
			}
			int k=0;
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					array[i][j] = a[k];
					k++;
				}
			}
			//��ʼ�ж�ÿ��ÿ��ÿ���Խ����ϵ����ֺͶ��������
			int s1 = array[0][0] + array[0][1] + array[0][2] ; //��һ��
			int s2 = array[1][0] + array[1][1] + array[1][2] ; //�ڶ���
			int s3 = array[2][0] + array[2][1] + array[2][2] ; //������
			int h1 = array[0][0] + array[1][0] + array[2][0] ; //��һ��
			int h2 = array[0][1] + array[1][1] + array[2][1] ; //��һ��
			int h3 = array[0][2] + array[1][2] + array[2][2] ; //��һ��
			int x1 = array[0][0] + array[1][1] + array[2][2];  //б�Խ�
			int x2 = array[2][0] + array[1][1] + array[0][2];  //б�Խ�
			if(s1!=s2 && s1!=s3 && s1!=h1 && s1!=h2 && s1!=h3 && s1!=x1 && s1!=x2 &&
					s2!=s3 && s2!=h1 && s2!=h2 && s2!=h3 && s2!=x1 && s2!=x2 &&
					s3!=h1 && s3!=h2 && s3!=h3 && s3!=x1 && s3!=x2 &&
					h1!=h2 && h1!=h3 && h1!=x1 && h1!=x2 &&
					h2!=h3 && h2!=x1 && h2!=x2 &&
					h3!=x1 && h3!=x2 &&
					x1!=x2
					){
				count++;
			}
		}
		for(int i=0; i<list.size(); i++){
			List temp = new ArrayList(list);
			allSortList(temp, str+temp.remove(i));
		}
	}

}
