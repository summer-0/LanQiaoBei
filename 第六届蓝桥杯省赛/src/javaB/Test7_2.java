package javaB;

public class Test7_2 {
    private static int sum = 0; //��¼�����õ�������  ���13��
    private static int ans = 0; //��¼����
    
	public static void main(String[] args) {
        cal(1);
        System.out.println(ans);
	}

	private static void cal(int n) {
		if(sum > 13){
			return;
		}
		if(n >13){
			if(sum == 13){
				ans++;
			}
			return;
		}
		for(int i=0; i<=4; i++){
			sum = sum + i; //��������
			cal(n+1);
			//����   ��һ�ֽ������������һ������
			sum = sum - i;
		}
	}

}
