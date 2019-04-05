package com.rk.collection.ex.arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		/*
		 *  initialCapacity - 10 
		 *  newCapacity = (oldCapacity * 3)/2 + 1; //16
		 */
		
		ArrayList alist = new ArrayList();
		
		//System.out.println(alist.size());
		alist.add(10);
		//System.out.println(alist.size());
		alist.add("ravi");
		alist.add(10.10f);
		alist.add(new int[10]);
		alist.add(new String("rahul"));
		alist.add(new Lavanya());
		
		//1. Create a Iterator & only can be done on existing list
		Iterator itr = alist.iterator();
		
		/*
		 * 2. check whether there is a elemebt in the list 
		 * 3.then use it / print it
		 */
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//alist.add(100);
			//itr.remove();
		}
		
		System.out.println(alist);
		
		
		
		/*System.out.println(alist.size());
		
		//Every collectin has overriden toString() to print the contents
		System.out.println(alist);
		
		//Object class toString()
		//Lavanya lObject = new Lavanya();
		//System.out.println(lObject);
		
		
		System.out.println("-----------------");
		
		ArrayList alsi2 = new ArrayList(alist);
		System.out.println(alsi2.size());
		alsi2.add("srggserfrfreferfewfewfrw");
		System.out.println(alsi2);
		
		ArrayList l3 = new ArrayList();
		l3.addAll(alist);
		
		System.out.println(alist.indexOf("raviffff"));
		System.out.println(alist.get(5));
		System.out.println(alist.contains("raviddd"));
		System.out.println(alist.remove("ravi"));
		System.out.println(alist);
		
		for (int i = 0; i < 1E5; i++) {
			alist.add(i);
		}
		System.out.println(alist);*/
		
		
		
	}

}
