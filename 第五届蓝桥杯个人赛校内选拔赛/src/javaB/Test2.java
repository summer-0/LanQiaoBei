package javaB;
/** 1/1 + 1/2 + 1/3 + 1/4 + ... ����ѧ�ϳ�Ϊ���ͼ�����
	���Ƿ�ɢ�ģ�Ҳ����˵��ֻҪ�����㹻�����Ϳ��Եõ����������֡�
	���ǣ�����ɢ�ĺ�����
	ǰ1��ʹﵽ 1.0
	ǰ4��Ͳų��� 2.0
	ǰ83��ĺͲų��� 5.0
	��ô���������һ�£�Ҫ�Ӷ��������ʹ�úʹﵽ�򳬹� 15.0 �أ�
	����д���������
 * 
 * @author 49944
 *
 */
public class Test2 {

	public static void main(String[] args) {
		double sum = 0;
		int count = 0;
        for(int i=1; i<=10050000; i++){
        	sum = sum + (double)1/i;
        	count++;
        	if(sum >= 15.0){
        		break;
        	}
        }
        System.out.println(count);
	}

}
