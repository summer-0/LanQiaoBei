package javaB;

/**
 *  1  2  3  4           1   2   3   4
	5  6  7  8     --->  6   7   8   9  
	9  10 11 12          11  12  13  14
	
 * @author 49944
 *
 */
public class Test7_2 {
    private static int count = 0;//��¼�ܷ�����
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
            			   //��С��������
            			   cut[0] = stamp[a];
            			   cut[1] = stamp[b];
            			   cut[2] = stamp[c];
            			   cut[3] = stamp[d];
            			   cut[4] = stamp[e];
            			   for(int i=0; i<5; i++){
            				   isVisted[i] = false; //ÿѭ��һ�ζ�Ҫ����Ϊfalse  ....�������Ҫ
            			   }
            			   //isVisted[0] = true;
            			   //�õ�5��������֤
            			   find(0); 
            			   int flag = 1;
            			   for(int i=0; i<5; i++){
            				   if(!isVisted[i]){ //5������true,��ʾ5�����໥���㡰���ڡ�
            					   flag = 0;
            					   break; //��һ��û���ʵ�������
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
	 * ��Ҫ�������ж�ѡȡ��������Ƿ���������������ڡ���
	 * @param index
	 */
	private static void find(int index) {
		for(int i=0; i<4; i++){ //�����  index�������ҵ���
			int temp = cut[index] + b[i];
            //�����ж�cut�е����Ƿ����㡰���ڡ�����,ֻҪ��һ�����оͲ�����			
			if(temp<1 || temp>14 || temp ==5 || temp==10){ //�ж��Ƿ���stamp�����е��� ...��һ��ִ�й�һ��ͨ���˾ʹ����������е���
				continue;
			}
			for(int k=0; k<5; k++){
				if(cut[k] == temp && !isVisted[k] ){//��cut�������ҵ�����������Ƿ񱻷���
					                                //����ҵ�����δ�����ʣ�����Ϊtrue,Ȼ����cut�����е���һ��
					                            //���cut������������tempCutƥ��Ļ���������ѯ��һ��
					isVisted[k] = true;
					find(k);
				}
			}
		}
	}

}
