package chescaWorkspace;
import java.text.DecimalFormat;
import java.util.Scanner;


public class RecreateMenu {
	
	Scanner scn = new Scanner(System.in);
    DecimalFormat cash = new DecimalFormat("$ ###,###,###.00");
    DecimalFormat percent = new DecimalFormat("#.00%");
    

	public void main(String[] args) {
		String[] prodName = new String[3];
		double[] prodPrice = new double[3];
		double discPrice=0;
        double interestPrice=0;
        double monthlyAmort=0;
        double cashDiscRate=0;
        double threeMonthInstallRate=0;
        double sixMonthInstallRate=0;
        double twelveMonthInstallRate=0;
        boolean isCash=false;
        boolean is3Months=false;
        boolean is6Months=false;
        boolean is12Months=false;
        char menu;
        int modeForPay;
        
        for(int i=0; i<3;i++) 
        {
        	System.out.print("Enter Product "+(i+1)+": \t");
            prodName[i]= scn.nextLine();
            
            System.out.print("Enter Price "+(i+1)+": \t");
            prodPrice[i]= scn.nextDouble();
        }
        
        paymentTerms(cashDiscRate, threeMonthInstallRate, sixMonthInstallRate, twelveMonthInstallRate);
        
        

	}
	
	public void paymentTerms(double cashDiscRate, double threeMonthInstallRate, double sixMonthInstallRate, double twelveMonthInstallRate) 
	{
		System.out.print("\nInput Mode of Payment Terms");
        System.out.print("\nCash Discount:");
        cashDiscRate = scn.nextDouble()/100;
        System.out.print("\tYou input "+percent.format(cashDiscRate)+" Discount for Cash");
        System.out.print("\n3 Months Installment:");
        threeMonthInstallRate = scn.nextDouble()/100;
        System.out.print("\tYou input "+percent.format(threeMonthInstallRate)+" Interest for Cash");
        System.out.print("\n6 Months Installment:");
        sixMonthInstallRate = scn.nextDouble()/100;
        System.out.print("\tYou input "+percent.format(sixMonthInstallRate)+" Interest for Cash");
        System.out.print("\n12 Months Installment:");
        twelveMonthInstallRate = scn.nextDouble()/100;
        System.out.print("\tYou input "+percent.format(twelveMonthInstallRate)+" Interest for Cash");
	}
	
}

	
	
