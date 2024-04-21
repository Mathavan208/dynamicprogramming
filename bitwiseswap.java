import java.util.*;
class bitwiseswap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(n+"  "+m);
		n=n^m;
		m=m^n;
		n=n^m;
		System.out.println(n +"  "+m);
// 		int count=0;
// 		int m=sc.nextInt();
// 		int temp=m;
// 		while((temp)>1){
// 			temp=temp>>1;
// count++;
// 		}
// 		System.out.println(Math.pow(2,count));
// // 		System.out.println(n<<2);
// // //System.out.println(n-(n>>1));
		}
}