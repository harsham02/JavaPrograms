package java2blogs;

public class DsImplementStackUsingArray {

 int arr[];
 int size;
 int top;
 
public DsImplementStackUsingArray(int size) {
	super();
	this.arr = new int[size];
	this.size = size;
	this.top = -1;
}
 
public boolean isFull()
{
	return (size-1 == top);
}

public boolean isEmpty()
{
	return top==-1;
}

public int peek()
{
	if(!this.isEmpty())
	{
		return arr[top];
	}else {
		System.out.print(" stack is empty ");
	  return -1;	
	}	
}
public void push(int data)
{
	if(!isFull())
	{
		 arr[++top]=data;
		System.out.println("pushed element : "+data);
	}else {
		System.out.println("stack is overflow");
	}
}
public int pop()
{
	if(!isEmpty())
	{
		int returnedTop = top;
		top--;
		System.out.println("popped element is : "+arr[ returnedTop]);
		return arr[returnedTop];
		
	}else {
		System.out.print("Stack is empty");
		return -1;
	}
}
 public void display(DsImplementStackUsingArray stack)
 {
	 
	 System.out.println("elements in the stack are : ");
	 if(top>=0)
	 for(int i=0;i<=top;i++)
	 {
		 System.out.println(arr[i]);
	 }
 }
 
 public static DsImplementStackUsingArray sortStack(DsImplementStackUsingArray stack)
 {
	 DsImplementStackUsingArray temp = new DsImplementStackUsingArray(10); 
	 
	 while(!stack.isEmpty())
	 {
		 int data = stack.pop();
		 while(!temp.isEmpty() && temp.peek() > data)
		 {
			 stack.push(temp.pop());
		 }
		 temp.push(data);
	 }
	return temp;
	 
 }
public static void main(String[] args)
{ 
	 DsImplementStackUsingArray st = new  DsImplementStackUsingArray(8);
	 

	 System.out.println(st.isEmpty());
	 st.push(12);
	 st.push(3);
	 st.push(14);
	 st.push(36);
	 st.push(22);
	 System.out.println(st.peek());

	 
	 DsImplementStackUsingArray sort = sortStack(st);
	sort.display(sort);
	 
}
}
