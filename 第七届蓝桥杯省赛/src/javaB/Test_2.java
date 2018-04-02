package javaB;
/**
 * 典型的组合排序
 * @author 49944
 *
 */
public class Test_2 {

	private static int[] arrays;
	private static int count;

	public static void main(String[] args) {
        arrays = new int[] {1,2,3,4,5,6};
        count = 0;
        allSort(0);
        System.out.println("-------"+count);
	}

	private static void allSort(int k) {
        if(k == arrays.length){
        	for(int i=0; i<arrays.length; i++){
        		System.out.print(arrays[i]+"");
        	}
        	count++;
        	System.out.println();
        } 	
        for(int i=k; i<arrays.length; i++){
        	int temp = arrays[k];
        	arrays[k] = arrays[i];
        	arrays[i] = temp;
        	allSort(k+1);
        	int tamp = arrays[k];
        	arrays[k] = arrays[i];
        	arrays[i] = tamp;
        }
	}

}
