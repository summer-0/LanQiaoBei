package javaB;
/**
 * ���⣺��󹫹��Ӵ�
	��󹫹��Ӵ�����������ǣ�
	���������������Ӵ����ܹ�ƥ���ϵ���󳤶��Ƕ��١�
	���磺"abcdkkk" �� "baabcdadabc"��
	�����ҵ�����Ĺ����Ӵ���"abcd",������󹫹��Ӵ�����Ϊ4��
	����ĳ����ǲ��þ��󷨽������ģ���Դ��Ĺ�ģ�����������ǱȽ���Ч�Ľⷨ��
	������ýⷨ��˼·������ȫ���߲���ȱʧ�Ĵ��롣
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
						a[i][j] = __________________;  //��� 
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
     * ���Լ�д�ķ���
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
    	String maxCommon = ""; //���ڴ洢���Ĺ����Ӵ�
    	for(int i=0; i<min.length(); i++){
    		for(int j=min.length()-1; j>=i; j--){
    			
    			target = min.substring(i, j); //min���ִ�..  �����õ� min ���ִ�  �������õ��� max ���ִ���Ƚ�
    			
    			for(int k=0; k<max.length(); k++){
    				for(int n=max.length()-1; n>=k; n--){
    					if(target.equals(max.substring(k, n))){ //max.substring(k, n) max���ִ�
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
	 * δ��ɵķ���..
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
     * ����
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
       //����㣺min�Ӵ��ĳ��ȣ�����󳤶ȿ�ʼ
       for (int i = min.length(); i >= 1; i--) {
           //��������Ϊi��min�Ӵ�����0��ʼ
           for (int j = 0; j <= min.length() - i; j++) {  
               target = min.substring(j, j + i);  
               //��������Ϊi��max�Ӵ����ж��Ƿ���target�Ӵ���ͬ����0��ʼ
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
