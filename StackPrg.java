import java.util.*;

class Stack
{
	private int data[];
	private int top;
	private final int MAX = 10;
	public Stack()
	{
		data = new int[MAX];
		top = -1;
	}
	public void push(int value)
	{
		if(top == MAX -1 )
			System.out.println("Overflow");
		else
		{
			top++;
			data[top] = value;
		}
	}
	public int pop()
	{
		int n=0;
		if(top == -1)
			System.out.println("Stack is Empty");
		else
		{
			n = data[top];
			top--;
		}
		return n;
	}
	public int peep()
	{
		int n=0;
		if(top == -1)
			System.out.println("Stack is Empty");
		else
		{
			n = data[top];
		}
		return n;
	}
	public void display()
	{
		if(top == -1)
			System.out.println("Stack is Empty");
		else
		{
			System.out.println("Stack is ");
			for(int i = top; i>= 0;i--)
				System.out.println(data[i]);
		}
	}

}
	
class StackPrg
{
	public static void main(String args[])
	{
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		int choice,num;
		do
		{
		System.out.println("Press 1 - Push");
		System.out.println("Press 2 - Pop");
		System.out.println("Press 3 - Peep");
		System.out.println("Press 4 - Display");
		System.out.println("Press 5 - Exit");
		System.out.print("Enter Your Choice : ");
		choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter a number : ");
			num = sc.nextInt();
			s.push(num);
		}
		else if(choice == 2)
		{
			System.out.println("Deleted element is "+s.pop());
		}
		else if(choice == 3)
		{
			System.out.println("Top element is "+s.peep());
		}
		else if(choice == 4)
		{
			s.display();
		}
		else
		break;
	}while(choice!=5);
}
}










