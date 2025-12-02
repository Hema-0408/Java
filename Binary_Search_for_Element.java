//Binary Search for Element
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] arr= new int[n];
	  for(int i=0;i<n;i++)
	  {
	      arr[i]=sc.nextInt();
	  }
	  Arrays.sort(arr);
	  int target=sc.nextInt();
	  int left=0,right=arr.length-1;
	  int mid=-1;
	  boolean found=false;
	  while(left<=right)
	  {
	      mid=left+(right-left)/2;
	      if(arr[mid]==target)
	      {
	          found=true;
	          break;
	      }
	      else if(arr[mid]<target)
	      {
	          left=mid+1;
	      }
	      else{
	          right=mid-1;
	      }
	  }
	  if(found)
	  {
	      System.out.print(mid);
	  }
	  else
	  {
	      System.out.print(-1);
	  }
	}
}