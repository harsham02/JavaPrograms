package java2blogs;

import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingTwoQueues {

	public implementStackUsingTwoQueues() {
		super();
		// TODO Auto-generated constructor stub
		
		this.queue1 = new LinkedList<Integer>();
	    this.queue2 = new LinkedList<Integer>();
	}

	Queue<Integer>  queue1;
	Queue<Integer> queue2;
	
	public void push(int data)
	{
		if(queue1.size()==0)
		{
			queue1.add(data);
		}else {
			int q1size = queue1.size();
			 // Copy elements of Queue1 to Queue2
			for(int j=0;j<q1size;j++)
			{
				queue2.add(queue1.remove());
				queue1.add(data);
			}
			 // Copy elements of Queue2 to Queue1
			for(int i =0;i<q1size;i++)
			{
				queue1.add(queue2.remove());
			}
			
		}
	}
	
	public void pop()
	{
		int qsize=queue1.size();
		if(queue1.size()==0)
		{
			System.out.println("Underflow");
		}else {
			System.out.println(queue1.remove());
			queue1.remove(qsize);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implementStackUsingTwoQueues q = new implementStackUsingTwoQueues();
	   
		q.push(12);
		q.push(21);
		q.push(34);
		q.push(45);
		q.pop();
//		q.push(21);
		q.pop();
	
	}

}
