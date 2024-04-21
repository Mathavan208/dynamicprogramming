import java.util.*;
class closest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum1=0;
		for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
           sum1=sum1+arr[i];
		}	
		Arrays.sort(arr);	
int target=sc.nextInt();
int diff=Integer.MAX_VALUE;
int sum=0;
List<Integer> l1=new ArrayList<Integer>();
int temp=0;
for(int i=0;i<n;i++){
	int left=i+1;
	int right=n-1;
	
	while(left<right){
		if(left<right){
	 sum=arr[i]+arr[left]+arr[right];
	 if(Math.abs(target-sum)<diff){
	 	diff=Math.abs(target-sum);
	 	temp=sum;
	 }
        if(sum<target){
        	left++;
        }
        else if(sum>target){
        	right--;
        }
        else{
        	left++;
        	right--;
        }


}
   
	}


// 	if(sum>=0){
// 	temp=Math.min(temp,sum);
// }
	System.out.println(temp);
	}
	// Collections.sort(l1);
	// System.out.println(l1.get(0));
	System.out.println(temp);
}
}