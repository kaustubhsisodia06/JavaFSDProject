
import org.w3c.dom.Node;
public class linkedklistfirstcode {
	
	Node head; ///first node
	
	//inner class
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	//method to create a new node
	
	public static LinkedList insert(LinkedList list,int data) {
		
		//create a node with given data
		
		Node new_node= new Node(data);
		new_node.next=null;
		
		
		///if the linked list is empty, then make the new node as head
		
		if(list.head==null) {
			list.head=new_node;		
		}else {
			///else it will travels till the last node and insert the new_node there
			Node last=list.head;
			while(last.next!=null) {
				last =last.next;
			}
			
			//Insert the new_node at the last node
			last.next=new_node;
		}