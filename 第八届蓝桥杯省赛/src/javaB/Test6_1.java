package javaB;
/**
 * ���⣺��󹫹��Ӵ�
	��󹫹��Ӵ�����������ǣ�
	���������������Ӵ����ܹ�ƥ���ϵ���󳤶��Ƕ��١�
	���磺"abcdkkk" �� "baabcdadabc"��
	�����ҵ�����Ĺ����Ӵ���"abcd",������󹫹��Ӵ�����Ϊ4��
	����ĳ����ǲ��þ��󷨽������ģ���Դ��Ĺ�ģ�����������ǱȽ���Ч�Ľⷨ��
	������ýⷨ��˼·������ȫ���߲���ȱʧ�Ĵ��롣
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
						a[i][j] = __________________;  //��� 
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
					a[i][j] = a[i-1][j-1]+1;  //���   ������Խ����������������  ������һ�������Ͻǵ�λ��
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
