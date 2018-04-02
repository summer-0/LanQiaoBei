package javaB;

public class Test2_1 {
	public static int sum = 0;// 计数器

	public static void fun(int a[], int n) {
		if (n == 9) {
			text(a);
			return;
		} else {
			for (int i = n; i < 9; i++) { // n后面的
				int temp = a[i];
				a[i] = a[n];
				a[n] = temp;
				fun(a, n + 1);
				int tamp = a[i];
				a[i] = a[n];
				a[n] = tamp;
			}
		}
	}

	public static void text(int a[]) {
		int l1 = a[0] + a[1] + a[2];
		int l2 = a[3] + a[4] + a[5];
		int l3 = a[6] + a[7] + a[8];
		int s1 = a[0] + a[3] + a[6];
		int s2 = a[1] + a[4] + a[7];
		int s3 = a[2] + a[5] + a[8];
		int x1 = a[0] + a[4] + a[8];
		int x2 = a[2] + a[4] + a[6];
		if (l1 != l2 && l1 != l3 && l1 != s1 && l1 != s2 && l1 != s3 && l1 != x1 && l1 != x2)
			if (l2 != l3 && l2 != s1 && l2 != s2 && l2 != s3 && l2 != x1 && l2 != x2)
				if (l3 != s1 && l3 != s2 && l3 != s3 && l3 != x1 && l3 != x2)
					if (s1 != s2 && s1 != s3 && s1 != x1 && s1 != x2)
						if (s2 != s3 && s2 != x1 && s2 != x2)
							if (s3 != x1 && s3 != x2)
								if (x1 != x2)
									sum++;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		fun(a, 0);
		System.out.print(sum / 8);
	}
}
