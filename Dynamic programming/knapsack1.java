import java.util.*;
class knapsack1{
	static int knapsack(int[] wt,int[] val,int n,int weight){
		if(n==0||weight==0)
			return 0;
		if(wt[n-1]<=weight){
			return Math.max((val[n-1]+knapsack(wt,val,n-1,weight-wt[n-1])),knapsack(wt,val,n-1,weight));
		}
		else{
			return knapsack(wt,val,n-1,weight);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int wt[]=new int[n];
		int val[]=new int[n];
		int weight=sc.nextInt();
        for(int i=0;i<n;i++){
        	wt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        	val[i]=sc.nextInt();
        }
        System.out.println(knapsack(wt,val,n,weight));
	}
}