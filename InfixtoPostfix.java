import java.util.*;

class Stack
{
	private char data[];
	private int top;
	private final int MAX = 10;
	public Stack()
	{
		data = new char[MAX];
		top = -1;
	}
	public void push(char value)
	{
		if(top == MAX -1 )
			System.out.println("Overflow");
		else
		{
			top++;
			data[top] = value;
		}
	}
	public char pop()
	{
		char n=' ';
		if(top == -1)
			System.out.println("Stack is Empty");
		else
		{
			n = data[top];
			top--;
		}
		return n;
	}
	public char peep()
	{
		char n=' ';
		if(top == -1)
			System.out.println("Stack is Empty");
		else
		{
			n = data[top];
		}
		return n;
	}
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
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
	
class InfixtoPostfix
{
	public static void main(String args[])
	{
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		String infix,postfix;
		System.out.println("Enter the Infix Expression : ");
		infix = sc.nextLine();
		int i,n;
		n = infix.length();
		postfix="";
		for(i = 0; i<n;i++)
		{
			char cct = infix.charAt(i);
			if(cct != '*' && cct != '/' && cct != '+' && cct != '-' && cct != '(' && cct != ')' )
			postfix = postfix + cct;
			else if(s.isEmpty() || s.peep() == '(')
				s.push(cct);
			else if(cct == '*' || cct == '/')
			{
				if(s.peep() =='*' || s.peep() == '/')
					postfix += s.pop();
				s.push(cct);
			}
			else if(cct == '+' || cct == '-')
			{
				while(!s.isEmpty() && s.peep() != '(')
					postfix += s.pop();
				s.push(cct);
			}
			else if(cct == '(')
				s.push(cct);
			else if(cct == ')')
			{
				while(s.peep() != '(')
					postfix += s.pop();

				s.pop();
			}
		}
		
		while(!s.isEmpty())
			postfix += s.pop();

		System.out.println("Postfix Expression is " + postfix);


	}
}

























