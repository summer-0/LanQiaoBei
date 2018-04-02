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
	 * 日期问题
	 * 小明正在整理一批历史文献。这些历史文献中出现了很多日期。小明知道这些日期都在1960年1月1日至2059年12月31日。令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。
	 * 比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。
	 * 给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？ 输入 ---- 一个日期，格式是"AA/BB/CC"。 (0 <= A, B,
	 * C <= 9) 输入 ---- 输出若干个不相同的日期，每个日期一行，格式是"yyyy-MM-dd"。多个日期按从早到晚排列。 
	 * 样例输入 ----
	 * 02/03/04
	 *  样例输出 ---- 2002-03-04 2004-02-03 2004-03-02
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
		String[] ss = s.split("/");  //分离后是一个String[]数组
		aa = ss[0];
		bb = ss[1];
		cc = ss[2];
		// 年/月/日
		getDate(aa, bb, cc);
		// 月/日/年
		getDate(bb, cc, aa);
		// 日/月/年
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
