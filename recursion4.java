import java.util.*;
class recursion4{
	static int print(int[] arr,int size,int i,int k){
         if(i==-1){
         	return 0;
         }
         if(arr[i]==k)
         	return i;
          //System.out.print(arr[i]+" ");	
         return print(arr,size,i=i-1,k);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.print(print(arr,n,n-1,k));
	}
}
