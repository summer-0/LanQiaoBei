package javaB;

public class Test3_1 {

	private static int[] arrays;
	private static int count;

	public static void main(String[] args) {
        arrays = new int[] {1,2,3,4,5,6,7,8,9};
        count = 0;
        allSort(0);
        System.out.println(count);
	}

	private static void allSort(int k) {
       if(k == arrays.length){
    	   if( (arrays[0] + arrays[1]/arrays[2] + (arrays[3]*100+arrays[4]*10+arrays[5])/(arrays[6]*100+arrays[7]*10+arrays[8]) ) == 10 ){
       		   // System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+a[5]+" "+a[6]+" "+a[7]+" "+a[8]);
            	count++;
           }
    	   return;
       }		
       for(int i=0; i<arrays.length; i++){
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
