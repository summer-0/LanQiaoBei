package javaB;
import java.util.ArrayList;
import java.util.*;
/**标题：魔方状态
	二阶魔方就是只有2层的魔方，只由8个小块组成。
	如图p1.png所示。
	小明很淘气，他只喜欢3种颜色，所有把家里的二阶魔方重新涂了颜色，如下：
	前面：橙色
	右面：绿色
	上面：黄色
	左面：绿色
	下面：橙色
	后面：黄色
	请你计算一下，这样的魔方被打乱后，一共有多少种不同的状态。
	如果两个状态经过魔方的整体旋转后，各个面的颜色都一致，则认为是同一状态。
	请提交表示状态数的整数，不要填写任何多余内容或说明文字。
	将魔方看作一个平面*/
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
            String t1 = "";//t正序，t1倒序
            for (int i = 0; i < s.length; i++) {
                t += s[i]+"";
                t1 += s[s.length-1-i]+"";
            }
            if(!a.contains(t)&&!a.contains(t1)){
                a.add(t);
            }
            return;
        }
        for (int i = 0; i < 8; i++) {//用i选择方格
            if(v[i]==0){
                v[i] = 1;
                if(i<4){//四个黄绿橙
                    s[code] = 1;
                }
                else if(i<6){//两个黄绿
                    s[code] = 2;
                }
                else if(i<8){//两个橙绿
                    s[code] = 3;
                }
                s(code+1);
                v[i] = 0;//回溯
            }
        }
    }

}