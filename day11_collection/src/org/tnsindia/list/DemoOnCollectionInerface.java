package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

//Demo on Collection Interface
public class DemoOnCollectionInerface {

	public static void main(String[] args) {
		Collection obj =new ArrayList<>();
		obj.add("vikram");
		obj.add(3);
		obj.add('e');
		obj.add(67.98f);
		obj.add(98.78);
		System.out.println("The elements in collections are: "+obj);
	}

}
