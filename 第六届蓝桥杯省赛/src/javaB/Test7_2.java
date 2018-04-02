package javaB;

public class Test7_2 {
    private static int sum = 0; //记录手中拿到的排数  最大13张
    private static int ans = 0; //记录种数
    
	public static void main(String[] args) {
        cal(1);
        System.out.println(ans);
	}

	private static void cal(int n) {
		if(sum > 13){
			return;
		}
		if(n >13){
			if(sum == 13){
				ans++;
			}
			return;
		}
		for(int i=0; i<=4; i++){
			sum = sum + i; //加上这张
			cal(n+1);
			//回退   上一种结果结束，回退一步继续
			sum = sum - i;
		}
	}

}
