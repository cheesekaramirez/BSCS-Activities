package queues;
import java.util.Queue;
import java.util.LinkedList;

public class PrintQueue {
private Queue<PrintJob> queue = new LinkedList<PrintJob>();


public void addJob(PrintJob job)
{
    queue.offer(job);
    System.out.printf("%d - %s - %d pages has been added to the print queue!",job.getJobId(),job.getDocumentName(),job.getPages());
    System.out.println();
    System.out.println();
}

public PrintJob processJob() 
{
	if (queue.isEmpty()) 
	{
		System.err.println("There are no pending print jobs.");
		return null;
	}
	PrintJob job = queue.poll();
	System.out.printf("The document %s has been printed. %n",job.getDocumentName());
	System.out.println();
    System.out.println();
	return job;
}

public PrintJob peekNextJob() 
{
	if (queue.isEmpty()) 
	{
		System.err.println("There are no pending print jobs.");
		return null;
	}
	PrintJob job = queue.peek();
	System.out.printf("The next document is %s . %n",job.getDocumentName());
	System.out.println();
    System.out.println();
	return job;
}

public void displayAllJobs() 
{
	if (queue.isEmpty()) 
	{
		System.out.println("There are no pending print jobs.");
		System.out.println();
	    System.out.println();
		return;
	}
	
	for(PrintJob job: queue) 
	{
		System.out.printf("%d - %s - %d %n",job.getJobId(),job.getDocumentName(),job.getPages());
	    System.out.println();
	    System.out.println();
	}
}

}
