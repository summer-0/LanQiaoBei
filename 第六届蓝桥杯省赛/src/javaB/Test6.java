package javaB;

import java.util.LinkedList;
import java.util.Queue;

/**�ӷ���˷�
	���Ƕ�֪����1+2+3+ ... + 49 = 1225
	����Ҫ������������������ڵļӺű�ɳ˺ţ�ʹ�ý��Ϊ2015
	���磺
	1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015
	���Ƿ���Ҫ��Ĵ𰸡�
	����Ѱ������һ�����ܵĴ𰸣�����λ�ÿ�ǰ���Ǹ��˺���ߵ������ύ������ʾ���������ύ10����
 * 
 * @author 49944
 *
 */
public class Test6 {

	public static void main(String[] args) {
        int k = 1225;
        int sum = 0;
		for(int i=1; i<=49; i++){
			for(int j=i; j<=49; j++){
				int temp = i*(i+1) + j*(j+1);
				if(k-(i+i+1)-(j+j+1)+temp == 2015){
					System.out.println("i:"+i+"  j:"+j);
					//return;
				}
			}
		}
	}

}
