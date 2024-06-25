
public class TreeNode {
	int key1;
	int key2;
	TreeNode left;
	TreeNode right;
	TreeNode middle;
	
	private static final int INITIAL_VALUE = Integer.MAX_VALUE;;
	
	public TreeNode(int value) {
		key1 = value;
		key2 = INITIAL_VALUE;
		left = null;
		right = null;
		middle = null;
	}
	
	public int getKey1() {
		return this.key1;
	}
	
	public int getKey2() {
		return this.key2;
	}
	
	public TreeNode getLeft() {
		return this.left;
	}
	
	public TreeNode getRight() {
		return this.right;
	}
	
	public TreeNode getMiddle() {
		return this.middle;
	}
	
	public void setKey1(int value) {
		this.key1 = value;
	}
	
	public void setKey2(int value) {
		this.key2 = value;
		sortKeys();
	}
	
	public boolean isNodeFull() {
		if (this.key1 != INITIAL_VALUE && this.key2 != INITIAL_VALUE) {
			return true;
		}
		
		return false;
	}
	
	private int sortKeys() {
		if (this.key1 > this.key2) {
			int temp = key2;
			key2 = key1;
			key1 = temp;
		}
	}
	
	public void setKey(int value) {
		if (this.key1 == INITIAL_VALUE) {
			this.key1 = value;
		} else {
			this.key2 = value;
		}
		
		sortKeys();
	}
}
