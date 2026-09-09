package queues;
import java.util.Scanner;

public class PrintQueueSimulator {
	static int jobNum=0;
	PrintQueue pq = new PrintQueue();
	
    public static void main(String[] args)
    {
       PrintQueueSimulator sim = new PrintQueueSimulator();
       sim.menu();
    }
    
    public void menu() 
    {
    	 int choice;
         Scanner scn = new Scanner(System.in);
         while (true) {
 	        System.out.println("Print Queue Simulator");
 	        System.out.printf("[%d] Add New Document %n",1);
 	        System.out.printf("[%d] Print Document %n",2);
 	        System.out.printf("[%d] View Next Document %n",3);
 	        System.out.printf("[%d] Display All Print Jobs %n",4);
 	        System.out.print("Choose an operation: ");
 	        choice=scn.nextInt();
 	        
 	        switch(choice) 
 	        {
 	        case 1: 
 	        	jobNum++;
 	        	addJobUI();
 	        	break;
 	        case 2:
 	        	pq.processJob();
 	        	break;
 	        	
 	        case 3:
 	        	pq.peekNextJob();
 	        	break;
 	        case 4:
 	        	pq.displayAllJobs();
 	        	break;
 	        	
 	        default:
 	        	System.err.println("Please input a valid number.");
 	        }
 	        
         }
         
    }
    
    public void addJobUI() 
    {
        String docName;
        int pgNum;
       Scanner scn = new Scanner(System.in);
            System.out.print("Enter Document Name: ");
            docName = scn.nextLine();
            System.out.print("Enter number of pages: ");
            pgNum = scn.nextInt();
            PrintJob pj = new PrintJob(jobNum,docName,pgNum);
            pq.addJob(pj);
            
    }
}

