import java.util.*;
class coinchange2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int amount=sc.nextInt();
		int[][] dp=new int[n+1][amount+1];
		for(int i=0;i<n+1;i++){
			dp[i][0]=1;
		}
		for(int j=1;j<amount+1;j++){
			dp[0][j]=0;
		}


		for(int i=1;i<n+1;i++){
			for(int j=1;j<amount+1;j++){
				if(nums[i-1]>j){
					dp[i][j]=dp[i-1][j];
				}
				else{
					dp[i][j]=dp[i-1][j]+dp[i][Math.abs(j-nums[i-1])];
				}
			}
		}
		for(int[] i:dp){
			System.out.println(Arrays.toString(i));
		}
	}
}