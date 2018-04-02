package javaB;

public class Test2_1 {

	private static int count;

	public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,8,9,10,12};
        count = 0;
        long start = System.currentTimeMillis();

        getCount(array, 0);
        System.out.println(count/10);
        long end = System.currentTimeMillis();
        System.out.println(end - start +"ms");
	}

	private static void getCount(int[] array, int n) {
        if(n == 9){
        	int s1 = array[0] + array[1] + array[3] + array[4];
			 int s2 = array[0] + array[9] + array[7] + array[6];
			 int s3 = array[2] + array[1] + array[9] + array[8];
			 int s4 = array[2] + array[3] + array[5] + array[6];
			 int s5 = array[4] + array[5] + array[7] + array[8];
			 if(s1==s2 && s1==s3 && s1==s4 && s1==s5 &&
					 s2==s3 && s2==s4 && s2==s5 &&
					 s3==s4 && s3==s5 &&
					 s4==s5){
				 count++;
			 }
			 return;
        }
        for(int i=n; i<array.length; i++){
        	//交换 n 以后的数
        	int temp = array[i];
        	array[i] = array[n];
        	array[n] = temp;
        	getCount(array, n+1);
        	//退回
        	int tamp = array[i];
        	array[i] = array[n];
        	array[n] = tamp;
        }
	}

}
