package chescaWorkspace;

public class ArrayExercise2 
{

	public static void main(String[] args) 
	{
		int[] stockLvl= {8,12,3,10,5,1,0,8};
		int productNum =1;
		String status= "";
		for(int counter=0;counter<=7;counter++,productNum++) 
		{
			if (stockLvl[counter]==0) 
			{
				status="Out of Stock";
			} 
			else if (stockLvl[counter]<=5)
			{
				status="Low Stock";
			}
			else if (stockLvl[counter]>5) 
			{
				status="Sufficient Stock";
			}
			System.out.println("Product "+productNum+": "+status);
			
		}

	}

}
