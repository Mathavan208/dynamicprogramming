import java.util.*;
class matrix2d{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
a[i][j]=sc.nextInt();
			}
		}
		//transpose
		int[][] transpose=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				transpose[i][j]=a[j][i];
			}
		}
		//reverse
		for(int i=0;i<n;i++){
			for(int j=0;j<m/2;j++){
				int temp=0;
				temp=transpose[i][j];
				transpose[i][j]=transpose[i][m-j-1];
				transpose[i][m-j-1]=temp;
			}
		}
	for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}
}