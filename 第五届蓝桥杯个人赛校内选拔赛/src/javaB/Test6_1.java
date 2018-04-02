package javaB;

import java.util.Scanner;  
public class Test6_1 {
    static int[][] d = new int[10][10];// 保存输入数独的数组1-9行，1-9列  
    long start;  
    long end;  
    int count = 0;  
  
    // 判断行列是否重复  
    boolean noLcAgain(int l, int c, int num) {  
        int i;  
        // 判断行是否重复  
        for (i = 1; i <= 9; i++) {  
            if (d[l][i] == num)// 重复返回false  
                return false;  
        }  
        // 判断列是否重复  
        for (i = 1; i <= 9; i++) {  
            if (d[i][c] == num)// 重复返回false  
                return false;  
        }  
        return true;
    }// 不重复时，返回true
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
                        return false;// 重复返回false  
              
            return true;// 不重复时，返回true  
        }
        void print() {  
            for (int i = 1; i <= 9; i++) {  
                for (int j = 1; j <= 9; j++)  
                    System.out.print(d[i][j] + "");  
                System.out.println("\n");  
            }  
        }  
      
        // 深度优先搜索  
        void dfs(int l, int c) {  
            if (l >= 10) {// 填完数时，打印出来  
                end = System.nanoTime();  
                System.out.println("运行时间：" + (end - start) / Math.pow(10, 9) + "s");  
                print();  
                System.exit(0);  
            }  
      
            int i;  
            if (d[l][c] == 0) {// 该位置未填数字  
                for (i=1;i<=9;i++) {  
                    if(noLcAgain(l, c, i)&&noColorAgain(l, c, i)) {// 要填的i与其它数字不重复  
                        d[l][c] = i;  
                        if(count<30) {  
                            System.out.println("l:"+l+" c:"+c+" i:"+i);// 打印填写过程  
                            count++;  
                        }  
                        dfs(l+(c+1)/10, (c+1)%10);  
                    }  
                }  
                d[l][c] = 0;// 重新置0  
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