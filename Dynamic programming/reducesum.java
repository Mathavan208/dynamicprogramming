import java.util.*;
class reducesum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		boolean[][] dp1=new boolean[n+1][sum+1];
		for(int i=0;i<n+1;i++){
			dp1[i][0]=true;
		}
		for(int i=0;i<sum+1;i++){
			dp1[0][i]=false;
		}

for(int i=1;i<n+1;i++){
 	for(int j=1;j<sum+1;j++){
          if(nums[i-1]>j){
          	dp1[i][j]=dp1[i-1][j];
          }
          else{
          	dp1[i][j]=dp1[i-1][j]||dp1[i-1][j-nums[i-1]];
          }
 	}
 }
 for(boolean[] b :dp1){
 	System.out.println(Arrays.toString(b));
 }
 boolean[][] dp2=new boolean[n+1][sum+1];
for(int i=n+1;i>=1;i--){
 	for(int j=1;j<sum+1;j++){
          if(nums[i-1]>j){
          	dp1[i][j]=dp1[i-1][j];
          }
          else{
          	dp1[i][j]=dp1[i-1][j]||dp1[i-1][j-nums[i-1]];
          }
 	}
 }
 for(boolean[] b:dp2){
 	System.out.println(Arrays.toString(b));
 }
	}
}