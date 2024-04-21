import java.util.*;
class knapsacktabulation{
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
int[][] DP=new int[n+1][W+1];
   for(int i=0;i<=n;i++){
   	for(int j=0;j<=W;j++){
         if(i==0||j==0){
         	DP[i][j]=0;
         }
         else if(wt[i-1]<=j){
            DP[i][j]=Math.max((val[i-1]+DP[i-1][j-wt[i-1]]),DP[i-1][j]);
         }
         else{
         	DP[i][j]=DP[i-1][j];
         }
     
   	}
   }
   System.out.println(DP[n][W]);
  for(int[] i:DP){
  	System.out.println(Arrays.toString(i));
  }

	}
}