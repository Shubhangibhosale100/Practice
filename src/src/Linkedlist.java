package src;

import java.util.Scanner;

public class Linkedlist {
	private Node head = null, current = null;

	public Node addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			current = newNode;
		} else {
			current.setNext(newNode);
			current = newNode;
		}
		return head;
	}

	public void print(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	// To calculate size of the linked list
	public int length(Node head) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	// Reverse the linkedlist
	public void reverse(Node head) {
		Node p = head, q = head;
		int len;
		int i, j, temp;
		int k;
		i = 0;
		len = length(head);
		j = len - 1;
		while (i < j) {
			k = 0;
			while (k < j) {
				q = q.getNext();
				k++;
			}

			temp = p.getData();
			p.setData(q.getData());
			q.setData(temp);

			i++;
			j--;

			p = p.getNext();
			q = head;
		}
	}

}