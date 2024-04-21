import java.util.*;
class matrix2d2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Integer[][] num=new Integer[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				num[i][j]=sc.nextInt();
			}
		}
		int target=sc.nextInt();
		for(int i=0;i<n;i++){
			ArrayList<Integer> l1=new ArrayList<Integer>();
			Collections.addAll(l1,num[i]);
				Collections.sort(l1);
				//System.out.println(l1);
			int res=Collections.binarySearch(l1,target);
			if(res>=0){
				//System.out.println(res);
			System.out.print(i+"  "+(res)%m);

break;
		}
		}
	}
}