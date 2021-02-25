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

		new TestLinkedlist().isCircularLinkedList(head);
	}

	private void getSecondLastNode(Node head) {
		Node current;
		current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		System.out.println(current.getData());
	}

	private void isCircularLinkedList(Node head) {
		Node temp;
		temp = head;
		System.out.println("Detection of Circular Linked List");
		while ((temp.getNext() != null)) {
			if (temp.getNext() == head) {
				System.out.println("This is Circular Linked List");
				return;
			}
			temp = temp.getNext();
		}
		if (temp.getNext() == null) {
			System.out.println("This is not Circular Linked List");
			return;
		}
	}
};
