package javaB;
/**��������
	�۲�����ļӷ���ʽ��
	        �� �� �� ��                                   
   +   �� �� �� ��
	-------------------
	   �� �� �� �� ��
	(����ж������⣬���Բο���ͼ1.jpg��)
	���У���ͬ�ĺ��ִ�����ͬ�����֣���ͬ�ĺ��ִ���ͬ�����֡�
	������д�����������������4λ���֣���Ψһ������Ҫ��д�κζ������ݡ�
 * 
 * @author 49944
 *
 */
public class Test3 {
    /**
     *                      a   b   c   d
     *                   +  e   f   g   b
     *                   --------------------
     *                   e  f   c   b   h   
     * @param args
     */
	public static void main(String[] args) {
        //�����ƽ�
		for(int a=0; a<=9; a++){
			for(int b=0; b<=9; b++){
				for(int c=0; c<=9; c++){
					for(int d=0; d<=9; d++){
						for(int e=1; e<=9; e++){
							for(int f=0; f<=9; f++){
								for(int g=0; g<=9; g++){
									for(int h=0; h<=9; h++){
										int s1 = a*1000 + b*100 + c*10 + d;
										int s2 = e*1000 + f*100 + g*10 + b;
										int s3 = e*10000 + f*1000 + c*100 + b*10 + h;
										if(s1 + s2 == s3 && 
												a!=b && a!=c && a!=d && a!=e && a!=f && a!=g && a!= h &&
												b!=c && b!=d && b!=e && b!=f && b!=g && b!=h && 
												c!=d && c!=e && c!=f && c!=g && c!=h &&
												d!=e && d!=f && d!=g && d!=h &&
												e!=f && e!=g && e!=h &&
												f!=g && f!=h &&
												g!=h){
											System.out.println("s1: "+s1 + "  s2:"+s2 + "  s3:"+s3);
											
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
