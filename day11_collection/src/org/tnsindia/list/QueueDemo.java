package org.tnsindia.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//Queue is a interface , we can't create the obj for it
		Queue <Character> list =new PriorityQueue<Character>();
		list.add('e');
		list.add('a');
		list.add('o');
		list.add('g');
		list.offer('d');
		for(Character c:list)
		{
			System.out.println(c);
		}
		System.out.println(list);
		list.remove();
		System.out.println(list);
		//peek will gives us head element
		System.out.println(list.peek());
		//i guess poll gives random element not sure 
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());

	}

}
