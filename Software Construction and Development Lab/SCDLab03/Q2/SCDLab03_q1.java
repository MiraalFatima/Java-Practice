/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scdlab03_q1;


import java.util.Iterator;
/**
 *
 * @author hp
 */
public class SCDLab03_q1 {

  

public class Main {
    public static void main(String[] args) {
     
        LinkedList<Integer> linkedList = new LinkedList<>();

       
        linkedList.addelement(10);
        linkedList.addelement(20);
        linkedList.addelement(30);

       
        linkedList.addLastelement(40);
        linkedList.addLastelement(50);

        System.out.println("Elements in the list (forward): ");
        Iterator<Integer> forwardIterator = linkedList.iterator();
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Elements in the list (reverse): ");
        Iterator<Integer> reverseIterator = linkedList.reverseiterator();
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
        System.out.println();

      
        System.out.println("First element: " + linkedList.peekFirst());
        System.out.println("Last element: " + linkedList.peekLast());

      
        System.out.println("Removed first element: " + linkedList.removefirstelement());
        System.out.println("Removed last element: " + linkedList.removeLastElement());

        System.out.println("Updated list (forward): ");
        forwardIterator = linkedList.iterator();
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Is the list empty? " + linkedList.isEmpty());

        
        System.out.println("Size of the list: " + linkedList.size());
    }
}

}
