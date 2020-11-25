package library;

class Node {
	Book key;
	Node left, right;

	public Node(Book value) {
		key = value;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
class BinaryTree {
	// Root of Binary Tree
	Node root;

	// Constructors
	BinaryTree(Book value) {
		root = new Node(value);
	}

	BinaryTree() {
		root = null;
	}

	/*
	 * Given a binary search tree and a number, inserts a new node with the given
	 * number in the correct place in the tree. Returns the new root pointer which
	 * the caller should then use (the standard trick to avoid using reference
	 * parameters).
	 */
	Node insert(Node node, Book data) {

		/*
		 * 1. If the tree is empty, return a new, single node
		 */
	
		if (node == null) {
			System.out.println("Root " + data);
			return (new Node(data));
		} else {

			/* 2. Otherwise, recur down the tree */
			if (data.getPrice() <= node.key.getPrice()) {
				node.left = insert(node.left, data);
				System.out.println("Left " + data);
			} else {
				node.right = insert(node.right, data);
				System.out.println("Right " + data);
			}

			/* return the (unchanged) node pointer */
			return node;
		}
	}
}
