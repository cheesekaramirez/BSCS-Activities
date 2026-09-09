package chescaWorkspace;
import java.text.DecimalFormat;

public class InvestmentInterest {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("$#,###,###.00");
		int year=0;
		double $myInvestment=1000.0, interest = 0.0, $money=0.0;
		System.out.print("Year\t");
		System.out.print("Amount\t");
		System.out.print("Interest\t");
		System.out.print("Year End Money\t");
		System.out.println();
		for(year=1;year<=5;year++) {
			interest=$myInvestment*0.1;
			$money=$myInvestment+interest;
			System.out.println("interest1="+interest);
			System.out.println("$money1="+$money);
			
			System.out.print(year+"\t");
			System.out.print(df.format($myInvestment)+"\t");
			System.out.print(df.format(interest)+"\t\t"+df.format($money));
			System.out.println();
			$myInvestment=$money;
		}
		        
		    }
		    
	}


