import java .util.Scanner;

public class SLL {

	static class node{
		int data;
		node next;
		node(int x){
			this.data=x;
			this.next=null;
		}
	}
	static node head=null;
	static void create() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of the node");
		node p=new node(sc.nextInt());
	    p.next=null;
		node q=p;
		System.out.println("press y for input more snd n for no");
		char c=sc.next().charAt(0);
		while(c!='n'){
			if(head==null) {
				head=p;
			}
			else {
				
		
			System.out.println("enter data of new node");
			p=new node(sc.nextInt());
			p.next=null;
			q.next=p;
			q=p;
			System.out.println("press y for input more snd n for no");
			c=sc.next().charAt(0);
			}
			
		}
	}
	
	static void display() {
		if(head==null)
			System.out.println("linked list is empty");
		else {
			node q=head;
			while(q!=null) 
			{
				System.out.print(q.data+"-->");
				
				q=q.next;
			}
			System.out.println();
		}
	}
	static void insertbegin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data of the node");
		if(head==null) {
			node temp=new node(sc.nextInt());
		}
		else {
			node temp=new node(sc.nextInt());
			temp.next=head;
			head=temp;
		}
	}
	static void insertend() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the va;ue which u want to insert at the end");
		node temp=new node(sc.nextInt());
		if(head==null) {
			head=temp;
		}
		else {
			node q=head;
			while(q.next!=null) {
				q=q.next;
			}
			q.next=temp;
		}
	}
	static void deletefirst() {
		if(head==null) {
			System.out.println("linked list is empty");
		}
		else {
			head=head.next;
		}
	}
	static void deleteend() {
		if(head==null) {
			System.out.println("Linked List is empty");
			
		}
		else {
			node curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
		}
	}
	static void insertatgiven() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the position u want to insert");
		int n=sc.nextInt();
		System.out.println("enter teh value of the node");
		node temp=new node(sc.nextInt());
		if(head==null) {
			System.out.println("as LL is empty so ");
			head=temp;
		}
		else if(n==1) {
			temp.next=head;
			head=temp;
		}
		else {
			node curr=head;
			for(int i=1;i<n-1;i++){
			curr=curr.next;
			
			}
			temp.next=curr.next;
			curr.next=temp;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		node head;
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:creation");
			System.out.println("2:Display");
			System.out.println("3:insert at begin");
			System.out.println("4:insert at end");
			System.out.println("5:Delete the first element");
			System.out.println("6:Delete the last element");
			System.out.println("7:insert at given position");
			
			int choice=sc.nextInt();
		
			switch(choice)
			{
			case 0:
				System.exit(0);
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				insertbegin();
				break;
			case 4:
				insertend();
				break;
			case 5:
				deletefirst();
				break;
			case 6:
				deleteend();
				break;
			case 7:
				insertatgiven();
				break;
				

			default :
				System.out.println("Wrong choice");
		

	     }
			
		}
		

	}

}
