package Tree;

public class BinarySearchTree {
	  private TreeNode root;
	  private int size;
	  /** Create a default binary tree */
	public BinarySearchTree() 
	{
	root = null; 
	size = 0;
	}
	private TreeNode createNewNode(int e) 
	{ 
		return new TreeNode(e);
	}
	  /** Get the number of nodes in the tree */
	public int getSize() 
	{ 
		return size;
	}
	  /** Returns the root of the tree */
	  public TreeNode getRoot() 
	  {
	    return root;
	}
	  public boolean insert(int e) 
	  { 
		  if (root == null)
		  root = createNewNode(e); // Create a new root else {
		          // Locate the parent node
		  TreeNode parent = null; 
		  TreeNode current = root;
		  while (current != null)
		  {
			  if (e < current.getElement()) 
			  {
			         parent = current;
			         current = current.getLeft();
			       }
			  else if (e > current.getElement()) 
			  { 
				  parent = current;
			  current = current.getRight();
			  }
			  else
			  return false; // Duplicate node not inserted
			  }
			    // Create the new node and attach it to the parent node
			  if (e < parent.getElement()) 
				  parent.setLeft(createNewNode(e));
			  else 
				  parent.setRight(createNewNode(e)); 
               
			  size++;
                  return true; // Element inserted

         }
	  public void inorder(TreeNode root) 
	  {
	       if (root == null)
	        return;
	       inorder(root.getLeft()); 
	       System.out.print(root.getElement() + " "); 
	       inorder(root.getRight());
	       
	      
	  }
	  public void postorder(TreeNode root) 
	  { 
		  if (root == null)
		  return;
		  postorder(root.getLeft()); 
		  postorder(root.getRight()); 
		  System.out.print(root.getElement() + " ");
		  
		 
		  
	  }
	  public void preorder(TreeNode root) 
	  { 
		  if (root == null)
		  return; 
		  System.out.print(root.getElement() + " "); 
		  preorder(root.getLeft()); 
		  preorder(root.getRight());
		  
		  
		  
	  }
	  
	  
	  public boolean delete(int e) 
	  {
		// Locate the node to be deleted and also locate its parent node
		TreeNode parent = null; 
		TreeNode current = root;
		while (current != null) {
			if (e < current.getElement()) 
			{
			         parent = current;
			         current = current.getLeft();
			} 
			else if (e > current.getElement()) 
			{ 
				parent = current;
			    current = current.getRight();
			}
			else
				break; // Element is in the tree pointed at by current
			}
		
		    if (current == null)
			  return false; // Element is not in the tree
			// Case 1: current has no left children
			if (current.getLeft() == null) {
			// Connect the parent with the right child of the current node
			if (parent == null) {
			root = current.getRight();
			}
			  else {
			     if (e < parent.getElement())
			      parent.setLeft(current.getRight());
			else
			      parent.setRight(current.getRight());
			} }
			
		    else 
		    {
		    	// Case 2: The current node has a left child
		    	// Locate the rightmost node in the left subtree of 
		    	// the current node and also its parent
			TreeNode parentOfRightMost = current;
			TreeNode rightMost = current.getLeft();
			
			while (rightMost.getRight() != null) 
			{
			    parentOfRightMost = rightMost;
			    rightMost = rightMost.getRight(); // Keep going to the right
			}
			  // Replace the element in current by the element in rightMost
			  current.setElement(rightMost.getElement());
			  // Eliminate rightmost node
			if (parentOfRightMost.getRight() == rightMost) 
				parentOfRightMost.setRight(rightMost.getLeft());
			else // Special case: parentOfRightMost == current 
				parentOfRightMost.setLeft(rightMost.getLeft());
			}
		size--;
		return true; // Element inserted
		}
	  
	  
	  public boolean search(int e) 
	  {
		  TreeNode current = root; // Start from the root
		  while (current != null) 
		  {
		  if (e < current.getElement())
		           current = current.getLeft();
		  else if (e > current.getElement()) 
			  current = current.getRight();
		  else // element matches 
			  current.getElement(); 
			  return true; // Element is found
		  }
		  return false; 
		  }
	  
	    public int getHeight(TreeNode focusNode){
	        if (focusNode != null){
	            int count1 = getHeight(focusNode.getLeft()) + 1;
	            int count2 = getHeight(focusNode.getRight())+ 1;

	            if (count1 > count2){

	                return count1;
	            }else{
	                return count2;
	            }

	        }else{
	            return 0;
	        }

	    }


	    
public static void main(String[] args) {

    BinarySearchTree theTree = new BinarySearchTree();

    theTree.insert(50);

    theTree.insert(25);

    theTree.insert(15);

    theTree.insert(30);

    theTree.insert(75);

    theTree.insert(85);
    
    theTree.insert(95);
    
    theTree.insert(20);
    
    theTree.delete(30);
    
    theTree.getSize();
    
    theTree.getRoot();
    
    
    // Different ways to traverse binary trees
    
     System.out.println("inorder");
     theTree.inorder(theTree.root);
     System.out.println();

     System.out.println("preorder");
     theTree.preorder(theTree.root);
     System.out.println();

     System.out.println("postorder");
     theTree.postorder(theTree.root);
     System.out.println();

    // Find the node with key 75

    System.out.println("Tree height is "+theTree.getHeight(theTree.root));

    System.out.println("\nNode with the key 75");

    System.out.println(theTree.search(75));

}
}


		
	  

