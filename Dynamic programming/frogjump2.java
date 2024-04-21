import java.util.*;
class frogjump2{
	public static int recursion(int n,int[] energy,int k){
		if(n==0){
			return 0;
		}
		int steps=Integer.MAX_VALUE;
		
		for(int j=1;j<=k;j++){
			if(n-j>=0){
        int jump=recursion(n-j,energy,k)+Math.abs(energy[n]-energy[n-j]);
         steps=Math.min(jump,steps);
			}
		}
		return steps;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] energy=new int[n+1];
		for(int i=1;i<n+1;i++){
			energy[i]=sc.nextInt();
		}
int k=sc.nextInt();
System.out.println(recursion(n,energy,k));
	}
}