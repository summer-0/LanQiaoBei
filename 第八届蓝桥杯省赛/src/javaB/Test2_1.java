package javaB;

public class Test2_1 {

	private static int arrays[];
    private static int count = 0;
	public static void main(String[] args) {
        arrays = new int[] {1,2,3,4,5,6,7,8,9};
        long start = System.currentTimeMillis();
        getCount(0);
        System.out.println(count/6);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
	}

	private static void getCount(int n) {
		if(n == arrays.length){
			int s1 = arrays[0] + arrays[1]+arrays[2]+arrays[3];
    		int s2 = arrays[3] + arrays[4]+arrays[5]+arrays[6];
    		int s3 = arrays[6] + arrays[7]+arrays[8]+arrays[0];
    		if(s1==s2 && s2==s3 && s1==s3){
    			count++;
    		}
    		return;
		}
		for(int i=n; i<arrays.length; i++){
			int temp = arrays[n];
			arrays[n] = arrays[i];
			arrays[i] = temp;
			getCount(n+1);
			int tamp = arrays[n];
			arrays[n] = arrays[i];
			arrays[i] = tamp;
		}
	}

}
