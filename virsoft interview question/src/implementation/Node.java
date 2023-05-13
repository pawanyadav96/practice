package implementation;

public class Node {
	 int data;
	    int count;
	    Node next;
	    
	    Node(int data, int count) {
	        this.data = data;
	        this.count = count;
	        this.next = null;
	    }
	
	    
	    public static void main(String[] args) {
	        int[] arr = {1,1,1,3,3,3,2,2,5,5,5,11,11,11,5,1,1,2,2,3};
	        Node head = cLList(arr);
	        pLList(head);
	    }
	    
	    // Creating linkedlist from array
	        public static Node cLList(int[] arr) {
	        Node head = new Node(arr[0],1);
	        Node curr = head;
	        for (int i=1; i<arr.length; i++) {
	            if (arr[i]==curr.data) {
	                curr.count++;
	            } else {
	                Node node=new Node(arr[i],1);
	                curr.next=node;
	                curr=node;
	            }
	        }
	        return head;
	    }
	    
	    // Printing the linked list
	   public  static void pLList(Node head) {
	        Node curr=head;
	        while (curr!= null) {
	            System.out.println(curr.data+"-" +curr.count);
	            curr = curr.next;
	        }
	       
	    }
	}
	







