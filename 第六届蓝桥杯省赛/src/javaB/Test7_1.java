package javaB;

public class Test7_1 {
	static int sum = 0; // ��¼���е��Ƶ���Ŀ
	static int ans = 0; // ��¼���

	private static void cal(int n) {
		if (sum > 13)
			return;
		if (n == 14) { // 13�������Լ�ȫ������
			if (sum == 13) {
				ans++;
				return;
			}
		} else {
			for (int i = 0; i < 5; i++) {
				sum += i;
				cal(n + 1);
				sum -= i; // ��ԭ 
			}
		}
	}

	public static void main(String[] args) {
		cal(1); // �ӵ�һ��������
		System.out.println(ans);
	}

}
