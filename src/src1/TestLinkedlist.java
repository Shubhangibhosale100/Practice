package src1;

import java.util.Scanner;

import src.Linkedlist;
import src.Node;

public class TestLinkedlist {

	public static void main(String[] args) {
		Node head = null;
		Linkedlist linkedlist = new Linkedlist();

		System.out.println("how many elements you want:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the data:");
			int data = sc.nextInt();
			head = linkedlist.addNode(data);
		}

		// Displays the nodes present in the list
		System.out.println("Linklist is:");
		linkedlist.print(head);

		// Displays reversed linked list
		System.out.println("Reverse is:");
		linkedlist.reverse(head);
		linkedlist.print(head);

		// Displays second last element of the linked list
		System.out.println("Second last element is:");
		new TestLinkedlist().getSecondLastNode(head);
	}

	private void getSecondLastNode(Node head) {
		Node current;
		current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		System.out.println(current.getData());
	}
}
