package javaB;
/**
 * ���⣺�ֻ���
	X�ϰ�Ƣ���Ź֣����ǹ�˾�ĵ绰�ֻ��Ŷ���3λ�����ϰ�涨�����к�������ǽ������У��Ҳ������ظ�����λ�����磺
	751,520,321 ������Ҫ�󣬶���
	766,918,201 �Ͳ�����Ҫ��
	�����������һ�£����������Ĺ涨��һ���ж��ٸ����õ�3λ�ֻ����룿
 * @author 49944
 *
 */
public class Test1 {

	public static void main(String[] args) {
		int sum = 0;
       for(int i=9; i>=2; i--){
    	   for(int j=i-1; j>=1; j--){
    		   for(int k=j-1; k>=0; k--){
    			   sum++;
    		   }
    	   }
       }
       System.out.println(sum);
	}

}
