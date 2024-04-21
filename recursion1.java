import java.util.*;
class recursion1{
	public int factorial(int n){
		if(n>1){
			System.out.print("F("+n+")->");
			return n*factorial(n-1);
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		recursion1 r=new recursion1();
		System.out.println(r.factorial(n));
	}
}