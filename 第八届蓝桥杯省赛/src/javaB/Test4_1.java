package javaB;
import java.util.ArrayList;
import java.util.*;
/**���⣺ħ��״̬
	����ħ������ֻ��2���ħ����ֻ��8��С����ɡ�
	��ͼp1.png��ʾ��
	С������������ֻϲ��3����ɫ�����аѼ���Ķ���ħ������Ϳ����ɫ�����£�
	ǰ�棺��ɫ
	���棺��ɫ
	���棺��ɫ
	���棺��ɫ
	���棺��ɫ
	���棺��ɫ
	�������һ�£�������ħ�������Һ�һ���ж����ֲ�ͬ��״̬��
	�������״̬����ħ����������ת�󣬸��������ɫ��һ�£�����Ϊ��ͬһ״̬��
	���ύ��ʾ״̬������������Ҫ��д�κζ������ݻ�˵�����֡�
	��ħ������һ��ƽ��*/
public class Test4_1 {
    static int[] v = new int[8];
    static int[] s = new int[8];
    static ArrayList<String> a = new ArrayList<String>();
    public static void main(String[] args) {
        s(0);
        System.out.println(a.size());
    }
    public static void s(int code){
        if(code==8){
            String t = "";
            String t1 = "";//t����t1����
            for (int i = 0; i < s.length; i++) {
                t += s[i]+"";
                t1 += s[s.length-1-i]+"";
            }
            if(!a.contains(t)&&!a.contains(t1)){
                a.add(t);
            }
            return;
        }
        for (int i = 0; i < 8; i++) {//��iѡ�񷽸�
            if(v[i]==0){
                v[i] = 1;
                if(i<4){//�ĸ����̳�
                    s[code] = 1;
                }
                else if(i<6){//��������
                    s[code] = 2;
                }
                else if(i<8){//��������
                    s[code] = 3;
                }
                s(code+1);
                v[i] = 0;//����
            }
        }
    }

}