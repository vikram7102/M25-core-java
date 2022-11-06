package org.tnsindia.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack <Integer> s= new Stack();
		s.push(3);
		s.push(6);
		s.push(89);
		s.push(66);
		System.out.println(s);
		//pop-Deletion
		s.pop();
		//s.remove(2);//it delete oth index element
		System.out.println(s);

	}

}
