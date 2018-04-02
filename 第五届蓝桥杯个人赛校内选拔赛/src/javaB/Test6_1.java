package javaB;

import java.util.Scanner;  
public class Test6_1 {
    static int[][] d = new int[10][10];// ������������������1-9�У�1-9��  
    long start;  
    long end;  
    int count = 0;  
  
    // �ж������Ƿ��ظ�  
    boolean noLcAgain(int l, int c, int num) {  
        int i;  
        // �ж����Ƿ��ظ�  
        for (i = 1; i <= 9; i++) {  
            if (d[l][i] == num)// �ظ�����false  
                return false;  
        }  
        // �ж����Ƿ��ظ�  
        for (i = 1; i <= 9; i++) {  
            if (d[i][c] == num)// �ظ�����false  
                return false;  
        }  
        return true;
    }// ���ظ�ʱ������true
        boolean noColorAgain(int l, int c, int num) {  
            int i, j;  
            int i1,j1;  
            if (l>=1&&l<=3) {  
                i1 = 1;  
            } else if(l>=4&&l<=6) {  
                i1 = 4;  
            } else {  
                i1 = 7;  
            }  
              
            if (c>=1&&c<=3) {  
                j1 = 1;  
            } else if(c>=4&&c<=6) {  
                j1 = 4;  
            } else {  
                j1 = 7;  
            }  
              
            for (i = i1; i <= i1+2; i++)  
                for (j = j1; j <= j1+2; j++)  
                    if (d[i][j] == num)  
                        return false;// �ظ�����false  
              
            return true;// ���ظ�ʱ������true  
        }
        void print() {  
            for (int i = 1; i <= 9; i++) {  
                for (int j = 1; j <= 9; j++)  
                    System.out.print(d[i][j] + "");  
                System.out.println("\n");  
            }  
        }  
      
        // �����������  
        void dfs(int l, int c) {  
            if (l >= 10) {// ������ʱ����ӡ����  
                end = System.nanoTime();  
                System.out.println("����ʱ�䣺" + (end - start) / Math.pow(10, 9) + "s");  
                print();  
                System.exit(0);  
            }  
      
            int i;  
            if (d[l][c] == 0) {// ��λ��δ������  
                for (i=1;i<=9;i++) {  
                    if(noLcAgain(l, c, i)&&noColorAgain(l, c, i)) {// Ҫ���i���������ֲ��ظ�  
                        d[l][c] = i;  
                        if(count<30) {  
                            System.out.println("l:"+l+" c:"+c+" i:"+i);// ��ӡ��д����  
                            count++;  
                        }  
                        dfs(l+(c+1)/10, (c+1)%10);  
                    }  
                }  
                d[l][c] = 0;// ������0  
            } else {  
                dfs(l+(c+1)/10, (c+1)%10);  
            }  
        }  
      
        public static void main(String[] args) {  
        	Test6_1 test = new Test6_1();  
            Scanner scanner = new Scanner(System.in);  
            for (int i = 1; i <= 9; i++) {  
                String s = scanner.nextLine();  
                for (int j = 0; j < 9; j++) {  
                    String s1 = s.charAt(j) + "";  
                    d[i][j + 1] = Integer.parseInt(s1);  
                }  
            }  
            test.start = System.nanoTime();  
            test.dfs(1,1);  
        }
}