package java2blogs;

public class DSImplementQueueUsingArray {
	
	int capacity;
	int queue[];
	int front;
	int rear;
	int currentSize =0;

	public DSImplementQueueUsingArray(int size) {
		super();
		
		this.capacity=size;
		this.queue = new int[capacity];
		this.front = 0;
        this.rear = -1;		
	}
	
	public boolean isFull()
	{
		if(currentSize == capacity)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(currentSize == 0) {
			return true;
		}
		return false;
	}
	public void enQueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full can't add elements ");
		}else {
			rear++;
			if(rear == capacity-1) {
			rear =0;
			}
			queue[rear] = data;
			currentSize++;
			System.out.println(data+" is added into queue");
		}
	}
	
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println(" queue is empty ");
		}else {
			front++;
			if(front == capacity-1)
			{
				System.out.println(queue[front-1]+" Removed from the queue");
				
				front =0;
			}else {
				System.out.println(queue[front-1]+" Removed from the queue");
				
			}
			currentSize--;
		}
	}
	
	public void display()
	{
		for(int i : queue)
		{
			System.out.println(i);
		}
	}

	
	public static void main(String[] args) {
		
		DSImplementQueueUsingArray q = new DSImplementQueueUsingArray(8);
		
		q.enQueue(12);
		q.enQueue(23);
		q.enQueue(21);
		q.enQueue(31);
		q.enQueue(10);
		
         System.out.println(q.isEmpty());
         System.out.println(q.isFull());
         q.deQueue();
         q.deQueue();
         q.display();

	}

}
