package javaB;
/**
 * ��������
	С�����ٳֵ�X�ĳǣ�����������3�����ơ�
	һ���˿��ƣ�ȥ����С���ƣ���52�ţ������ȷ���4���ˣ�ÿ����13�š�
	��ʱ��С��������ͻȻð��һ�����⣺
	��������ǻ�ɫ��ֻ���ǵ�����Ҳ�������Լ��õ����Ƶ��Ⱥ�˳���Լ��������õ��ĳ�ʼ�������һ���ж������أ�
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
