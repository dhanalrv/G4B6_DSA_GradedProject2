package com.gl.BSTtoSkewed;

public class Driver {
	public static void main(String[] args) {
		// create a BST
		/*		50
		 * 	  /   \
		 * 	 30    60
		 *  / \   / \
		 * 10  . 55   .
		 * */
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(40);
		root.right.left = new Node(55);
		//root.right.right = new Node(90);

		
		
		BSTToRightSkewed rightSkewed = new BSTToRightSkewed();
		
		// convert BST to right-skewed tree
		Node newRoot = rightSkewed.convertToRightSkewed(root);

		// print the right-skewed tree
		rightSkewed.printRightSkewed(newRoot);
	}

}
