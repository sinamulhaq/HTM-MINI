import java.util.Scanner;
public class Circula_LinklList {
static class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
Node head=null;
Node tail=null;

public void creation()
{
	int n;
	Scanner sc=new Scanner (System.in);
	do {
	System.out.println("Enter the data");
	int data =sc.nextInt();
	Node newNode=new Node(data);
	if(head==null)
	{
		head=newNode;
		tail=newNode;
		newNode.next=tail;   //newNode.next=head;      
	}
	else
	{
		newNode.next=head;
		head=newNode; 
		tail.next=head;
	}

	System.out.println("Do you Want to Continue then press 1");
	 n=sc.nextInt();
}
while(n==1);
}
public void traverse()
{
	Node temp=head;
	if(head==null)
	{
		System.out.println("LL does not exist");
	}
	else
	{
		do
	{
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
		while(temp!=head);
	}
}
public void delete()
{
	System.out.println("now !st node is deleted");
	Node temp=head;
	 temp=temp.next;
	 head=temp;
	 tail.next=head;
}
	public static void main(String[] args) {
		 Circula_LinklList obj =new  Circula_LinklList();
		 obj.creation();
		 obj.traverse();
		 obj.delete();
	}

}
