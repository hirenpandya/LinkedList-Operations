/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author root
 */

public class LinkedList {

    Node head;
    
    public LinkedList(){

    }    
    public LinkedList(int data){
        head = new Node(data);
    }
    
    public void add (int data){
        Node current = this.head;
        while(current.next!=null){
            current = current.next;
        }
        
        Node new_node = new Node(data);
        current.next = new_node;
    }
    
    public void delete (int data){
        Node current = this.head;
        Node previous = new Node();
        
        if(head.data==data){
            head = head.next;
        } else{
            while(current.data!=data){
                previous = current;
                current = current.next;
            }
        }
        previous.next = current.next;
    }    
    
    public void print(){
        Node current = this.head;
        while(current!=null){
            System.out.print(current.data+"\t");
            current = current.next;
        }        
    }
    
    public static LinkedList sum(Node l1, Node l2){
        Node current1 = l1;
        Node current2 = l2;
        LinkedList new_list = null;
        
        int cnt = 0;
        int temp = 0;
        while(current1!=null || current2!=null){
            int d = 0;
            int t = 0;
            
            if(current1!=null){
                d = current1.data;
            }
            
            if(current2!=null){
                t = current2.data;
            }
            
            int sum = d + t;
            
            if(cnt==0){
                new_list = new LinkedList(sum);
            } else {
                new_list.add(sum);
            }
            
            current1 = current1.next;
            current2 = current2.next;
            
            cnt++;
        }
        
        return new_list;
        
    }
    
}
