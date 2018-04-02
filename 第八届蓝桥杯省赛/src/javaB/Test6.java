package javaB;
/**
 * 标题：最大公共子串
	最大公共子串长度问题就是：
	求两个串的所有子串中能够匹配上的最大长度是多少。
	比如："abcdkkk" 和 "baabcdadabc"，
	可以找到的最长的公共子串是"abcd",所以最大公共子串长度为4。
	下面的程序是采用矩阵法进行求解的，这对串的规模不大的情况还是比较有效的解法。
	请分析该解法的思路，并补全划线部分缺失的代码。
	public class Main
	{
		static int f(String s1, String s2)
		{
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			int[][] a = new int[c1.length+1][c2.length+1];
			int max = 0;
			for(int i=1; i<a.length; i++){
				for(int j=1; j<a[i].length; j++){
					if(c1[i-1]==c2[j-1]) {
						a[i][j] = __________________;  //填空 
						if(a[i][j] > max) max = a[i][j];
					}
				}
			}
			return max;
		}
		public static void main(String[] args){
			int n = f("abcdkkk", "baabcdadabc");
			System.out.println(n);
		}
	}
 * @author 49944
 *
 */
public class Test6 {

	public static void main(String[] args) {
        String str1 = "abdcdakakk";
        String str2 = "baabcdadabc";
        long start = System.currentTimeMillis();
        System.out.println(getCommonStr(str1,str2));
        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
	}
//  "abcdkkk"   "baabcdadabc"
	/**
     * 我自己写的方法
     * @param str1
     * @param str2
     * @return
     */
    public static int getCommonStr(String str1, String str2){
    	int len1 = str1.length();
    	int len2 = str2.length();
    	String min = len1 > len2 ? str2 : str1;
    	String max = len1 < len2 ? str2 : str1;
    	String target = null;
    	String maxCommon = ""; //用于存储最大的公共子串
    	for(int i=0; i<min.length(); i++){
    		for(int j=min.length()-1; j>=i; j--){
    			
    			target = min.substring(i, j); //min的字串..  不断拿到 min 的字串  与下面拿到的 max 的字串相比较
    			
    			for(int k=0; k<max.length(); k++){
    				for(int n=max.length()-1; n>=k; n--){
    					if(target.equals(max.substring(k, n))){ //max.substring(k, n) max的字串
    						if(target.length() > maxCommon.length()){
    							maxCommon = target;
    						}
    					}
    				}
    			}
    		}
    	}
    	System.out.println(maxCommon);
    	return maxCommon.length();
    }
	
	/**
	 * 未完成的方法..
	 * @param str1
	 * @param str2
	 * @return
	 */
    /*public static int getMaxCommon(String str1, String str2){
    	if(str1.length() == 0 || str2.length() == 0){
    		return 0;
    	}
    	
    	int sum = 0;
    	int k=0;
    	for(int i=0; i<str1.length(); i++){
    		for(int j=0; j<str2.length(); j++){
    			if(str2.indexOf(j) == str1.indexOf(i)){
    				sum++;
    				k = j;
    				break;
    			}
    		}
    		
    	}
    	return Math.max(getMaxCommon(str1.substring(1), str2), getMaxCommon(str1, str2.substring(1)));
    }*/
    /**
     * 启发
     * @param str1
     * @param str2
     * @return
     */
    /*int getCommonStrLength(String str1, String str2) {
        str1 = str1.toLowerCase();  
       str2 = str2.toLowerCase();  
       int len1 = str1.length();  
       int len2 = str2.length();  
       String min = null;  
       String max = null;  
       String target = null;
       min = len1 <= len2 ? str1 : str2;
       max = len1 >  len2 ? str1 : str2;
       //最外层：min子串的长度，从最大长度开始
       for (int i = min.length(); i >= 1; i--) {
           //遍历长度为i的min子串，从0开始
           for (int j = 0; j <= min.length() - i; j++) {  
               target = min.substring(j, j + i);  
               //遍历长度为i的max子串，判断是否与target子串相同，从0开始
               for (int k = 0; k <= max.length() - i; k++) {  
                   if (max.substring(k,k + i).equals(target)) {  
                       return i;  
                   }
               }
           }
       }  
       return 0;  
    }*/
    
}
