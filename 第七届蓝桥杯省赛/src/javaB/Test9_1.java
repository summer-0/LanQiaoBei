package javaB;

import java.util.Arrays;
import java.util.Scanner;

public class Test9_1 {

	static int[] canGet = new int[3];  
    static int[][] cache;  
  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        for (int i = 0; i < 3; i++)   
            canGet[i] = in.nextInt();  
        Arrays.sort(canGet);  
        for (int k = 0; k < 5; k++) {  
            int num = in.nextInt();  
            cache = new int[num + 1][num + 1];  
              
                for (int j = 0; j < num + 1; j++) {  
                    for (int j2 = 0; j2 < num + 1; j2++) {  
                        cache[j][j2] = -999;  
                    }  
                }  
            int ans = dfs(num, 0, 0);  
            if (ans == 1) {  
                System.out.print("+");  
            }  
            if (ans == -1) {  
                System.out.print("-");  
            }  
            if (ans == 0) {  
                System.out.print("0");  
            }  
            if (k != 4) {  
                System.out.print(" ");  
            }  
        }  
        System.out.println();  
    }  
  
    public static int dfs(int sum, int a, int b) {  
        if(cache[a][b]!=-999)  
            return cache[a][b];  
        if(sum<canGet[0]){  
            if(a%2==1&&b%2==0)  
                return cache[a][b]=1;  
            if(a%2==1 && b%2==1||(b%2==0 && a%2==0))  
                return cache[a][b]=0;  
            return cache[a][b]=-1;  
        }  
        int canwin=-999;  
        for(int i=0;i<canGet.length;i++){  
            if(sum-canGet[i]>=0){  
                canwin=Math.max(canwin, -dfs(sum-canGet[i], b, a+canGet[i]));  
            }  
        }  
        return cache[a][b]=canwin;  
              
    }  

}
