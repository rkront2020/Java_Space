package com.rk.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		
		HashMap mp = new HashMap();
		mp.put(1, "rahul");
		mp.put(2, "ravi");
		mp.put(3, "apple");
		mp.put(4, "mango");
		
		//Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();
		Iterator<Map.Entry> itr = mp.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = itr.next();
			System.out.println("Key= " + entry.getKey() + " value= " + entry.getValue());
		}
	}

}
