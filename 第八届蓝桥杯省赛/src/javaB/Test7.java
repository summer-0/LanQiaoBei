package javaB;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Test7 {
	/**
	 * ��������
	 * С����������һ����ʷ���ס���Щ��ʷ�����г����˺ܶ����ڡ�С��֪����Щ���ڶ���1960��1��1����2059��12��31�ա���С��ͷ�۵��ǣ���Щ���ڲ��õĸ�ʽ�ǳ���ͳһ���в�����/��/�յģ��в�����/��/��ģ����в�����/��/��ġ������鷳���ǣ����Ҳ��ʡ����ǰ��λ��ʹ�������ϵ�һ�����ڣ����ںܶ���ܵ����������Ӧ��
	 * ����02/03/04��������2002��03��04�ա�2004��02��03�ջ�2004��03��02�ա�
	 * ����һ�������ϵ����ڣ����ܰ���С���ж�����Щ���ܵ����ڶ����Ӧ�� ���� ---- һ�����ڣ���ʽ��"AA/BB/CC"�� (0 <= A, B,
	 * C <= 9) ���� ---- ������ɸ�����ͬ�����ڣ�ÿ������һ�У���ʽ��"yyyy-MM-dd"��������ڰ����絽�����С� 
	 * �������� ----
	 * 02/03/04
	 *  ������� ---- 2002-03-04 2004-02-03 2004-03-02
	 * 
	 * @param args
	 */
	static String aa, bb, cc;
	static HashSet<Integer> res = new HashSet<Integer>();
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in); String str = scan.nextLine();
		 * // DateFormat.parse("");
		 * 
		 * Date date = new Date();
		 */
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] ss = s.split("/");  //�������һ��String[]����
		aa = ss[0];
		bb = ss[1];
		cc = ss[2];
		// ��/��/��
		getDate(aa, bb, cc);
		// ��/��/��
		getDate(bb, cc, aa);
		// ��/��/��
		getDate(cc, bb, aa);
		list.addAll(res);
		Collections.sort(list);
		for (int i : res) {
			System.out.println(
					("" + i).substring(0, 4) + "-" + ("" + i).substring(4, 6) + "-" + ("" + i).substring(6, 8));
		}
	}

	static void getDate(String aa, String bb, String cc) {
		int a;
		if (Integer.parseInt(aa) >= 0 && Integer.parseInt(aa) <= 59) {
			a = Integer.parseInt(("20" + aa));
		} else {
			a = Integer.parseInt(("19" + aa));
		}
		int b = Integer.parseInt(bb);
		int c = Integer.parseInt(cc);
		if (((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) && b == 2 && c > 0 && c <= 29)
			res.add(Integer.parseInt("" + a + bb + cc));
		if (a % 4 != 0 && b == 2 && c > 0 && c <= 28) {
			res.add(Integer.parseInt("" + a + bb + cc));
		}
		if ((b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) && c > 0 && c <= 31) {
			res.add(Integer.parseInt("" + a + bb + cc));
		}
		if ((b == 4 || b == 6 || b == 9 || b == 11) && c > 0 && c <= 30) {
			res.add(Integer.parseInt("" + a + bb + cc));
		}

	}
}
