import java.util.*;
class sum3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }
    Arrays.sort(nums);
       
        List<List<Integer>> l1=new ArrayList<List<Integer>>();
        int i;
        //int flag=0;
        for(i=0;i<nums.length;i++){
              List<Integer> l=new ArrayList<Integer>();
            int left=i+1;
            int right=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]){
              continue;
            }
           
          while(left<right){

              if(nums[left]+nums[right]+nums[i]<0){
                  left++;
              }
              else if(nums[left]+nums[right]+nums[i]>0){
                  right--;
              }
              else if(nums[left]+nums[right]+nums[i]==0){
                 //flag=1;
                 
                  l1.add(Arrays.asList(nums[i],nums[left],nums[right]));
                 while(left<right&&nums[left]==nums[left+1])
  left++;
while(left<right&&nums[right]==nums[right-1])
  right--;
                
                  
                  left++;
                  right--;
  
              }
          }
            

          
        }
        System.out.println(l1);
  }
}