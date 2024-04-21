import java.util.*;
class memoization{
	static int fibbonacci(int  n,int[] arr){
		if(n==1||n==0){
			return n;
		}
		if(arr[n]>0){
			return arr[n];
		}
		int output=fibbonacci(n-1,arr)+fibbonacci(n-2,arr);
		arr[n]=output;
		return output;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		Arrays.fill(arr,-1);
		System.out.println(fibbonacci(n,arr));
	}
}