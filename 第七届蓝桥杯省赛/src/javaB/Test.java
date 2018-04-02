package javaB;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * 典型的排序组合
 * @author 49944
 *
 */
public class Test {
    public static void main(String[] args){  
        String[] array = new String[]{
                "1","2","3","4"
        };
        listAll(Arrays.asList(array),"");

        }

    private static void listAll(List asList, String string) {
        // TODO Auto-generated method stub
        if(asList.isEmpty()){
            System.out.println(string);
        }
        for (int i = 0; i < asList.size(); i++) {
            List temp = new LinkedList(asList);
           // List temp = new ArrayList(asList); 这个也行
            listAll(temp, string+temp.remove(i));
        }
    }

}
