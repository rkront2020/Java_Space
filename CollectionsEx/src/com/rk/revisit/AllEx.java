package com.rk.revisit;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

import com.rk.collection.ex.arraylists.Lavanya;

public class AllEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lists - Preserves order, duplicates are allowed
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(32424);
		list.add(123);
		list.add(34555);
		//list.add("ravi");
		
		LinkedList llist = new LinkedList<>();
		
		
		//Sets - No duplicates, Insertion order not preserved
		HashSet set = new HashSet<>();
		set.add(233);
		set.add(100);
		set.add(34);
		//System.out.println(set);
		 
		 LinkedHashSet set = new LinkedHashSet();
		
		TreeSet set1 = new TreeSet<>();
		set1.add(233);
		set1.add(100);
		set1.add(34);
		//System.out.println(set1);
		
        for(int i=1;i< list.size();i++) {
        	//System.out.println(list.get(i));
        }
        
        //foreach
        for(Object eachInList : list) {
			//System.out.println(eachInList);
		}
        
        //One directiobal cursor
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
        	//System.out.println(itr.next());
        }
        
        //Bidirectional Cursor
        ListIterator itr1 = list.listIterator();
        while(itr1.hasNext()) {
        	//System.out.println(itr1.next());
        	//System.out.println(itr1.previous());
        }
        
        Vector v = new Vector<>();
        v.add(122);
        
        //Enumerator - Legacy Cursor designed for Vector
        Enumeration e = v.elements();
        while(e.hasMoreElements()) {
        	//System.out.println(e.nextElement());
        }*/
        
        //Maps
		/*
		 * k, v - Entry
		 * Insertion Order - Not Preserved
		 */
        HashMap hm= new HashMap<>();
        hm.put(21, 100);
        hm.put(1, 333);
        hm.put(345, "fwefwef");
        hm.put(56, 10.10f);
        hm.put(null,null);
        hm.put(1, "fnjhbvjs");
        System.out.println(hm);
        
       // hm = null;
        
        //Insertion Order - Preserved
        LinkedHashMap lhm = new LinkedHashMap<>();
        lhm.put(21, 100);
        lhm.put(1, 333);
        lhm.put(345, "fwefwef");
        lhm.put(56, 10.10f);
        lhm.put(null,null);
        lhm.put(1, "fnjhbvjs");
        System.out.println(lhm);
        
        //WeakHashMap - highly eligible for garbage collection
        WeakHashMap whm = new WeakHashMap<>();
        whm.put(21, 100);
        whm.put(1, 333);
        whm.put(345, "fwefwef");
        whm.put(56, 10.10f);
        whm.put(null,null);
        whm.put(1, "fnjhbvjs");
        System.out.println(whm);
        
       // whm = null;
        
        //Force Garbage Collector to run - but not ensured
        System.gc();
        
        //Duplicate Keys
        IdentityHashMap ihm = new IdentityHashMap<>();
        ihm.put(new Integer(10), 122);
        ihm.put(new Integer(10), 1222222);
        System.out.println(ihm);
        
        //Natural Sorting Order
        TreeMap m = new TreeMap<>();
        m.put(21, 100);
        m.put(1, 333);
        m.put(345, "fwefwef");
        m.put(56, 10.10f);
        //m.put(null,null);
        m.put(1, "fnjhbvjs");
        System.out.println(m);
        
        TreeMap m1 = new TreeMap<>();
        //m1.put(null, null);
        
        
        
        
	}

}
