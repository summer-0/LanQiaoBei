package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 反幻方
	我国古籍很早就记载着
	2 9 4
	7 5 3
	6 1 8
	这是一个三阶幻方。每行每列以及对角线上的数字相加都相等。
	下面考虑一个相反的问题。
	可不可以用 1~9 的数字填入九宫格。
	使得：每行每列每个对角线上的数字和都互不相等呢？
	这应该能做到。
	比如：
	9 1 2
	8 4 3
	7 5 6
	你的任务是搜索所有的三阶反幻方。并统计出一共有多少种。
	旋转或镜像算同一种。
	比如：
	9 1 2
	8 4 3
	7 5 6
	
	7 8 9
	5 4 1
	6 3 2
	
	2 1 9
	3 4 8
	6 5 7
	等都算作同一种情况。
	请提交三阶反幻方一共多少种。这是一个整数，不要填写任何多余内容。
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
        
        System.out.println(count/8);  //因为有每个有8种重复（旋转一下）
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
			//开始判断每行每列每个对角线上的数字和都互不相等
			int s1 = array[0][0] + array[0][1] + array[0][2] ; //第一行
			int s2 = array[1][0] + array[1][1] + array[1][2] ; //第二行
			int s3 = array[2][0] + array[2][1] + array[2][2] ; //第三行
			int h1 = array[0][0] + array[1][0] + array[2][0] ; //第一列
			int h2 = array[0][1] + array[1][1] + array[2][1] ; //第一列
			int h3 = array[0][2] + array[1][2] + array[2][2] ; //第一列
			int x1 = array[0][0] + array[1][1] + array[2][2];  //斜对角
			int x2 = array[2][0] + array[1][1] + array[0][2];  //斜对角
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
