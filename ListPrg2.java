import java.util.*;
class Node
{
	int data;
	Node next;
}
class List
{
	private Node start;
	public List()
	{
		start = null;
	}
	void addAtEnd(int value)
	{
		Node temp,ptr;
		temp = new Node();
		temp.data = value;
		temp.next = null;
		if(start == null)
			start = temp;
		else
		{
			ptr = start;
			while( ptr.next != null)
				ptr = ptr.next;
			ptr.next = temp;
		}
	}
	void addAtBeg(int value)
	{
		Node temp;
		temp = new Node();
		temp.data = value;
		temp.next = null;
		if(start == null)
			start = temp;
		else
		{
			temp.next = start;
			start = temp;
		}
	}
	int delFromBeg()
	{
		int n  = 0;
		if(start == null)
			System.out.println("List is Empty");
		else 
		{
			n = start.data;
			start = start.next;
		}
		return n;
	}

	int delFromEnd()
	{
		int n  = 0;
		if(start == null)
			System.out.println("List is Empty");
		else if(start.next == null)
		{
			n = start.data;
			start = null;
		}
		else 
		{
			Node ptr = start;
			while( ptr.next.next != null )
				ptr = ptr.next;
			n = ptr.next.data;
			ptr.next = null;
		}
		return n;
	}

	void display()
	{
		Node ptr;
		if(start == null)
			System.out.println("List is Empty");
		else
		{
			ptr = start;
			while(ptr != null)
			{
				System.out.println(ptr.data);
				ptr = ptr.next;
			}
		}
	}
}

class ListPrg2
{
public static void main(String args[])
{
	List lt = new List();
	lt.addAtEnd(78);
	lt.addAtEnd(45);
	lt.addAtEnd(90);
	lt.addAtBeg(55);
	lt.addAtBeg(77);
	System.out.println("Deleted from beginning " + lt.delFromBeg());
	System.out.println("Deleted from end " + lt.delFromEnd());

	lt.display();
}
}
