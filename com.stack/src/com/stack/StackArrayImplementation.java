package com.stack;
import java.util.Scanner;

class StackArray{
	
	private int array[];
	private int capacity;
	private int top;
	
	 StackArray() {
		// TODO Auto-generated constructor stub
		 array=new int[10];
		 capacity=10;
		 top=-1;
	}
	StackArray(int size){
		 array=new int[size];
		 capacity=size;
		 top=-1;
	}
	
	boolean isEmpty(){
		return top==-1;
	}
	boolean isFull() {
		return top==capacity-1;
	}
	void push(int element) {
		if(isFull())System.out.println("Stack Overflow");
		else {
			array[++top]=element;
			System.out.println(element+" inserted in stack");
		}
	}
	void pop() {
		if(isEmpty())System.out.println("Stack Underflow");
		else {
			System.out.println(array[top]+" pop from stack");
			top--;
		}
	}
	void peek() {
		if(isEmpty())  System.out.println("Stack Empty");
		else   System.out.println("Top element of stack: "+array[top]);
	}
	void size() {
		System.out.println("Size of stack: "+(top+1));
	}
	void capacity() {
		System.out.println("Capacity of stack: "+capacity);
	}
	void print() {
		if(isEmpty())System.out.println("Stack Empty");
		else {
			System.out.println("Element in stack:");
			for(int i=0;i<=top;i++)System.out.println(array[i]);
		}
	}
}

public class StackArrayImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int size=scan.nextInt();
//		StackArray s=new StackArray();
		StackArray s=new StackArray(size);
		s.print();
		s.size();
		s.peek();
		s.capacity();
		s.push(5);
		s.push(4);
		s.push(3);
		s.peek();
		s.pop();
		s.print();
		s.peek();
		s.size();
		scan.close();
	}

}
