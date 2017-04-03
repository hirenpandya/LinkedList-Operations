/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import static linkedlist.LinkedList.sum;

/**
 *
 * @author root
 */
public class MainClass {
    public static void main(String args[]){
        LinkedList l1 = new LinkedList(2);
        
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(10);
        System.out.println("\nThe First Linked List is : ");
        l1.print();
        
        
        LinkedList l2 = new LinkedList(2);
        l2.add(4);
        l2.add(2);
        l2.add(2);
        l2.add(1);
        System.out.println("\n\nThe Second Linked List is : ");
        l2.print();
        
        //l1.delete(10);
        
        
        LinkedList l3 = sum(l1.head,l2.head);
        System.out.println("\n\nThe Result : ");
        l3.print();
    }
}
