package javaB;

import java.util.Scanner;

public class Test6_2 {
	long end;  
    long start;  
    static int[][] map = new int[9][9];  
  
    /** 
     * 判断行列是否有重复 
     *  
     * @param row 
     * @param column 
     * @param value 
     * @return 
     */  
    boolean rowColumnIsNotRepeat(int row, int column, int value) {  
        // 判断列  
        for (int i = 0; i < 9; i++) {  
            if (map[i][column] == value) {  
                return false;  
            }  
        }  
        // 判断行  
        for (int i = 0; i < 9; i++) {  
            if (map[row][i] == value) {  
                return false;  
            }  
        }  
        return true;  
    }  
  
    /** 
     * 判断同一九宫格内是否有重复 
     */  
    boolean sectionIsNotRepeat(int row, int column, int value) {  
        int sectionRow;  
        int sectionColumm;  
        if (row <= 2) {  
            sectionRow = 0;  
        } else if (row <= 5) {  
            sectionRow = 3;  
        } else {  
            sectionRow = 6;  
        }  
        if (column <= 2) {  
            sectionColumm = 0;  
        } else if (column <= 5) {  
            sectionColumm = 3;  
        } else {  
            sectionColumm = 6;  
        }  
  
        for (int i = sectionRow; i < sectionRow + 3; i++) {  
            for (int j = sectionColumm; j < sectionColumm + 3; j++) {  
                if (map[i][j] == value) {  
                    return false;  
                }  
            }  
        }  
        return true;  
    }  
  
    void dfs(int row, int column) {  
        //填完后显示结果和时间(毫秒)  
        if(row >= 9) {   
            print();  
            end = System.currentTimeMillis();  
            System.out.println(end - start + "ms");  
            System.exit(0);  
        }  
        if (map[row][column] == 0) {  
            //从1到9挨个试  
            for (int i = 1; i <= 9; i++) {  
                if (rowColumnIsNotRepeat(row, column, i) && sectionIsNotRepeat(row, column, i)) {  
                    map[row][column] = i;  
                    dfs(row + (column + 1) / 9, (column + 1) % 9);  
                }  
            }  
            //试完后都不行，返回上一层  
            map[row][column] = 0;  
            return;  
        } else {  
            //如果当前位置有数字，进入下一个位置  
            dfs(row + (column + 1) / 9, (column + 1) % 9);  
        }  
    }  
  
    void print() {  
        for(int i = 0; i < 9; i++) {  
            for(int j = 0; j < 9; j++) {  
                System.out.print(map[i][j]);  
            }  
            System.out.println();  
        }  
    }  
      
    public static void main(String[] args) {  
    	Test6_2 sudoku = new Test6_2();  
        Scanner scanner = new Scanner(System.in);  
        String str;  
        char[] a;  
        System.out.println("Please input");  
        for(int i = 0; i < 9; i++) {  
            str = scanner.nextLine();  
            a = str.toCharArray();  
            for(int j = 0; j < 9; j++) {  
                map[i][j] = Integer.parseInt(a[j] + "");  
            }  
        }  
        if(scanner != null) {  
            try {  
                scanner.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
          
        sudoku.start = System.currentTimeMillis();  
        sudoku.dfs(0, 0);  
    }  
}
