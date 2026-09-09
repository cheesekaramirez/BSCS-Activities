package dsa;

public class InsertionOperation {

	public static void main(String[] args) 
	{
		int[] LA= {1,3,5,7,8};
		int item=10,k=3,n=5;
		int i=0,j=n;
		
		System.out.print("The original array elements are : \n");
		for(i=0;i<n;i++) 
		{
			System.out.printf("LA[%d]=%d \n",i,LA[i]);
		}
		
		int[] newLA=new int[n+1];
		
		for(i=0;i<n;i++) 
		{
			newLA[i]=LA[i];
		}
		
		j=n-1;
		
		while(j>=k)
		{
			newLA[j+1]=newLA[j];
			j=j-1;
		}
		
		newLA[k]=item;
		
		n=n+1;
		
		System.out.print("The array elements after insertion:\n");
		
		for(i=0;i<n;i++) 
		{
			System.out.printf("LA[%d]=%d%n",i,newLA[i]);
		}
	}

}
