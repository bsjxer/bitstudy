package bitstudy.tree;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
}
public class LinkedTree {
	
	// 데이터 넣기
	public TreeNode makeBT(TreeNode bt1, int data, TreeNode bt2) {
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		
		return root;
	}
	
	// 전위 표기식
	public void preorder(TreeNode root) {
		if(root != null){
			System.out.println(root.data);
			preorder( root.left );
			preorder( root.right );
		}
	}
	
	// 중위 표기식
	public void inorder(TreeNode root) {
		if(root != null){
			inorder( root.left );
			System.out.println(root.data);
			inorder( root.right );
		}
	}
	
	// 후위 표기식
	public void postorder(TreeNode root) {
		if(root != null){
			postorder( root.left );
			postorder( root.right );
			System.out.println(root.data);
		}
	}
	
	
	// 찾기
	public TreeNode search(TreeNode root, int data){
		TreeNode temp = new TreeNode();
		
		if( root.data == data ){
			temp = root;
		} else if( root.data < data ){
			search(root.right, data);
			return null;
		} else if( root.data > data ){
			search(root.left, data);
			return null;
		} else {
			System.out.println( "data를 찾을 수 없습니다.");
			return null;
		}
		
		System.out.println( temp.data );
		return temp;
	}
	
	public void insert(TreeNode root, int data){
		TreeNode temp = new TreeNode();
		temp.data = data;
		boolean bo = true;
		
		while( bo ){
			if(root.data == data || root == null){
				bo = false;
				System.out.println("넣을 수 없습니다.");
			} 
			if(root.data > data){
				root.left = temp;
				
				
			}
			
		}
		
		if( root.data > data ){
			if(root.left == null){
				root.left = temp;
				return;
			} else {
				insert(root.left, data);
				return;
			}
		}
		
		if( root.data < data ){
			if(root.right == null ){
				root.right = temp;
				return;
			} else {
				insert(root.right, data);
				return;
			}
		}
		
		
	}
	
	public static void main( String args[] ){
		LinkedTree T = new LinkedTree();
		
		TreeNode n7 = T.makeBT(null, 7, null);
		TreeNode n6 = T.makeBT(null, 5, null);
		TreeNode n5 = T.makeBT(null, 3, null);
		TreeNode n4 = T.makeBT(null, 1, null);
		TreeNode n3 = T.makeBT(n6, 6, n7);
		TreeNode n2 = T.makeBT(n4, 2, n5);
		TreeNode n1 = T.makeBT(n2, 4, n3);
		
//		System.out.printf("\n Preorder : ");
//		T.preorder(n1);
//		System.out.println("---------");
//		
//		System.out.printf("\n Inorder : ");
//		T.inorder(n1);
//		System.out.println("---------");
//		
//		System.out.printf("\n Postorder : ");
//		T.postorder(n1);
		
		T.search(n1, 3);
	}
	
}
