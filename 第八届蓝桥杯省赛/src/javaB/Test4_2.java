package javaB;

import java.util.ArrayList;

public class Test4_2 {
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
            String t1 = "";//tÕýÐò£¬t1µ¹Ðò  
            for (int i = 0; i < s.length; i++) {  
                t += s[i]+"";  
                t1 += s[s.length-1-i]+"";  
            }  
            if(!a.contains(t)&&!a.contains(t1)){  
                a.add(t);  
            }  
            return;  
        }  
        for (int i = 0; i < 8; i++) {  
            if(v[i]==0){  
                v[i] = 1;  
                if(i<4){  
                    s[code] = 1;  
                }  
                else if(i<6){  
                    s[code] = 2;  
                }  
                else if(i<8){  
                    s[code] = 3;  
                }  
                s(code+1);  
                v[i] = 0;  
            }  
        }  
    }  
}
