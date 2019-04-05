package com.rk.ll;

public class LLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = LInkedLIst.createNode(10);
		Node curr = head;
		curr = LInkedLIst.createNode(20);
		head.next = curr;

	}

}
