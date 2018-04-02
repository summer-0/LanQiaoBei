package javaB;
/**
 * 九数组分数
	1,2,3...9 这九个数字组成一个分数，其值恰好为1/3，如何组法？
 * @author 49944
 *
 */
public class Test5_1 {

	public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        f(array, 0);
	}

	private static void f(int[] array, int k) {
        if(k == array.length){
        	test(array);
        	return;
        }		
        for(int i=k; i<array.length; i++){
        	int temp = array[k];
        	array[k] = array[i];
        	array[i] = temp;
        	
        	f(array, k+1);  //此时k 变化了   
        	//回溯（试探） 要换回来                      如： 1234567'89' -> 1234567'98' 不成功  换回来-》123456789
        	                       //      -->  123456'789'  --> 123456'879'...123456'897' 
        	int tamp = array[k];
        	array[k] = array[i];
        	array[i] = tamp;
        }
	}

	private static void test(int[] array) {
		int s1 = array[0]*1000 + array[1]*100 + array[2]*10 + array[3];
		int s2 = array[4]*10000 + array[5]*1000 + array[6]*100 + array[7]*10 + array[8];
		if(3*s1 == s2){
			System.out.println(s1 + " " + s2);
		}
	}

}
