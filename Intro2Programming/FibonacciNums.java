package chescaWorkspace;

public class FibonacciNums 
{

	public static void main(String[] args) 
	{
		int[] nums = new int[21];
		nums[0]= 0;
		nums[1]= 1;
		
		for (int i=0, times=2;i<times;i++) 
		{
			System.out.print(nums[i]+"\t");
		}
		
		for(int i=1;i<nums.length-1;i++) 
		{
			int sum=nums[i-1]+nums[i];
			nums[i+1]=sum;
			System.out.print(nums[i+1]+"\t");
		}
		
	}
		
}



