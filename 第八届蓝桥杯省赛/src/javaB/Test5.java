package javaB;
/**
 * ȡ��λ
��1�������ĵ�kλ�����кܶ��ַ�����
���µķ�������һ�֡�
public class Main
{
	static int len(int x){
		if(x<10) return 1;
		return len(x/10)+1;
	}
	// ȡx�ĵ�kλ����
	static int f(int x, int k){
		if(len(x)-k==0) return x%10;
		return ______________________;  //���
	}
	public static void main(String[] args)
	{
		int x = 23513;
		//System.out.println(len(x));
		System.out.println(f(x,3));
	}
}
������Ŀ�еĲ������ݣ�Ӧ�ô�ӡ5��
 * @author 49944
 *
 */
public class Test5 {
	static int length(int x){
		if(x<10){
			return 1;
		}
		return length(x/10)+1;
	}
	static int len(int x){           //�������һ������λ��
		if(x<10) return 1;
		return len(x/10)+1;
	}
	// ȡx�ĵ�kλ����
	static int f(int x, int k){
		if(len(x)-k==0) return x%10;
		return f(x/10,k);  //��� f(x/10,k)   x/((int)Math.pow(10, k-1)) % 10 
	}
	public static void main(String[] args) {
		int x = 23513;
		//System.out.println(len(x));
		System.out.println(f(x,3));
	}

}
