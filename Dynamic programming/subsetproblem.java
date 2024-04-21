import java.util.*;
class subsetproblem{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    boolean[][] bool=new boolean[n+1][sum+1];
    for(int i=0;i<=n;i++){
      bool[i][0]=true;
    }
     for(int i=1;i<=sum;i++){
      bool[0][i]=false;
    }
    for(int i=1;i<=n;i++){
      for(int j=1;j<=sum;j++){
              if(arr[i-1]>j){
                bool[i][j]=bool[i-1][j];
              }
              else{
              bool[i][j]=bool[i-1][Math.abs(j-arr[i-1])]||bool[i-1][j];
}
      }
    }
    for(boolean[] i:bool){
         System.out.println(Arrays.toString(i));
    }
    System.out.println(bool[n][sum]);
  }
}