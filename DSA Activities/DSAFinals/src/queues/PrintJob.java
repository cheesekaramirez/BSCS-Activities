package queues;

class PrintJob
{
    private int jobId;
    private String documentName;
    private int pages;




    public PrintJob(int id, String docName, int pgNum)
    {
        jobId=id;
        documentName=docName;
        pages=pgNum;
    }


    public int getJobId()
    {
        return jobId;
    }


    public String getDocumentName()
    {
        return documentName;
    }


    public int getPages()
    {
        return pages;
    }
}
