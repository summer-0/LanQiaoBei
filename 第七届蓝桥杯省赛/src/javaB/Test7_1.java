package javaB;

public class Test7_1 {

	public static int count = 0; // ��¼�ܵķ�����
	public static int cut[] = new int[5]; // ��������ƭ��ѡ��5�Ŵ�С������벻ͬ����Ʊ������������б���ѡȡ����Ʊ�����ظ�
	public static int isVisit[] = new int[5]; // �ж�ȡ����5����Ʊ�Ƿ��Ѿ�����
	public static int b[] = { +1, -1, +5, -5 }; // �ж�ȡ����5����Ʊ�Ƿ�������+1��ʾ���ұ�������-1��ʾ��ߣ�+5��ʾ���棬-5��ʾ����

	public static void main(String[] args) {
		int stamp[] = new int[12]; // ����������Ʊ����
		for (int i = 1, k = 1; i <= 12; i++) { // ��ʼ�����е���Ʊ����Ϊ{1,2,3,4,6,7,8,9,11,12,13,14}
			stamp[i - 1] = k++;
			if (i % 4 == 0) {
				k++;
			}
		}
		for (int a = 0; a < 12; a++) { // ͨ��forѭ��ȡ��5����Ʊ�������С����
			for (int b = a + 1; b < 12; b++) {
				for (int c = b + 1; c < 12; c++) {
					for (int d = c + 1; d < 12; d++) {
						for (int e = d + 1; e < 12; e++) {
							// ��ȡ������Ʊ����cut�����У�����
							cut[0] = stamp[a];
							cut[1] = stamp[b];
							cut[2] = stamp[c];
							cut[3] = stamp[d];
							cut[4] = stamp[e];
							for (int i = 0; i < 5; i++) { // ��ʼ��ȡ������Ʊ��Ϊδ����״̬
								isVisit[i] = 0;
							}
							// ��ʼ����
							isVisit[0] = 1; // ��cut����ͷΪ�ѷ���״̬
							// ��cut����ͷ��ʼ���жϸ÷����Ƿ����
							find(0);
							int flag = 1; // ��flagΪ1ʱ���У����򲻿���
							for (int j = 0; j < 5; j++) {
								if (isVisit[j] == 0) { // ֻҪһ����δ���ʵ���˵��������
									flag = 0;
									break;
								}
							}
							if (flag == 1) {
								count++;
							}
						}
					}
				}
			}
		}

		System.out.println(count);
	}
	private static void find(int index) {
		for (int i = 0; i < 4; i++) { // �����cut[index]�������ҵ���
			int tempCut = cut[index] + b[i];
			if (tempCut < 1 || tempCut > 14 || tempCut == 5 || tempCut == 10) {
				continue;
			}
			for (int k = 0; k < 5; k++) {

				if (isVisit[k] == 0 && cut[k] == tempCut) {// ���cut������������tempCutƥ��Ļ���������ѯ��һ��
					isVisit[k] = 1;
					find(k);

				}

			}

		}

	}

}
