package com.gl.BSTtoSkewed;

import java.util.ArrayList;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BSTToRightSkewed {

	public static Node convertToRightSkewed(Node root) {
		ArrayList<Integer> nodes = new ArrayList<Integer>();
		inOrderTraversal(root, nodes);

		Node newRoot = new Node(nodes.get(0));
		Node prev = newRoot;

		for (int i = 1; i < nodes.size(); i++) {
			Node node = new Node(nodes.get(i));
			prev.right = node;
			prev.left = null;
			prev = node;
		}

		return newRoot;
	}

	public static void inOrderTraversal(Node root, ArrayList<Integer> nodes) {
		if (root == null)
			return;

		inOrderTraversal(root.left, nodes);
		nodes.add(root.data);
		inOrderTraversal(root.right, nodes);
	}

	public static void printRightSkewed(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " -> ");
		printRightSkewed(root.right);
	}


}
