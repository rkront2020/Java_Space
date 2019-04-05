package com.rk.objectclass.examples;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String Literal 
		String s1 = "abc";
		
		//String Object 
		String s2 = new String("abc");
		System.out.println(s2.hashCode());
		
		s2 = s2.concat(" ravi");
		System.out.println(s2.hashCode());
		
		System.out.println(s2.contains("va"));
		
		System.out.println(s2.indexOf("b"));
		
		
		String s3 = new String("ravi");
		String s4 = new String("ravi");
		
		/*
		 * Object class equals methid - compares hascode
		 * String class equlas method - comapres the content of the Object
		 */
		System.out.println(s3.equals(s4));
		
		/*
		 * Every Object wil have different hashcode 
		 * But String Objects - if a String Object exists with same content then the new instance/objet also
		 * points to the sam existing object
		 * 
		 */
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		//SCP - String Constant Pool 
		/*
		 * s3 - line no 24 
		 * 1 object created in Heap memort & 2nd object created in SCP memory
		 * s4 - line no 25 
		 * no object is created , beacuse one String objects ecists with same object 
		 * & ***** s4 goes and points in SCP memomry
		 */
		
		//String Literals
		/*
		 * String Literaks are only created in SCP memory
		 */
		String s7 = "ravi";
		System.out.println(s7.hashCode());
		
		
		
		
		
		
		
	}

}
