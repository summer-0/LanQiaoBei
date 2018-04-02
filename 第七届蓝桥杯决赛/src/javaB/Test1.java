package javaB;
/**
 * 愤怒小鸟
	X星球愤怒的小鸟喜欢撞火车！
	一根平直的铁轨上两火车间相距 1000 米
	两火车 （不妨称A和B） 以时速 10米/秒 相对行驶。
	愤怒的小鸟从A车出发，时速50米/秒，撞向B车，
	然后返回去撞A车，再返回去撞B车，如此往复....
	两火车在相距1米处停车。
	问：这期间愤怒的小鸟撞 B 车多少次？
 * @author 49944
 *
 */
public class Test1 {

	public static void main(String[] args) {
       double ab = 10; //A B 的速度
       double bird = 50; //鸟的速度
       double s = 1000; //总路程
       int count = 0; //撞A B的总次数
       int sum=0;  //撞 B 的次数
       for( ; ; ){
    	   s=s-(2*ab*s/(ab+bird));
    	   if(s>=1){
    		   count++;
    	   }else{
    		   break;
    	   }
    	   
       }
       //count = 17;
       //撞B是9次         撞A是8次  ///注意是撞B的次数   因为第一次是装B 第二次装A...第三次撞B 第四次撞A...  所以奇数撞B 偶数撞A
       for(int i=1; i<=17; i++){
    	   if(i%2 == 1){
    		   sum++;
    	   }
       }
       System.out.println(sum);
       
	}
   
}
