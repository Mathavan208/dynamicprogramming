import java.util.*;
class partionsubset{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		int diff=sc.nextInt();

		int s1=(diff+sum)/2;
		int sum1=0;
		int[][] bool=new int[n+1][s1+1];
		if((diff+sum)%2!=0){
            sum1=0;
		}

	else{
	
	
	for(int i=0;i<n+1;i++){
		for(int j=0;j<s1+1;j++){
          if(i==0&&j==0)
	bool[i][j]=1;
          else if(i==0)
	bool[i][j]=0;
            else{
            	if(arr[i-1]<=j){
            		bool[i][j]=bool[i-1][j]+bool[i-1][(j-arr[i-1])];
            	}
            	else{
            		bool[i][j]=bool[i-1][j];
            	}
            }
            
		}
	}
	for(int[] i:bool){
		System.out.println(Arrays.toString(i));
	}
	 
        
       
    }
     System.out.println(bool[n][s1]);
	}
}