package com.rk.objectclass.examples;

public class OperationaTest {
	
	public static void main(String[] args) {
		
		Operations op = new Operations();
		op.add();
		
		Operations op2 = new Operations();
		
		//equals method will compare objects based on hashcode
		System.out.println(op.equals(op2));
		
		//hascode - address of the object
		System.out.println(op.hashCode()); //0xaad4
		
		System.out.println(op.getClass());
		
		
		System.out.println(op.toString());
	}

}
