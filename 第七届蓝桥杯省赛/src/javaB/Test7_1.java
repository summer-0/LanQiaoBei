package javaB;

public class Test7_1 {

	public static int count = 0; // 记录总的方案数
	public static int cut[] = new int[5]; // 从所有诱骗中选出5张从小到大号码不同的邮票，存入该数组中避免选取的邮票出现重复
	public static int isVisit[] = new int[5]; // 判断取出的5张邮票是否已经访问
	public static int b[] = { +1, -1, +5, -5 }; // 判断取出的5张邮票是否相连，+1表示与右边相连，-1表示左边，+5表示下面，-5表示上面

	public static void main(String[] args) {
		int stamp[] = new int[12]; // 定义所有邮票号码
		for (int i = 1, k = 1; i <= 12; i++) { // 初始化所有的邮票号码为{1,2,3,4,6,7,8,9,11,12,13,14}
			stamp[i - 1] = k++;
			if (i % 4 == 0) {
				k++;
			}
		}
		for (int a = 0; a < 12; a++) { // 通过for循环取出5张邮票，号码从小到大
			for (int b = a + 1; b < 12; b++) {
				for (int c = b + 1; c < 12; c++) {
					for (int d = c + 1; d < 12; d++) {
						for (int e = d + 1; e < 12; e++) {
							// 将取出的邮票存入cut数组中，保存
							cut[0] = stamp[a];
							cut[1] = stamp[b];
							cut[2] = stamp[c];
							cut[3] = stamp[d];
							cut[4] = stamp[e];
							for (int i = 0; i < 5; i++) { // 初始化取出的邮票都为未访问状态
								isVisit[i] = 0;
							}
							// 开始访问
							isVisit[0] = 1; // 另cut数组头为已访问状态
							// 从cut数组头开始，判断该方案是否可行
							find(0);
							int flag = 1; // 当flag为1时可行，否则不可行
							for (int j = 0; j < 5; j++) {
								if (isVisit[j] == 0) { // 只要一个数未访问到则说明不可行
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
		for (int i = 0; i < 4; i++) { // 计算出cut[index]上下左右的数
			int tempCut = cut[index] + b[i];
			if (tempCut < 1 || tempCut > 14 || tempCut == 5 || tempCut == 10) {
				continue;
			}
			for (int k = 0; k < 5; k++) {

				if (isVisit[k] == 0 && cut[k] == tempCut) {// 如果cut数组里有数与tempCut匹配的话，继续查询下一个
					isVisit[k] = 1;
					find(k);

				}

			}

		}

	}

}
