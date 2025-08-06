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

class ListPrg1
{
public static void main(String args[])
{
	List lt = new List();
	lt.addAtEnd(78);
	lt.addAtEnd(45);
	lt.addAtEnd(90);
	lt.addAtEnd(55);
	lt.addAtEnd(77);
	lt.display();
}
}
