package javaB;

/**
 * ����7�����֣�����1������2������3��...����7���������ų�һ�С�
 * Ҫ������1����1���������֣�����2����2���������֣��Դ����ƣ�����7֮����7���������֡����¾���һ������Ҫ������У� 17126425374635
 * ��Ȼ�����������������Ҳ�Ƿ���Ҫ��ġ� �����ҳ���һ�ַ���Ҫ������з�������������з�����74��ͷ�ġ�
 * 
 * @author 49944
 *
 */
  
//����û�� ���Ǽ�����̫���㲻����
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
				// ���� ���Ƿ���� ����1����1���������֣�����2����2���������֡���
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
