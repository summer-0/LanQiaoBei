package javaB;

import java.util.LinkedList;
import java.util.Scanner;

public class Test4_1 {

	private static int n;
	private static char[][] chs;
	private static int count;
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        chs = new char[n][n];
        count = 0;
        for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        		chs[i][j] = scan.next().charAt(0); 
        	}
        }
        //深度优先  DFS
        dfs();
	}
	private static void dfs() {
		// TODO Auto-generated method stub
		boolean[][] isVisted = new boolean[n][n];
		dfs('A',isVisted);
	}
	private static void dfs(char c, boolean[][] isVisted) {
        beTrue(c, isVisted);	
        if(judeg(c)){
            System.out.println(count);
            return;
        } //用于判断附近有没有B点
        for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        		if(isVisted[i][j]){ //找到A点
        			if(i-1>=0 && chs[i-1][j]!=chs[i][j]){
        				dfs(chs[i-1][j], isVisted);
        			}
        			if(i+1<0 && chs[i+1][j]!=chs[i][j]){
        				dfs(chs[i+1][j], isVisted);
        			}
        			if(j-1>=0 && chs[i][j-1]!=chs[i][j]){
        				dfs(chs[i][j-1], isVisted);
        			}
        			if(j+1>=0 && chs[i][j+1]!=chs[i][j]){
        				dfs(chs[i][j+1], isVisted);
        			}
        		}
        	}
        }
	}
	
	private static boolean judeg(char c) {
		for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        		if(chs[i][j] == c){
        			if(chs[i-1][j] == 'B' && i-1>=0){
        				count++;
        				return true;
        			}
        			if(chs[i+1][j] == 'B' && i+1<n){
        				count++;
        				return true;
        			}
        			if(chs[i][j-1] == 'B' && j-1>=0){
        				count++;
        				return true;
        			}
        			if(chs[i][j+1] == 'B' && j+1<=n){
        				count++;
        				return true;
        			}
        		}
        	}
        }
		return false;
	}
	//用于找到A
    private static void beTrue(char ch, boolean[][] isVisted){
    	for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        		if(chs[i][j] == ch){
        			if(!isVisted[i][j]){
        			   isVisted[i][j] = true;
        			}
        		}
        	}
        }
    }
}
