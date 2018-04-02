package javaB;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 如果x的x次幂结果为10（参见【图1.png】），你能计算出x的近似值吗？
	显然，这个值是介于2和3之间的一个数字。
	请把x的值计算到小数后6位（四舍五入），并填写这个小数值。
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
