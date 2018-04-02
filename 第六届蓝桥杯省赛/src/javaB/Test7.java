package javaB;
/**
 * 牌型种数
	小明被劫持到X赌城，被迫与其他3人玩牌。
	一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
	这时，小明脑子里突然冒出一个问题：
	如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？
 * @author 49944
 *
 */
public class Test7 {

	public static void main(String[] args) {
		int[] array = new int[13];
		for(int i=0; i<13; i++){
			array[i] = (i+1);
		}
		int count=0;
        for(int a=4; a>=0; a--){
        	 for(int b=4; b>=0; b--){
        		 for(int c=4; c>=0; c--){
        			 for(int d=4; d>=0; d--){
        				 for(int e=4; e>=0; e--){
        					 for(int f=4; f>=0; f--){
        						 for(int g=4; g>=0; g--){
        							 for(int h=4; h>=0; h--){
        								 for(int i=4; i>=0; i--){
        									 for(int j=4; j>=0; j--){
        										 for(int l=4; l>=0; l--){
        											 for(int m=4; m>=0; m--){
        												 for(int n=4; n>=0; n--){
        													 if(a+b+c+d+e+f+g+h+i+j+l+m+n == 13){
        														 count++;
        													 }
        												 }
        											 }
        										 }
        									 }
        								 }
        							 }
        						 }
        					 }
        				 }
        			 }
        		 }
        	 }
         }
         
         System.out.println(count);
	}

}
