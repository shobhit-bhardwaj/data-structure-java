package com.shobhit.dsa.stack;

public class LinkedStackDemo {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node top;

	public Node getTop() {
		return top;
	}

	public boolean push(int data) {
		Node node = new Node(data);

		if(top == null) {
			top = node;
		} else {
			node.next = top;
			top = node;
		}

		return true;
	}

	public int pop() {
		if(top == null)
			return -1;

		int data = top.data;
		top = top.next;
		return data;
	}

	public void traverse() {
		Node temp = top;
		while(temp != null) {
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.println();
	}

	public void traverse(Node node) {
		Node temp = node;
		while(temp != null) {
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.println();
	}

	public void test() {
		System.out.println("Push 1 - "+push(1));
		System.out.println("Push 2 - "+push(2));
		System.out.println("Push 3 - "+push(3));
		traverse();
		System.out.println("Pop - "+pop());
		System.out.println("Pop - "+pop());
		System.out.println("Pop - "+pop());
		System.out.println("Pop - "+pop());
		System.out.println("Pop - "+pop());
	}

	public static void main(String[] args) {
		new LinkedStackDemo().test();
	}
}