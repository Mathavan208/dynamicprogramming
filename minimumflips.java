import java.util.*;
class minimumflips{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int flips=0;
		while(a>0||b>0||c>0){
			int x1=a&1;
			int x2=b&1;
			int x3=c&1;
			//System.out.print(x1+" "+x2+" " +(x1&x2)+" ");
			if((x1|x2)!=x3){
				if((x1&x2)!=0)
					flips=flips+2;
				else
					flips=flips+1;
			}
			a=a>>1;
			b=b>>1;
			c=c>>1;
			
		}
		System.out.println(flips);
	}
}