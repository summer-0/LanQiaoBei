package javaB;

/**
 *  1  2  3  4           1   2   3   4
	5  6  7  8     --->  6   7   8   9  
	9  10 11 12          11  12  13  14
	
 * @author 49944
 *
 */
public class Test7_2 {
    private static int count = 0;//记录总方案数
    private static int[] cut = new int[5];
    private static boolean[] isVisted = new boolean[5];
    private static int b[] = new int[]{+1, -1, +5, -5};
	public static void main(String[] args) {
        int[] stamp = new int[]{1,2,3,4,6,7,8,9,11,12,13,14};
        for(int a=0; a<12; a++){
        	for(int b=a+1; b<12; b++){
               for(int c=b+1; c<12; c++){
            	   for(int d=c+1; d<12; d++){
            		   for(int e=d+1; e<12; e++){
            			   //从小到大拿数
            			   cut[0] = stamp[a];
            			   cut[1] = stamp[b];
            			   cut[2] = stamp[c];
            			   cut[3] = stamp[d];
            			   cut[4] = stamp[e];
            			   for(int i=0; i<5; i++){
            				   isVisted[i] = false; //每循环一次都要先置为false  ....这里必须要
            			   }
            			   //isVisted[0] = true;
            			   //拿到5个数后验证
            			   find(0); 
            			   int flag = 1;
            			   for(int i=0; i<5; i++){
            				   if(!isVisted[i]){ //5个都是true,表示5个都相互满足“相邻”
            					   flag = 0;
            					   break; //有一个没访问到就跳出
            				   }
            			   }
            			   if(flag == 1){
            				   count++;
            			   }
            		   }
            	   }
               }		
        	}
        }
        System.out.println(count);
	}
	/**
	 * 主要作用是判断选取的五个数是否符合条件（“相邻”）
	 * @param index
	 */
	private static void find(int index) {
		for(int i=0; i<4; i++){ //计算出  index上下左右的数
			int temp = cut[index] + b[i];
            //用于判断cut中的数是否满足“相邻”条件,只要有一个不行就不成立			
			if(temp<1 || temp>14 || temp ==5 || temp==10){ //判断是否是stamp数组中的数 ...这一行执行过一次通过了就代表是数组中的数
				continue;
			}
			for(int k=0; k<5; k++){
				if(cut[k] == temp && !isVisted[k] ){//在cut数组中找到这个数，看是否被访问
					                                //如果找到了且未被访问，就置为true,然后找cut数组中的下一个
					                            //如果cut数组里有数与tempCut匹配的话，继续查询下一个
					isVisted[k] = true;
					find(k);
				}
			}
		}
	}

}
