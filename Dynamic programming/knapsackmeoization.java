import java.util.*;
class knapsackmeoization{
	static int knapsack(int[] wt,int[] val,int n,int W,int[][] DP){
       if(n==0||W==0){
       	return 0;
       }
       if(DP[n-1][W]!=-1){
       	return DP[n-1][W];
       }
       if(wt[n-1]<=W){
       	int output=Math.max(val[n-1]+knapsack(wt,val,n-1,W-wt[n-1],DP),knapsack(wt,val,n-1,W,DP));
       	return DP[n-1][W]=output;
       }
       else{
       	return knapsack(wt,val,n-1,W,DP);
       }
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] wt=new int[n];
		int[] val=new int[n];
		int W=sc.nextInt();
		for(int i=0;i<n;i++){
			wt[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			val[i]=sc.nextInt();
		}
int[][] DP=new int[n][W+1];
for(int i=0;i<n;i++){
	Arrays.fill(DP[i],-1);
	}
	System.out.println(knapsack(wt,val,n,W,DP));
}
}