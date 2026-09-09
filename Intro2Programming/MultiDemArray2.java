package chescaWorkspace;

public class MultiDemArray2 {

	public static void main(String[] args) {
		int row;
		int bookNum=1;
		String yes="Available";
		String no="Checked Out";
		int[][] transact= 
		{
				{1,1},
				{2,1},
				{3,1},
				{4,1},
				{5,0},
				{6,1},
				{7,1},
				{8,0},
				{9,1},
		};
		
		System.out.println("BOOK SYSTEM");
		
		for(row=0;row<=8;row++) 
		{
				if (transact[row][1]==1) {
					System.out.println("Book "+bookNum+": "+yes);
				} else if(transact[row][1]==0) 
				{
					System.out.println("Book "+bookNum+": "+no);
				}
				bookNum++;
		}
			
		}
		// TODO Auto-generated method stub

	}


