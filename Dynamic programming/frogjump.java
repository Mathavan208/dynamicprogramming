import java.util.*;
class frogjump{
	public static int recursion(int n,int[] energy,int[] arr){
		if(n==0){
			return 0;
		}
		if(arr[n]!=-1){
			return arr[n];
		}
		int jumpone=recursion(n-1,energy,arr)+Math.abs(energy[n]-energy[n-1]);
		int jumptwo=0;
		if(n>1){
			 jumptwo=recursion(n-2,energy,arr)+Math.abs(energy[n]-energy[n-2]);
		}
		int output=Math.min(jumpone,jumptwo);
		arr[n]=output;
		return Math.min(jumpone,jumptwo);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] energy=new int[n+1];
		int[] arr=new int[n+1];
		for(int i=1;i<n+1;i++){
			energy[i]=sc.nextInt();
		}
Arrays.fill(arr,-1);
        System.out.println(recursion(n,energy,arr));
	}
}