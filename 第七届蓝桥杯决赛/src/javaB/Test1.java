package javaB;
/**
 * ��ŭС��
	X�����ŭ��С��ϲ��ײ�𳵣�
	һ��ƽֱ�����������𳵼���� 1000 ��
	���� ��������A��B�� ��ʱ�� 10��/�� �����ʻ��
	��ŭ��С���A��������ʱ��50��/�룬ײ��B����
	Ȼ�󷵻�ȥײA�����ٷ���ȥײB�����������....
	���������1�״�ͣ����
	�ʣ����ڼ��ŭ��С��ײ B �����ٴΣ�
 * @author 49944
 *
 */
public class Test1 {

	public static void main(String[] args) {
       double ab = 10; //A B ���ٶ�
       double bird = 50; //����ٶ�
       double s = 1000; //��·��
       int count = 0; //ײA B���ܴ���
       int sum=0;  //ײ B �Ĵ���
       for( ; ; ){
    	   s=s-(2*ab*s/(ab+bird));
    	   if(s>=1){
    		   count++;
    	   }else{
    		   break;
    	   }
    	   
       }
       //count = 17;
       //ײB��9��         ײA��8��  ///ע����ײB�Ĵ���   ��Ϊ��һ����װB �ڶ���װA...������ײB ���Ĵ�ײA...  ��������ײB ż��ײA
       for(int i=1; i<=17; i++){
    	   if(i%2 == 1){
    		   sum++;
    	   }
       }
       System.out.println(sum);
       
	}
   
}
