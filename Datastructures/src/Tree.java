
public class Tree {
	Node root;
	
	

	
	
	
	class Node {
		int key;
		Node left, right;
	
		
		boolean member(int x) {
			if(x == key) {
				return true;
			} else
				if(x < key) {
					if(left == null) return false; else return left.member(x);
				} else {
					if(right == null) return false; else return right.member(x);
				}
		}
		
		public Node insert(int x) {
			if(x == key) return this;
			else {
				
			}
		}
	
	
	
	
	}
}
