package CollectionFrameWork;

import java.util.PriorityQueue;

public class Queue {
	/*Insertion Order Not maintain
	 * Work on FIFO(FIRST IN FIRST OUT)
	 *  In this case2, the head of the priority queue is the smallest element of the queue.
	 *  And elements are removed in ascending order from the queue.*/

	public static void main(String[] args)
	{
		PriorityQueue<String>Qa = new PriorityQueue<String>();
		
		Qa.add("Kunal");
		Qa.add("Swaroop");
		Qa.add("Akshay");
		Qa.add("Atharv");
		Qa.add("Tanveer");
		
		System.out.println(Qa);
		
		System.out.println(Qa.element());// Retrive First Element
		
		System.out.println("Peek Method: "+ Qa.peek()); // Retrive First Element
		System.out.println("Poll Method: "+ Qa.poll()); // Retrive + Remove First Element
		
		System.out.println("After Using Poll Method: \n"+Qa);
		
		
		System.out.println("**********************************************Integer Value");
		
		/*priority queue elements are retrieved in sorted order(ascending order).
		 *elements are removed in ascending order from the queue
		 *First Element Show is Smallest Among The Queue
		 *Remove First Element is Smallest Among The Queue
		 *this know as FIFO*/
		
		PriorityQueue<Integer>Ia = new PriorityQueue<>();
		
		// Using the add() method
        Ia.add(4);
        Ia.add(2);
        System.out.println("PriorityQueue: " + Ia);

        // Using the offer() method
        Ia.offer(1);
        System.out.println("Updated PriorityQueue: " + Ia);
        
        System.out.println("poll method: "+ Ia.poll()); // Retrive + Remove First Element
        
		System.out.println("After Using Poll Method: \n"+Ia);
        

	}

}
