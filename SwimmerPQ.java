import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class SwimmerPQ  
{
	private Queue<Swimmer> pQueue;

	public SwimmerPQ()
	{
		pQueue = new PriorityQueue<Swimmer>();
	}

	public void add(Swimmer obj)
	{
		pQueue.offer(obj);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public Object removeMin()
	{
		return pQueue.poll();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		Queue<Swimmer> temp = new PriorityQueue<Swimmer>();
		while(!pQueue.isEmpty()) {
			temp.offer(pQueue.peek());
			output+=pQueue.poll() + " ";
		}
		while(!temp.isEmpty()) {
			pQueue.offer(temp.poll());
		}
		return output;		
	}

	public String toString()
	{
		return pQueue.toString();		
	}
	public static void main ( String[] args )
	{
		SwimmerPQ test = new SwimmerPQ();

		Scanner keyboard=new Scanner(System.in);
		int size=0;
		System.out.print("How many swimmers did you wish to enter? :: ");
		size = keyboard.nextInt();

		for(int i=0; i<size;i++)
		{
			int ht, wt, age;
			System.out.print("\nEnter the ht :: ");
			ht = keyboard.nextInt();
			System.out.print("Enter the wt :: ");
			wt = keyboard.nextInt();
			System.out.print("Enter the age :: ");
			age = keyboard.nextInt();
			test.add(new Swimmer(ht,wt,age));
			System.out.print("\n");
		}

// For testing, you can use the scanner above if you like.
// When grading, I would like you to hard-code in the values instead.

		System.out.println("--------------------------");
		System.out.println();
		System.out.println("toString() - " + test);
		System.out.println("getMin() - " + test.getMin());
		System.out.println("naturalOrder() - " + test.getNaturalOrder());
//		System.out.println(test);
//		System.out.println("getMin() - " + test.getMin());
//		System.out.println("removeMin() - " + test.removeMin());
//		System.out.println();
//
//		System.out.println(test);
//		System.out.println("getMin() - " + test.getMin());
//		System.out.println("removeMin() - " + test.removeMin());
//		System.out.println();
//		System.out.println(test);		
	}
}