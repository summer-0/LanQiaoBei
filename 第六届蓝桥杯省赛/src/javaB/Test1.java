package javaB;
/**
 * 三角形面积
	如【图1】所示。图中的所有小方格面积都是1。
	那么，图中的三角形面积应该是多少呢？
 * @author 49944
 *
 */
public class Test1 {

	public static void main(String[] args) {
        int sum = 8*8;
        int left = 4*8/2;
        int right = 4*6/2;
        int top = 2*8/2;
        System.out.println(sum - (left+right+top));
	}

}
