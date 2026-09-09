package chescaWorkspace;

public class MultiDimArray {

	public static void main(String[] args) {
		int[][] temps = 
		{
				{65, 70, 68},  // Day 1 (Monday)
			    {64, 71, 69},  // Day 2 (Tuesday)
			    {66, 72, 67},  // Day 3 (Wednesday)
			    {63, 69, 66},  // Day 4 (Thursday)
			    {62, 68, 65},  // Day 5 (Friday)
			    {61, 67, 64},  // Day 6 (Saturday)
			    {60, 66, 63}   // Day 7 (Sunday)
		};
		int day=1;
		int j=0;
		String temp=" temperatures";
		
		
		for (int i=0;i<=6;i++) 
		{
			System.out.print("Day "+day+temp+": ");
			for(j=0;j<=2;j++) 
			{
				if(j<2)
				System.out.print(temps[i][j]+", ");
				if (j>=2) 
				{
					System.out.print(temps[i][j]);
				}
			}
			System.out.println();
			day++;
		}
		

	}

}
