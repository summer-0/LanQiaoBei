package javaB;

import java.util.LinkedList;
import java.util.Scanner;

/**��Խ����
	X�ǵ�̹��ս������֣������뽻��ش�Խ�������������͸��������������ܱ���������ת�����򽫱��ϡ�
	ĳ̹����Ҫ��A����B��ȥ��A��B�������ǰ�ȫ����û���������������������������߲���·����̣�
	��֪�ĵ�ͼ��һ��������������ĸ�����A��B�������������������Ż򸺺ŷֱ��ʾ����������������
	���磺
	A + - + -
	- + - - +
	- + + + -
	+ - + - +
	B + - + -
	̹�˳�ֻ��ˮƽ��ֱ�������ƶ������ڵ�����
	���ݸ�ʽҪ��
	�����һ����һ������n����ʾ����Ĵ�С�� 4<=n<100
	��������n�У�ÿ����n�����ݣ�������A��B��+��-�е�ĳһ�����м��ÿո�ֿ���
	A��B��ֻ����һ�Ρ�
	Ҫ�����һ����������ʾ̹�˴�A����B���������ƶ�������
	���û�з����������-1
	���磺
	�û����룺
 5
	A + - + -
	- + - - +
	- + + + -
	+ - + - +
	B + - + -
	�����Ӧ�������
	10
 * 
 * @author 49944
 *
 */
public class Test4 {
    private static LinkedList list[];
	private static int n;
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        list = new LinkedList[n];
        //char[][] ch = new char[n][n];
        for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        		list[i].add(scan.next());
        	}
        }
        //�������  DFS
        dfs();
	}
	private static void dfs() {
		boolean[][] isVisted = new boolean[n][n];
		dfs("A", isVisted);
	}
	private static void dfs(String s, boolean[][] isVisted){
		
	}

}
