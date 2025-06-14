package javaCourse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class DoubleLinkedList {
    public static void main(String[] args){
        LinkedList1 list=new LinkedList1();
        Scanner sc=new Scanner(System.in);
        int data;
        do{
            data=sc.nextInt();

            if(data>0){
                list.append(data);
            }
        }while(data>0);
        list.print();
    }
}
class LinkedList1{
    Node head=null;
    class Node{
     int data;
     Node next;
     Node prev;
     public Node(int data){
         this.data=data;
         this.next=null;
         this.prev=null;
     }
    }
    public void append(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            temp.prev=temp;
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}
