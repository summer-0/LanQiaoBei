package javaB;
/**
 * ����������
	�۲����������,ĳ�����ֵ���������λ�ۼ���Ȼ��������
	1^3 = 1 
	8^3  = 512    5+1+2=8
	17^3 = 4913   4+9+1+3=17
	...
	����������1,8,17���ڣ�����������ʵ�������һ���ж��ٸ���
 * @author 49944
 *
 */
public class Test2 {

	public static void main(String[] args) {
		int count = 0;
        for(int i=1; i<500000; i++){
        	int sum = (int)Math.pow(i, 3);
        	int temp = sum;
        	int m = 0; //
        	int k = 0; //��ʱ��¼λ�����Ǹ�ֵ
        	int bit = getBit(sum);
        	
        	if(bit == 1){
        		if(sum == i){
        			count++;
        			System.out.println("���֣�"+i);
        		}
        		continue;
        	}
        	//����2λ����
        	for(int j=bit; j>=1; j--){
        		k =  temp / ((int)Math.pow(10, j-1));
        		temp = temp - k*((int)Math.pow(10, j-1));
        		m = m+k;
        	}
        	if(i == m){
        		count++;
        		System.out.println("���֣�"+i);
        	}
        }
        System.out.println(count);
        //System.out.println((int)Math.pow(5, 2));
        //System.out.println(getBit(1));
	}
	public static int getBit(int sum){
		if(sum < 10){
			return 1;
		}
		return getBit(sum/10)+1;
	}

}
