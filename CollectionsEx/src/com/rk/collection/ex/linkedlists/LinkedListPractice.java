package com.rk.collection.ex.linkedlists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll1 = new LinkedList();
		
		ll1.add("rahul");
		ll1.add(1);
		ll1.add(9);
		//System.out.println(ll1);
		ListIterator litr1 = ll1.listIterator();
		
		while(litr1.hasNext()) {
			System.out.println(litr1.next());
		}

	}

}
