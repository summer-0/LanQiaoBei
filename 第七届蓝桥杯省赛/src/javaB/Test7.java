package javaB;
/**
 * ����Ʊ
	�硾ͼ1.jpg��, ��12������һ���12��Ф����Ʊ��
	������Ҫ���м���5������Ҫ����������ŵġ�
	����������һ���ǲ���������
	���磬��ͼ2.jpg������ͼ3.jpg���У��ۺ�ɫ��ʾ���־��Ǻϸ�ļ�ȡ��
	������㣬һ���ж����ֲ�ͬ�ļ�ȡ������
	1  2  3  4
	5  6  7  8
	9  10 11 12
	
 * @author 49944
 *  ����  ���ư˻ʺ�
 */
public class Test7 {
    private static int array[][] = new int[3][4];
    private static boolean isVisted[][] = new boolean[3][4];
    private static int MAXCOLS = 4;
    private static int cols[] = new int[MAXCOLS];//��¼ÿ�д�����
	
	public static void main(String[] args) {
		int num=0;
		for(int i=0; i<=2; i++){
			for(int j=0; j<=3; j++){
				array[i][j] = ++num;
				System.out.println(array[i][j]);
			}
		}
        getCount(0);
	}

	private static void getCount(int n) {
		boolean rows[] = new boolean[3];
		for(int i=0; i<n; i++){
			
		}
	}

}
