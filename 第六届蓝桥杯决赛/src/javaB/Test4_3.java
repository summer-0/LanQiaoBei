package javaB;

import java.util.Queue;
import java.util.Scanner;

public class Test4_3 {
    
	private static int n;
	private static char arrays[][];
    private static int Xa, Ya, Xb, Yb; //A B 在数组种的下标
    private static int min = Integer.MAX_VALUE; //记录最小步数 
    private static int[][] isVisted;
    private static int[][] next = {{ -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 }}; //下一步 
    
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       n = scan.nextInt();
       arrays = new char[n][n];
       isVisted = new int[n][n];
       //赋值过程
       for(int i=0; i<n; i++){
    	   for(int j=0; j<n; j++){
    		   char temp = scan.next().charAt(0);
    		   //这里需要避免输入空格到数组里  因为数组是存放字符型
    		   if (temp == '+' || temp == '-') {
    			   arrays[i][j] = temp;
               } else if (temp == 'A') {  //记录  A 的位置
                   Xa = i;
                   Ya = j;
                   arrays[i][j] = temp;
               } else if (temp == 'B') {  //记录 B 的位置
                   Xb = i;
                   Yb = j;
                   arrays[i][j] = temp;
               }
    	   }
       }
       isVisted[Xa][Ya] = 1; //先把A的位置置为1
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
		//四种走法
		for(int i=0; i<next.length; i++){
			tx = x + next[i][0];
		    ty = y + next[i][1];
			if(tx<0 || ty<0 || tx>=n || ty>=n){
				continue;
			}
			if(isVisted[tx][ty]==0 && arrays[tx][ty]!=c){
				isVisted[tx][ty] = 1;
				dfs(tx, ty, arrays[tx][ty], step+1);
				//试探回退
				isVisted[tx][ty] = 0;
			}
		}
	}

}
