import java.util.*;
class permute{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		//List<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			//l1.add(arr[i]);
		}
		Arrays.sort(arr);
		int left=0;
		for(int i=0;i<n;i++){
		
            if(arr[i]>arr[left]){
            	left++;
            }            
			
	
}
System.out.println(left);
		}
}