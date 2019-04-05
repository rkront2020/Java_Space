package com.rk.collection.ex.arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrlist = new ArrayList();
		ArrayList arrlist2 = new ArrayList();
		arrlist2.add(2);
		arrlist2.add(12);
		
		arrlist.add(1);
		arrlist.add(22);
		arrlist.addAll(arrlist2);
		//arrlist.size();
		
		System.out.println(arrlist);
		
		Iterator itr = arrlist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
