package javaB;

/**
 * ��������
	���µ�10������
	   +--+--+--+
	   |  |  |  |
	+--+--+--+--+
	|  |  |  |  |
	+--+--+--+--+
	|  |  |  |
	+--+--+--+
	�������ʾ�����⣬Ҳ���Բο���ͼ1.jpg����
	����0~9�����֡�Ҫ���������������ֲ������ڡ�
	�����ҡ����¡��ԽǶ������ڣ�
	һ���ж����ֿ��ܵ�����������
 * @author 49944
 * �û��ݷ������ư˻ʺ�
 */
public class Test6 {
    public static int MAX = Integer.MAX_VALUE;
    public static int[][] array = new int[3][4];
    public static boolean[][] isVisted = new boolean[3][4];
    public static int[] a = {0,1,2,3,4,5,6,7,8,9}; 
    
	public static void main(String[] args) {
        array[0][0] = MAX;
        array[2][3] = MAX;
        int m = array.length;
        int n = array[1].length;
        putNum(0);
	}
/**
 * 
 * @param num 0
 * @param m 0��
 * @param n 1��
 */
	private static void putNum(int num) {
		//�ж������������ڵ�ֵ��
	    if(num > 0){
	    	for(int i=0; i<=2; i++){
	    		for(int j=0; j<=3; j++){
	    			if(!isVisted[i][j] && ( (i!=0 && j!=0) && (i!=2 && j!=2)  )){
	    				//�ڵ�һ��ʱ
	    				if(i==0 && Mabs(num, array[i][j+1])!=1 && j+1<=3){
	    					isVisted[i][j] = true;
	    					array[i][j] = a[num];
	    				}
	    				if(i==2 && Mabs(num, array[i-1][j])!=1);
	    				
	    				/*if( (Mabs(num, array[i-1][j]) != 1) && (Mabs(num, array[i-1][j-1]) != 1)  && (Mabs(num, array[i][j-1]) != 1) && 
	    						(Mabs(num, array[i-1][j-1]) != 1) && j+1 <= 2){
	    					if()
	    				}*/
	    			}
	    		}
	    	}
	    }
		//ʵ�ָ�ֵ������
		for(int i=0; i<=2; i++){
			for(int j=0; j<=3; j++){
				if((i!=0 && j!=0) && (i!=2 && j!=2) ){
					if(!isVisted[i][j]){
						array[i][j] = a[num];
						isVisted[i][j] = true;
						putNum(num+1);
						isVisted[i][j] = false;
					}
				}
				
			}
			
		}
	}
	public static int Mabs(int m, int n){
		return Math.abs(m-n);
	} 

}
