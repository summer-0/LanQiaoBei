package javaB;

import java.util.Scanner;

public class Test4_2 {
	public static int xA, yA, xB, yB;// ��¼ A�� B������
    public static char[][] map;
    public static int[][] book;
    public static int n;                                                                     
    private static int stepMin = Integer.MAX_VALUE;
    public static int[][] next = new int[][] { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };   
/*        -1  0
 *         0  1
 *         1  0
 *         0 -1
*/         

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new char[n][n];
        book = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char temp = sc.next().charAt(0);
                if (temp == '+' || temp == '-') {
                    map[i][j] = temp;
                } else if (temp == 'A') {  //��¼  A ��λ��
                    xA = i;
                    yA = j;
                    map[i][j] = 'A';
                } else if (temp == 'B') {  //��¼ B ��λ��
                    xB = i;
                    yB = j;
                    map[i][j] = 'B';
                }
            }
        }
        book[xA][yA] = 1; // �� A ��λ����Ϊ1��true��
        dfs(xA, yA, '0', 0);
        System.out.println(stepMin);
    }
/**
 * 
 * @param x 
 * @param y
 * @param ch
 * @param step ��С����
 */
    private static void dfs(int x, int y, char ch, int step) {
        // TODO Auto-generated method stub
        if (x == xB && y == yB) {
            if (stepMin > step) {
                stepMin = step;
            }
            return;
        }
        int tx, ty;
        for (int i = 0; i <= 3; i++) {
            tx = x + next[i][0];
            ty = y + next[i][1];
            
            //�ų�����Խ��
            if (tx < 0 || ty < 0 || ty >= n || tx >= n) {
                continue;
            }
            if (book[tx][ty] == 0 && map[tx][ty] != ch) { //  һ�� û���ʹ�  ����������֮ǰ�Ǹ��ַ�
                book[tx][ty] = 1;
                dfs(tx, ty, map[tx][ty], step + 1);
                //����  ��Ϊ0
                book[tx][ty] = 0;
            }
        }

    }
}
