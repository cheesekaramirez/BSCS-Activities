package singlylinkedlist;

public class SLinkedList 
{
	protected Node head;
	protected Node tail;
	protected long size;
	
	public SLinkedList() 
	{
		head=null;
		size=0;
	}
	
	public void addFirst(Node v) 
	{
		v.setNext(head);
		head=v;
		size++;
	}
	
	public void addLast(Node v) 
	{
		v.setNext(null);
		tail.setNext(v);
		tail=v;
		size++;
	}
	
	public void removeFirst() 
	{
		Node t;
		if(head==null) 
		{
			System.err.print("The list is empty.");
			return;
		}
		t = head;
		head=head.getNext();
		t.setNext(null);
		size--;
	}
}
