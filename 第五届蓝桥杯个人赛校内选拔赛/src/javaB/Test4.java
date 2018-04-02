package javaB;

/**
 * 今有7对数字：两个1，两个2，两个3，...两个7，把它们排成一行。
 * 要求，两个1间有1个其它数字，两个2间有2个其它数字，以此类推，两个7之间有7个其它数字。如下就是一个符合要求的排列： 17126425374635
 * 当然，如果把它倒过来，也是符合要求的。 请你找出另一种符合要求的排列法，并且这个排列法是以74开头的。
 * 
 * @author 49944
 *
 */
  
//方法没错， 就是计算量太大，算不出来
public class Test4 {
    private static int[] temps;
    private static int N;
	public static void main(String[] args) {
		int arrays[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7 };
		N = arrays.length;
		temps = new int[N];
		judge(arrays, 0);
		for(int i=0; i<N; i++){
			System.out.print(temps[i]);
		}
	}

	private static void judge(int[] arrays, int n) {
		boolean[] isVisted = new boolean[N];
		
		if (n == N-1) {
			if (arrays[0]==7 && arrays[1] == 4 && arrays[8] == 7 && arrays[6] == 4) {
				isVisted[0] = true;
				isVisted[1] = true;
				isVisted[8] = true;
				isVisted[6] = true;
				// 遍历 看是否符合 两个1间有1个其它数字，两个2间有2个其它数字。。
				//  17126425374635
				for (int i = 2; i < N; i++) {
					if (!isVisted[i]) {
						int t = arrays[i];
						if (!isVisted[i] && arrays[t+1+i] == arrays[i] && (t+1+i)<N) {
							isVisted[i] = true;
							isVisted[t+1+i] = true;
						}
					}
				}
				for(int i=0; i<N; i++){
					if(!isVisted[i]){
						return;
					}
				}
				for(int i=0; i<N; i++){
					temps[i] = arrays[i];
				}
				return;
				
			}else{
				return;
			}
			
			
		}
		for (int i = n; i < N; i++) {
			int temp = arrays[n];
			arrays[n] = arrays[i];
			arrays[i] = temp;
			judge(arrays, n + 1);
			int tamp = arrays[n];
			arrays[n] = arrays[i];
			arrays[i] = tamp;
		}
	}

}
