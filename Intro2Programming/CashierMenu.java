package chescaWorkspace;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CashierMenu
{
    public static void main (String args[]) 
    {
        String prodName1;
        String prodName2;
        String prodName3;
        double prodPrice1=0;
        double prodPrice2=0;
        double prodPrice3=0;
        double finalPrice=0;
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
        
        Scanner input = new Scanner(System.in);
        DecimalFormat cash = new DecimalFormat("$ ###,###,###.00");
        DecimalFormat percent = new DecimalFormat("#.00%");
        
        System.out.print("Enter Product 1:"+"\t");
        prodName1 = input.nextLine();
        System.out.print("Enter Price:"+"\t");
        prodPrice1 = input.nextDouble();
        
        System.out.print("Enter Product 2:"+"\t");
        prodName2 = input.nextLine();
        input.next();
        System.out.print("Enter Price:"+"\t");
        prodPrice2 = input.nextDouble();
        input.nextDouble();
        
        System.out.print("Enter Product 3:"+"\t");
        prodName3 = input.nextLine();
        System.out.print("Enter Price:"+"\t");
        prodPrice3 = input.nextDouble();
        
        
        System.out.print("\nInput Mode of Payment Terms");
        System.out.print("\nCash Discount:");
        cashDiscRate = input.nextDouble()/100;
        System.out.print("\tYou input "+percent.format(cashDiscRate)+" Discount for Cash");
        System.out.print("\n3 Months Installment:");
        threeMonthInstallRate = input.nextDouble()/100;
        System.out.print("\tYou input "+percent.format(threeMonthInstallRate)+" Interest for Cash");
        System.out.print("\n6 Months Installment:");
        sixMonthInstallRate = input.nextDouble()/100;
        System.out.print("\tYou input "+percent.format(sixMonthInstallRate)+" Interest for Cash");
        System.out.print("\n12 Months Installment:");
        twelveMonthInstallRate = input.nextDouble()/100;
        System.out.print("\tYou input "+percent.format(twelveMonthInstallRate)+" Interest for Cash");
        
        
        System.out.println("Main Menu");
        System.out.println("Press I/i:"+"\t"+prodName1);
        System.out.println("Price: "+prodPrice1);
        System.out.println("Press S/s:"+"\t"+prodName2);
        System.out.println("Price: "+prodPrice2);
        System.out.println("\tPress X/x:"+"\t"+prodPrice3);
        System.out.println("Price: "+prodPrice3);
        
        System.out.print("Enter Item:"+"\t");
        menu = input.next().charAt(0);
        menu = Character.toUpperCase(menu);
        switch (menu)
        {
            case 'I':
                System.out.println("Product:"+"\t"+prodName1);
                System.out.println("Price:"+"\t"+prodPrice1);
                break;
            case 'S':
                System.out.println("Product:"+"\t"+prodName2);
                System.out.println("Price:"+"\t"+prodPrice2);
                break;
            case 'X':
                System.out.println("Product:"+"\t"+prodName3);
                System.out.println("Price:"+"\t"+prodPrice3);
                break;
            default:
                System.out.println("Please enter a valid character.");
        }
       
        System.out.println("Press 1: Cash"+"\t"+percent.format(cashDiscRate)+" Discount");
        System.out.println("Press 2: 3 Months Installment"+"\t"+percent.format(threeMonthInstallRate)+" Interest");
        System.out.println("Press 3: 6 Months Installment"+"\t"+percent.format(sixMonthInstallRate)+" Interest");
        System.out.println("Press 4: 12 Months Installment"+"\t"+percent.format(twelveMonthInstallRate)+" Interest");
        
        System.out.print("Enter Mode of Payment:"+"\t");
        modeForPay = input.nextInt();
        
        if (modeForPay==1)
        {
            isCash = true;
        } else if (modeForPay==2) {
            is3Months = true;
        } else if (modeForPay==3) {
            is6Months = true;
        } else if (modeForPay==4) {
            is12Months = true;
        } else
        {
            System.out.println("Please enter a valid mode of payment.");
        }
        switch (menu)
        {
            case 'I':
                if (isCash)
                {
                    discPrice = prodPrice1 * cashDiscRate / 100;
                    finalPrice = prodPrice1 - discPrice;
                    System.out.println("Mode of Payment: "+"\t"+"Cash");
                } else if (is3Months) {
                    interestPrice = prodPrice1*threeMonthInstallRate/100;
                    finalPrice = prodPrice1+interestPrice;
                    monthlyAmort= finalPrice/3;
                    System.out.println("Mode of Payment: "+"\t"+"3 Months Installments");
                } else if (is6Months){
                    interestPrice = prodPrice1*sixMonthInstallRate/100;
                    finalPrice = prodPrice1+interestPrice;
                    monthlyAmort= finalPrice/6;
                    System.out.println("Mode of Payment: "+"\t"+"3 Months Installments");
                } else if (is12Months) {
                    interestPrice = prodPrice1*threeMonthInstallRate/100;
                    finalPrice = prodPrice1+interestPrice;
                    monthlyAmort= finalPrice/12;
                    System.out.println("Mode of Payment: "+"\t"+"3 Months Installments");
                }


                System.out.println("Item:"+"\t"+prodName1);
                System.out.println("Price:"+"\t"+cash.format(prodPrice1));
                System.out.println("Discount:"+"\t"+cash.format(discPrice));
                System.out.println("Interest:"+"\t"+cash.format(interestPrice));
                System.out.println("Total Amount:"+"\t"+cash.format(finalPrice));
                System.out.println("Monthly Amortization:"+"\t"+cash.format(monthlyAmort));
                break;
            case 'S':
                if (isCash)
                {
                    discPrice = prodPrice2 * cashDiscRate / 100;
                    finalPrice = prodPrice2 - discPrice;
                    System.out.println("Mode of Payment: "+"\t"+"Cash");
                } else if (is3Months) {
                    interestPrice = prodPrice2*threeMonthInstallRate/100;
                    finalPrice = prodPrice2+interestPrice;
                    monthlyAmort= finalPrice/3;
                    System.out.println("Mode of Payment: "+"\t"+"3 Months Installments");
                } else if (is6Months){
                    interestPrice = prodPrice2*sixMonthInstallRate/100;
                    finalPrice = prodPrice2+interestPrice;
                    monthlyAmort= finalPrice/6;
                    System.out.println("Mode of Payment: "+"\t"+"6 Months Installments");
                } else if (is12Months) {
                    interestPrice = prodPrice2*threeMonthInstallRate/100;
                    finalPrice = prodPrice2+interestPrice;
                    monthlyAmort= finalPrice/12;
                    System.out.println("Mode of Payment: "+"\t"+"12 Months Installments");
                }
                System.out.println("Item:"+"\t"+prodName2);
                System.out.println("Price:"+"\t"+cash.format(prodPrice2));
                System.out.println("Discount:"+"\t"+cash.format(discPrice));
                System.out.println("Interest:"+"\t"+cash.format(interestPrice));
                System.out.println("Total Amount:"+"\t"+cash.format(finalPrice));
                System.out.println("Monthly Amortization:"+"\t"+cash.format(monthlyAmort));
                break;
            case 'X':
                if (isCash)
                {
                    discPrice = prodPrice3 * cashDiscRate / 100;
                    finalPrice = prodPrice3 - discPrice;
                    System.out.println("Mode of Payment: "+"\t"+"Cash");
                } else if (is3Months) {
                    interestPrice = prodPrice3*threeMonthInstallRate/100;
                    finalPrice = prodPrice3+interestPrice;
                    monthlyAmort= finalPrice/3;
                    System.out.println("Mode of Payment: "+"\t"+"3 Months Installments");
                } else if (is6Months){
                    interestPrice = prodPrice3*sixMonthInstallRate/100;
                    finalPrice = prodPrice3+interestPrice;
                    monthlyAmort= finalPrice/6;
                    System.out.println("Mode of Payment: "+"\t"+"6 Months Installments");
                } else if (is12Months) {
                    interestPrice = prodPrice3*threeMonthInstallRate/100;
                    finalPrice = prodPrice3+interestPrice;
                    monthlyAmort= finalPrice/12;
                    System.out.println("Mode of Payment: "+"\t"+"12 Months Installments");
                }
                System.out.println("Item:"+"\t"+prodName3);
                System.out.println("Price:"+"\t"+cash.format(prodPrice3));
                System.out.println("Discount:"+"\t"+cash.format(discPrice));
                System.out.println("Interest:"+"\t"+cash.format(interestPrice));
                System.out.println("Total Amount:"+"\t"+cash.format(finalPrice));
                System.out.println("Monthly Amortization:"+"\t"+cash.format(monthlyAmort));
                break;
            default:
                System.out.println("Please enter a valid character.");
        }

    }
    
}
