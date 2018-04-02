package javaB;

public class Test2 {
/**生日蜡烛
	某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
	现在算起来，他一共吹熄了236根蜡烛。
	请问，他从多少岁开始过生日party的？
	请填写他开始过生日party的年龄数。
	注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
 * 
 * @param args
 */
	//   n + (n+1) + (n+2) + (n+3) +.... + (n+k) = 236
	//   (k+1)n + (1+k)*k/2 = 236
	
	public static void main(String[] args) {
         for(int n=15; n<100; n++){
        	 for(int k=1; k<=50; k++){
        		 if( (k+1)*n + (1+k)*k/2 == 236){
        			 System.out.println("开始年龄："+n+"  次数："+(k+1));
        			 break;
        		 }
        	 }
         }
	}

}
