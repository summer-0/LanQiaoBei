package javaB;

import java.util.Queue;
import java.util.Scanner;

public class Test4_3 {
    
	private static int n;
	private static char arrays[][];
    private static int Xa, Ya, Xb, Yb; //A B �������ֵ��±�
    private static int min = Integer.MAX_VALUE; //��¼��С���� 
    private static int[][] isVisted;
    private static int[][] next = {{ -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 }}; //��һ�� 
    
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       n = scan.nextInt();
       arrays = new char[n][n];
       isVisted = new int[n][n];
       //��ֵ����
       for(int i=0; i<n; i++){
    	   for(int j=0; j<n; j++){
    		   char temp = scan.next().charAt(0);
    		   //������Ҫ��������ո�������  ��Ϊ�����Ǵ���ַ���
    		   if (temp == '+' || temp == '-') {
    			   arrays[i][j] = temp;
               } else if (temp == 'A') {  //��¼  A ��λ��
                   Xa = i;
                   Ya = j;
                   arrays[i][j] = temp;
               } else if (temp == 'B') {  //��¼ B ��λ��
                   Xb = i;
                   Yb = j;
                   arrays[i][j] = temp;
               }
    	   }
       }
       isVisted[Xa][Ya] = 1; //�Ȱ�A��λ����Ϊ1
       dfs(Xa, Ya, 'A', 0);
       System.out.println(min);
	}
	/**
	 * 
	 * @param xa2
	 * @param ya2
	 * @param c
	 * @param step
	 */
	private static void dfs(int x, int y, char c, int step) {
		if(x == Xb && y == Yb){
			if(min > step){
				min = step;
			}
			return;
		}
		int tx;
		int ty;
		//�����߷�
		for(int i=0; i<next.length; i++){
			tx = x + next[i][0];
		    ty = y + next[i][1];
			if(tx<0 || ty<0 || tx>=n || ty>=n){
				continue;
			}
			if(isVisted[tx][ty]==0 && arrays[tx][ty]!=c){
				isVisted[tx][ty] = 1;
				dfs(tx, ty, arrays[tx][ty], step+1);
				//��̽����
				isVisted[tx][ty] = 0;
			}
		}
	}

}
