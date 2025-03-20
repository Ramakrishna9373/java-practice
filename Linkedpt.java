import java.util.*;
class Node{
	int data;
	Node next;
	}
	 class Lin{
	//Node n=new Node();
		 Node head;
		 void insert(int data) {
	//Node head;
			 Node n=new Node();
	n.data=data;
	n.next=null;
	if(head==null) {
		head=n;
	}
	else {
		Node cur=head;
	while(cur.next!=null) {
		cur=cur.next;
	}
		cur.next=n;
	}
	
	}
		 void insertAtb(int data) {
			 Node cur=head;
			 Node n=new Node();
			 if(head==null) {
				 head=n;
			 }if(head.next==null) {
				 head=n;
			 }
			 else {
				 n.next=head;
				 head=n;
			 }
		 }
		//  void insertAtPos(int data,int pos) {
		// 	 int count=0;
		// 	 Node cur=head;
		// 	 Node n=new Node();
		// 	 while(count<pos-1) {
		// 		 cur=cur.next;
		// 		 count++;
		// 	 }
		// 	 n.next=cur.next;
		// 	 cur.next=n;
			 
		//  }
void insertE(int data) {
	Node cur=head;
	Node n=new Node();
	while(cur.next!=null) {

		cur=cur.next;
	}
	n.next=cur.next;
	 cur.next=null;
}
void traverse() {
	Node cur=head;
	while(cur.next!=null) {
		System.out.println(cur.data);
	}
		cur=cur.next;
	}
}
	 public  class Linkedpt {
	
	public static void main(String[] args) {
	Lin l=new Lin();
	Scanner s=new Scanner(System.in);
	System.out.println("enter elements");
	int N=4;
	for(int i=0;i<N;i++) {
		l.insert(i);
	}
	l.insertAtb(12);
	l.insertAtPos(11,3);
	l.insertE(10);
	l.traverse();

}}

