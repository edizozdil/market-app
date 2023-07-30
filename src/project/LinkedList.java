package project;

public class LinkedList 
{
	   Node first;
	   Node last;
	   
	public LinkedList( ) 
	{
	first = null;
	last = null; 
	}
	public boolean isEmpty() 
	{
		return (first == null); 
		}
	public String add(String itemName, int count) 
	{
		first = new Node(itemName+ " " +count , first);
		return count + " " + itemName;
	}
	public String add2(String itemName, String count) 
	{
		first = new Node(itemName+ " " +count , first);
		return count + " " + itemName;
	}
	
		public void insertAtFront(String itemName) 
		{
		if(isEmpty())
		first = last = new Node(itemName, first);
		else
		first = new Node(itemName, first);
		}
		public boolean removeFromFront( ) 
		{
			if(isEmpty()) 
			{
			System.out.println("The list is empty!");
			return false; 
			}
			else
			{
				if(first == last)
					first = last = null;
			else
				first = first.getLink(); return true;
			} 
		}
		public void insertAtBack(String itemName) {
			if(isEmpty())
			first = last = new Node(itemName, first);
			else
			{
			last.setLink(new Node (itemName)); last = last.getLink();
			} }
		public boolean removeFromBack( )
		{ 
			if(isEmpty())
		{
			System.out.println("The list is empty!");
			return false; 
			}
			else
			{
			if(first == last)
			first = last = null; 
			else
			{
			Node current = first; 
			while(current.getLink() != last)                     
		      current = current.getLink();                
			  last = current;
			  current.setLink(null); 
			}
			return true; 
			}
			}
		
		public boolean deleteTheHeadNode() 
		{
			if(first!=null) 
			{
				first=first.getLink();
				return true;
			}
			else 
			{
				//the LL is empty, head==null
				return false;
			}
		}
			
		public int size( ) 
		{
			int count = 0;
			Node current = first;
			while (current != null) 
			{
			count++;
			current = current.getLink( ); 
			}
			return count; 
			}
		
		public void outputList( ) 
		{
			Node current = first; while (current != null) 
			{
			System.out.println(current.getItem( ));
			current = current.getLink( ); 
			}
			}
		
		public Node find(String target) 
		{
			Node position = first; 
			String itemAtPosition; 
			while (position != null) 
			{
			           itemAtPosition = position.getItem( );
			           if (itemAtPosition.equals(target))
			            return position;
			           position = position.getLink( ); 
			}
			return null; //target was not found }
		}
		
		public boolean contains(String item) 
		{
			return (find(item) != null); 
			}
	

		public static void main(String[] args) 
		{
			LinkedList link = new LinkedList();
			
			link.insertAtBack("Apple");
			link.insertAtBack("Bread");
			link.insertAtBack("Candy");
			link.insertAtBack("Sprite");
			link.insertAtBack("Snack");
			link.insertAtFront("Computer");
			link.insertAtFront("Parsley");
			link.insertAtFront("Chips");
			
			link.outputList();
			System.out.println();
			link.removeFromBack(); 
			link.outputList();
			System.out.println();
			
			System.out.println(" --- ");
			
			System.out.println(link.contains("Apple"));
			System.out.println(link.contains("Cola"));
			
			System.out.println(" --- ");
			
			System.out.println(link.find("Apple"));
			System.out.println(link.find("Phone"));
			
			System.out.println(link.size());
			 
			System.out.println(" --- ");
			
			LinkedList shoppingCart = new LinkedList();
			
			shoppingCart.add("chocolate", 10);
			shoppingCart.add("cola", 3);
			shoppingCart.add("milk", 1);
			shoppingCart.add("dress", 4);
			shoppingCart.add("shoes", 2);
			System.out.println(shoppingCart.size());
			shoppingCart.outputList();
			shoppingCart.deleteTheHeadNode();
			System.out.println(" ");
			shoppingCart.outputList();
			
		}

}
