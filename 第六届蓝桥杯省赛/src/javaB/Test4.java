package javaB;

import java.util.Vector;

/**
 * ѭ���ڳ���
	������������������ʱ�����ѭ��С������ѭ�����ֳ�Ϊ��ѭ���ڡ�
	���磬11/13=6=>0.846153846153.....  ��ѭ����Ϊ[846153] ����6λ��
	����ķ������������ѭ���ڵĳ��ȡ�
	����ϸ�Ķ����룬����д���߲���ȱ�ٵĴ��롣
		public static int f(int n, int m)
		{
			n = n % m;	
			Vector v = new Vector();
			
			for(;;)
			{
				v.add(n);
				n *= 10;
				n = n % m;
				if(n==0) return 0;
				if(v.indexOf(n)>=0)  _________________________________ ;  //���
			}
		}
 * @author 49944
 *
 */
public class Test4 {

	public static void main(String[] args){
		//System.out.println(50%13);
		System.out.println(f(11, 13));
	}
	public static int f(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();
		
		for(;;)
		{
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0)  return v.size()-v.indexOf(n);  //���
		}
	}

}
