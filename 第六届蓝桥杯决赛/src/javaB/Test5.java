package javaB;

import java.text.DecimalFormat;
import java.util.Scanner;

/**������
	ĳ�������У� atm ������һ�����ϵĳ����������Ĺ��������� Excel ������һ�������в�����
	���������� n �У�ÿ���� m �����ӡ�
	ÿ�����ӵ����ݿ�����һ����������Ҳ������һ����ʽ��
	��ʽ�������֣�
	1. SUM(x1,y1:x2,y2) ��ʾ�����Ͻ��ǵ� x1 �е� y1 �����ӣ����½��ǵ� x2 �е� y2 ������������������и��ӵ�ֵ�ĺ͡�
	2. AVG(x1,y1:x2,y2) ��ʾ�����Ͻ��ǵ� x1 �е� y1 �����ӣ����½��ǵ� x2 �е� y2 ������������������и��ӵ�ֵ��ƽ������
	3. STD(x1,y1:x2,y2) ��ʾ�����Ͻ��ǵ� x1 �е� y1 �����ӣ����½��ǵ� x2 �е� y2 ������������������и��ӵ�ֵ�ı�׼�
	��׼�Ϊ�����ƽ������
	������ǣ�ÿ��������ƽ��ֵ�Ĳ��ƽ����ƽ��ֵ�������������������뿪ƽ�����ĳ̶ȡ�
	��ʽ���������Ƕ�ס�
	��������������һ��������������ӵ�ֵ���������������������ӵ�ֵ���ڸ��ӹ�ʽ��ֵ�����
	����������󣬳�������ÿ�����ӵ�ֵ��atm �����������ܺ��棬��Ҳ��ʵ��һ���������
	�������ʽ��
	��һ�������� n, m ��
	������ n ������һ�����ÿ�� m ���ɿո�������ַ������ֱ��ʾ��Ӧ���ӵ����ݡ�
	���뱣֤�������ѭ������������������������������ a �� b ʹ�� a ��ֵ���� b ��ֵ�� b ��ֵ���� a ��ֵ��
	�������ʽ��
	���һ����񣬹� n �У�ÿ�� m ��������λС����ʵ����
	���ݱ�֤�����и��ӵ�ֵ���� 1e6 ��
	���������롹
	3 2
	1 SUM(2,1:3,1)
	2 AVG(1,1:1,2)
	SUM(1,1:2,1) STD(1,1:2,2)
	�����������
	1.00 5.00
	2.00 3.00
	3.00 1.48
 * 
 * @author 49944
 *
 */
public class Test5 {
    private static double[][] arrays;
	private static int n; //��
	private static int m; //��
	private static String[][] strs;
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       n = scan.nextInt();
       m = scan.nextInt();
       arrays = new double[n][m];
       strs = new String[3][2];
       for(int i=0; i<3; i++){
    	   for(int j=0; j<2; j++){
    		   strs[i][j] = scan.next();
    	   }
       }
      /* DecimalFormat format = new DecimalFormat("0.00");
       String format2 = format.format(12.1);
       System.out.println(format2);*/
       getInteger(strs);
       for(int i=0; i<3; i++){
    	   for(int j=0; j<2; j++){
    		   System.err.print(strs[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

	private static void getInteger(String[][] str) {
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(str[i][j].length() >= 5 && str[i][j].charAt(3) == '('){ //�ж��Ƿ��ǹ�ʽ
					//ת��Ϊ ����
					getDouble(str[i][j], i, j);
				}else{
				    //���ǹ�ʽ
				    arrays[i][j] = Integer.parseInt(str[i][j]);
				}
			}
		}
	}
	
	private static void getDouble(String string, int i, int j){
		if(string.charAt(3) == '('){ //�ж��Ƿ��ǹ�ʽ
			//ת��Ϊ ����  SUM(2,1:3,1)  AVG(1,1:1,2) STD(1,1:2,2)
			String s1 = string.substring(4, string.length()-2);
			String[] two = s1.split(":");
			String[] left = two[0].split(",");
			String[] right = two[1].split(",");
			int x1 = Integer.parseInt(left[0]);
			int y1 = Integer.parseInt(left[1]);
			int x2 = Integer.parseInt(right[0]);
			int y2 = Integer.parseInt(right[1]);
			if(string.startsWith("SUM")){
				strs[i][j] = sum(x1, y1, x2, y2)+"";
				arrays[i][j] = sum(x1, y1, x2, y2);
			}
			if(string.startsWith("AVG")){
				strs[i][j] = avg(x1, y1, x2, y2)+"";
				arrays[i][j] = avg(x1, y1, x2, y2);
			}
			if(string.startsWith("STD")){
				strs[i][j] = std(x1, y1, x2, y2)+"";
				arrays[i][j] = std(x1, y1, x2, y2);
			}
		}else{
		    //���ǹ�ʽ
		    arrays[i][j] = Integer.parseInt(string);
		}
	}
	
	
	private static double sum(int x1, int y1, int x2, int y2){
		double sum = 0;
		for(int i=x1-1; i<=x2-1; i++){
			for(int j=y1-1; j<=y2-1; j++){
				sum = sum + arrays[i][j];
			}
		}
		return sum;
	}
	private static double avg(int x1, int y1, int x2, int y2){
		double sum = 0;
		double avg = 0;
		for(int i=x1-1; i<=x2-1; i++){
			for(int j=y1-1; j<=y2-1; j++){
				sum = sum + arrays[i][j];
			}
		}
		avg = sum / ( (x2-x1+1)*(y2-y1+1) );
		return avg;
	}
	private static double std(int x1, int y1, int x2, int y2){
		double avg = avg(x1, y1, x2, y2);
		double m = 0;
		double ss = 0;
		for(int i=x1-1; i<=x2-1; i++){
			for(int j=y1-1; j<=y2-1; j++){
				m = m + (arrays[i][j]-avg)*(arrays[i][j]-avg);
			}
		}
		ss = m / ( (x2-x1+1)*(y2-y1+1) ); // ����
		return Math.sqrt(ss);
	}

}
