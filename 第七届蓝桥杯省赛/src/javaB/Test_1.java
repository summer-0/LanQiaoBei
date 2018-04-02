package javaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 典型的组合排序
 * @author 49944
 *
 */
public class Test_1 {

	public static void main(String[] args) {
       String[] str = {"1","2","3","4","5"};
       allSort(Arrays.asList(str), "");
	}

	private static void allSort(List asList, String string) {
		if(asList.isEmpty()){
			for(int i=0; i<string.length(); i++){
				System.out.print(string.charAt(i));
			}
			System.out.println();
			return;
		}
		for(int i=0; i<asList.size(); i++){
			List temp = new ArrayList(asList);
			allSort(temp, string+temp.remove(i));
		}
	}
}
