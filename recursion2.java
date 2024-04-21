import java.util.*;
class recursion2{
	public static long power(long n,int x){
		if(x!=0){
			System.out.print(n+"^"+x+" ");
			return n*power(n,x-1);
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println();
		System.out.println(power(n,3));
	}
}