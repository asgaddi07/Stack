package com.stack;

class StackLinkedList{
	int size=0;
	  class StackNode{
		int data;
		StackNode next;
		
		public  StackNode(int data) {
			// TODO Auto-generated constructor stub
			this.data=data;
			next=null;
		}
	  }
		StackNode head=null;
		
		void push(int data) {
			StackNode newNode=new StackNode(data);
			if(head==null)head=newNode;
			else { 
				newNode.next=head;
				head=newNode;
			} 
			System.out.println(data+ " inserted in stack");
			size++;
		}
		void pop() {
			if(head==null)System.out.println("Stack Empty");
			else {
				System.out.println(head.data+" pop from stack");
				head=head.next;
				size--;
			}
			
		}
		void peek() {
			if(head==null)System.out.println("Stack Empty");
			else {
				System.out.println("Top element of stack: "+head.data);
			}
		}
		void size() {
			System.out.println("Size of stack: "+size);
		}
		void print() {
			if(head==null)System.out.println("Stack Empty");
			else {
				StackNode current=head;
				System.out.println("Data in stack: ");
				while(current!=null) { 
					System.out.println(current.data);
					current=current.next;
				}
			}
		}
	}


public class StackLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList s=new StackLinkedList();
		s.size();
		s.pop();
		s.print();
		s.peek();
		s.push(5);
		s.push(4);
		s.peek();
		s.print();
		s.size();
		s.pop();
		s.print();
		s.peek();
		s.size();
		s.pop();
		s.size();
	}

}
