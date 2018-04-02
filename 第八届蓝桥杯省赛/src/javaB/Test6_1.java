package javaB;
/**
 * 标题：最大公共子串
	最大公共子串长度问题就是：
	求两个串的所有子串中能够匹配上的最大长度是多少。
	比如："abcdkkk" 和 "baabcdadabc"，
	可以找到的最长的公共子串是"abcd",所以最大公共子串长度为4。
	下面的程序是采用矩阵法进行求解的，这对串的规模不大的情况还是比较有效的解法。
	请分析该解法的思路，并补全划线部分缺失的代码。
	public class Main
	{
		static int f(String s1, String s2)
		{
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			int[][] a = new int[c1.length+1][c2.length+1];
			int max = 0;
			for(int i=1; i<a.length; i++){
				for(int j=1; j<a[i].length; j++){
					if(c1[i-1]==c2[j-1]) {
						a[i][j] = __________________;  //填空 
						if(a[i][j] > max) max = a[i][j];
					}
				}
			}
			return max;
		}
		public static void main(String[] args){
			int n = f("abcdkkk", "baabcdadabc");
			System.out.println(n);
		}
	}
 * @author 49944
 *
 */
public class Test6_1 {
/**
 *                     a b c d e f x z
 *                   m 0 0 0 0 0 0 0 0  
 *                   a 1 0 0 0 0 0 0 0
 * @param s1         b 0 2 0 0 0 0 0 0 
 * @param s2         c 0 0 3 0 0 0 0 0  max
 * @return           f 0 0 0 0 0 1 0 0 
 *                   e 0 0 0 0 1 0 0 0
 */
	static int f(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int[][] a = new int[c1.length+1][c2.length+1];
		int max = 0;
		for(int i=1; i<a.length; i++){
			for(int j=1; j<a[i].length; j++){
				if(c1[i-1]==c2[j-1]) {
					a[i][j] = a[i-1][j-1]+1;  //填空   这里可以解决连不连续的问题  连续的一定是左上角的位置
					if(a[i][j] > max) max = a[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args){
		int n = f("abcdkkk", "baabcdadabc");
		System.out.println(n);
	}

}
