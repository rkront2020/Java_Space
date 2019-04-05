package com.rk.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.rk.collection.ex.arraylists.Lavanya;

public class MapEx {
	
	public static void main(String[] args) {
		
		
		HashMap hmap = new HashMap();
		hmap.put(1, "ravi");
		hmap.put("rahul", 10.10f);
		hmap.put(new int[2], new Lavanya());
		hmap.put(new Thread(), new Exception());
		
		System.out.println(hmap);
		
		LinkedHashMap mm = new LinkedHashMap<>();
		mm.put(1, "ravi");
		mm.put("rahul", 10.10f);
		mm.put(new int[2], new Lavanya());
		mm.put(new Thread(), new Exception());
		
		System.out.println(mm );
		
		
	}

}
