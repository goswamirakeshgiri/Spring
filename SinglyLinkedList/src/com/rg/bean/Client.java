package com.rg.bean;

public class Client {

	public static int count=0;
	public static ListNode head=null;
	public static void main(String[] args) {
		
		
		head=new ListNode(count++);
		head.setNext(null);
		insertAfter(head);
		
		
		
	}
	public static void insertAfter(ListNode node)
	{
		ListNode new1=new ListNode(count++);
		new1.setNext(null);
	}
	public static void insertBefore(ListNode node)
	{
		
	}
	public int countLength()
	{
		int length=0;
		ListNode localhead=head;
		while(localhead.getNext()!=null)
		{
			length++;
			localhead=head.getNext();
		}
		
		return length;
		
	}
}
