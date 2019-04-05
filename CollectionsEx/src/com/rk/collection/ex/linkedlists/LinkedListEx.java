package com.rk.collection.ex.linkedlists;

import java.io.StreamCorruptedException;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		/*
		 * All Lists accept duplicates & preserves the insertion order 
		 */
		
		LinkedList ll = new LinkedList<>();
		ll.add(10);
		ll.add(10); 
		ll.add(new String("ravi"));
		//System.out.println(ll);
		
		ListIterator lItr = ll.listIterator();
		while (lItr.hasNext()) {
			System.out.println(lItr.next());
			lItr.add(2000);
			lItr.remove();
			
		}
		
		
	}

}
