package javaB;

public class Test1 {
/**
 * ú����Ŀ
	��һ��ú�򣬶ѳ�������׶�Ρ����壺
	��һ���1����
	�ڶ���3�������г������Σ���
	������6�������г������Σ���
	���Ĳ�10�������г������Σ���
	....
	���һ����100�㣬���ж��ٸ�ú��
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
