package javaB;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * ���x��x���ݽ��Ϊ10���μ���ͼ1.png���������ܼ����x�Ľ���ֵ��
	��Ȼ�����ֵ�ǽ���2��3֮���һ�����֡�
	���x��ֵ���㵽С����6λ���������룩������д���С��ֵ��
 * @author 49944
 *
 */
public class Test3 {

	public static void main(String[] args) {
		double k = 0;
        for(double i=0; i<=3; i = i+0.0000001){
        	if(Math.pow(i, i) >= 10){
        		k = i;
        		break;
        	}
        }
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMaximumFractionDigits(6);
        DecimalFormat format2 = new DecimalFormat("0.000000");
        System.out.println(k);
        //System.out.println(format2.format(k));
        // k 2.5061841995056264
        //System.out.println(format.format(k));
	}

}
