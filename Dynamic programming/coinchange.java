import java.util.*;
class coinchange{
	public static void main(String[] args){
		//For unbounded knapsack we can check the inclusion and exclusion for multiple ways
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		//Arrays.sort(arr);
		int target=sc.nextInt();
		int[][] dp=new int[n+1][target+1];
		for(int i=0;i<n+1;i++){
              dp[i][0]=0;
		}
		for(int i=1;i<target+1;i++){
              dp[0][i]=Integer.MAX_VALUE;
		}
   for(int i=1;i<n+1;i++){
 for(int j=1;j<target+1;j++){
 	if(arr[i-1]>j){
 		dp[i][j]=dp[i-1][j];
 	}
 	else{
 		dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-arr[i-1]]);
 	}
 }
   }
   for(int[] i:dp){
   	System.out.println(Arrays.toString(i));
   }
	}
}