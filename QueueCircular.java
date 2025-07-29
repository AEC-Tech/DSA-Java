import java.util.*;
class Queue
{
	private int data[];
	private final int MAX = 10;
	private int front,rear;

	public Queue()
	{
		data = new int[MAX];
		front = rear = -1;
	}
	public void Enque(int value)
	{
		if(front == 0 && rear == MAX-1 || front == rear + 1)
		  System.out.println("Overflow - Queue is FULL");
		else if(rear == -1)
		{
			front = rear = 0;
			data[0] = value;
                }
		else
		{
			
			if(rear == MAX-1)
			  rear = 0;
			else
			  rear++;
			data[rear] = value;
		}
	}
	public int Deque()
	{
		int n =0;
		if(front == -1)
		   System.out.println("Underflow - Queue is Empty");
		else if(front == rear)
		{
			n = data[front];
			front = rear = -1;
		}
		else
		{
			n = data[front];
			if(front == MAX-1)
				front = 0;
			else
				front++;
		}
		return n;
	}
	public void display()
	{
		if(front == -1)
		   System.out.println(" Queue is Empty");
		else if(front <= rear)
		{
			
		   System.out.println("Queue is ");
		   for(int i = front; i<=rear; i++)
			System.out.println(data[i]);
		}
		else
		{
			System.out.println("Queue is ");
		   	for(int i = front; i<MAX; i++)
			System.out.println(data[i]);
			for(int i = 0; i<=rear; i++)
			System.out.println(data[i]);


		}
	}
}
class QueueCircular
{
	public static void main(String args[])
	{
		Queue s = new Queue();
		Scanner sc = new Scanner(System.in);
		int choice,num;
		do
		{
		System.out.println("Press 1 - Enque");
		System.out.println("Press 2 - Deque");
		System.out.println("Press 3 - Display");
		System.out.println("Press 4 - Exit");
		System.out.print("Enter Your Choice : ");
		choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter a number : ");
			num = sc.nextInt();
			s.Enque(num);
		}
		else if(choice == 2)
		{
			System.out.println("Deleted element is "+s.Deque());
		}
		else if(choice == 3)
		{
			s.display();
		}
		else
		break;
	}while(choice!=4);
}
}












		
	
