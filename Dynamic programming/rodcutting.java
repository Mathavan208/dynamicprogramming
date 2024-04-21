import java.util.*;
class rodcutting{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] len=new int[n];
		for(int i=0;i<n;i++){
			len[i]=sc.nextInt();
		}
		int[] price=new int[n];
		for(int i=0;i<n;i++){
			price[i]=sc.nextInt();
		}
		int len1=sc.nextInt();

		int[][] dp=new int[n+1][len1+1];
		for(int i=0;i<n+1;i++){
			dp[i][0]=0;
		}
		for(int i=0;i<len1+1;i++){
			dp[0][i]=0;
		}
		for(int i=1;i<n+1;i++){
			for(int j=1;j<len1+1;j++){
				if(len[i-1]>j){
					dp[i][j]=dp[i-1][j];
				}
				else{
				dp[i][j]=Math.max(price[i-1]+dp[i][j-len[i-1]],dp[i-1][j]);
			}
			}
		}
		for(int[] i:dp){
			System.out.println(Arrays.toString(i));
		}
	}
}