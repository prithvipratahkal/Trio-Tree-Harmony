
public class Tree {
	TreeNode root;
	int size;

	public Tree() {
		
	}
	
	public boolean insert(int value) {
		if (root == null) {
			TreeNode node = new TreeNode(value);
		}
		
		insert(this.root, value);
		
	}
	
	public TreeNode search(TreeNode node, int value) {
		if (node == null) {
			return node;
		}
		
		if (isKeyPresentInNode(node, value)) {
			return node;
		}
		
		node = getNextNodeToProgress(node, value);
		
		return search(node, value);
	}
	
	public int size(int value) {
		// search for the key in 
		TreeNode node = search(this.root, value);
		
		if (node == null) {
			return 0;
		}
		
		return calculateSize(node);
	}
	
	public int size() {
		return this.size;
	}
	
	private boolean insert(TreeNode node, int value) {
		if (isKeyPresentInNode(node, value)) {
			return false;
		}
		
		// check if leaf
		if (node.left == null) {
			if (!node.isNodeFull()) {
				node.setKey(value);
				this.size++;
				return true;
			}
			
			// split the node
			TreeNode left = 
			
		}
		
		node = getNextNodeToProgress(node, value);
		
		return insert(node, value);
		
	}
	
	public int get(int index) {
		
	}
	
	private int get(TreeNode node, int value) {
		if (value == 0) {
			return node.getKey1();
		}
		
		int leftChildCount = calculateSize(node.getLeft());
		
		if (leftChildCount > value) {
			return get(node.getLeft(), value);
		}
		
		if (leftChildCount + 1 == value) {
			return node.getKey1();
		}
		
		int middleChildCount = calculateSize(node.getMiddle());
		
		
	}
	
	private TreeNode getNextNodeToProgress(TreeNode node, int value) {
		if (value < node.getKey1()) {
			node = node.getLeft();
		} else if (value > node.getKey2()) {
			node = node.right;
		} else {
			node = node.getMiddle();
		}
		
		return node;
	}
	
	private boolean isKeyPresentInNode(TreeNode node, int value) {
		if (node.getKey1() == value || node.getKey2() == value) {
			return true;
		}
		
		return false;
	}
	
	
	private int calculateSize(TreeNode node) {
		if (node == null) {
			return 0;
		}
		
		int currentNodeSize = node.isNodeFull() ? 2 : 1;
		
		return currentNodeSize + calculateSize(node.getLeft()) + calculateSize(node.getMiddle()) + calculateSize(node.getRight());
	}
	
	
}
