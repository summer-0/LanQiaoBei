package javaB;

public class Test1 {
/**
 * 煤球数目
	有一堆煤球，堆成三角棱锥形。具体：
	第一层放1个，
	第二层3个（排列成三角形），
	第三层6个（排列成三角形），
	第四层10个（排列成三角形），
	....
	如果一共有100层，共有多少个煤球？
 * @param args
 */
	public static void main(String[] args) {
		int sum=0;
		int array[] = new int[100];
		array[0] = 1;
        for(int i=1; i<100; i++){
        	array[i] = array[i-1] + (i+1);
        }
        for (int i : array) {
			sum += i;
		}
        System.out.println(sum); // 171700
	}

}
