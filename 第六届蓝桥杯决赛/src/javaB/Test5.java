package javaB;

import java.text.DecimalFormat;
import java.util.Scanner;

/**表格计算
	某次无聊中， atm 发现了一个很老的程序。这个程序的功能类似于 Excel ，它对一个表格进行操作。
	不妨设表格有 n 行，每行有 m 个格子。
	每个格子的内容可以是一个正整数，也可以是一个公式。
	公式包括三种：
	1. SUM(x1,y1:x2,y2) 表示求左上角是第 x1 行第 y1 个格子，右下角是第 x2 行第 y2 个格子这个矩形内所有格子的值的和。
	2. AVG(x1,y1:x2,y2) 表示求左上角是第 x1 行第 y1 个格子，右下角是第 x2 行第 y2 个格子这个矩形内所有格子的值的平均数。
	3. STD(x1,y1:x2,y2) 表示求左上角是第 x1 行第 y1 个格子，右下角是第 x2 行第 y2 个格子这个矩形内所有格子的值的标准差。
	标准差即为方差的平方根。
	方差就是：每个数据与平均值的差的平方的平均值，用来衡量单个数据离开平均数的程度。
	公式都不会出现嵌套。
	如果这个格子内是一个数，则这个格子的值等于这个数，否则这个格子的值等于格子公式求值结果。
	输入这个表格后，程序会输出每个格子的值。atm 觉得这个程序很好玩，他也想实现一下这个程序。
	「输入格式」
	第一行两个数 n, m 。
	接下来 n 行输入一个表格。每行 m 个由空格隔开的字符串，分别表示对应格子的内容。
	输入保证不会出现循环依赖的情况，即不会出现两个格子 a 和 b 使得 a 的值依赖 b 的值且 b 的值依赖 a 的值。
	「输出格式」
	输出一个表格，共 n 行，每行 m 个保留两位小数的实数。
	数据保证不会有格子的值超过 1e6 。
	「样例输入」
	3 2
	1 SUM(2,1:3,1)
	2 AVG(1,1:1,2)
	SUM(1,1:2,1) STD(1,1:2,2)
	「样例输出」
	1.00 5.00
	2.00 3.00
	3.00 1.48
 * 
 * @author 49944
 *
 */
public class Test5 {
    private static double[][] arrays;
	private static int n; //行
	private static int m; //列
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
				if(str[i][j].length() >= 5 && str[i][j].charAt(3) == '('){ //判断是否是公式
					//转换为 数字
					getDouble(str[i][j], i, j);
				}else{
				    //不是公式
				    arrays[i][j] = Integer.parseInt(str[i][j]);
				}
			}
		}
	}
	
	private static void getDouble(String string, int i, int j){
		if(string.charAt(3) == '('){ //判断是否是公式
			//转换为 数字  SUM(2,1:3,1)  AVG(1,1:1,2) STD(1,1:2,2)
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
		    //不是公式
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
		ss = m / ( (x2-x1+1)*(y2-y1+1) ); // 方差
		return Math.sqrt(ss);
	}

}
