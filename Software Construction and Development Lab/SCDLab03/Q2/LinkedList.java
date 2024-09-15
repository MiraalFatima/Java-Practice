package com.mycompany.scdlab03_q1;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {   

    private Node head;   // Moved outside Node class
    private Node tail;   // Moved outside Node class
    private int size = 0; // Moved outside Node class

    private class Node
    {
        private Node next;
        private Node prev;
        private T data;

        public Node(T data)
        {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    // Method to add element at the beginning
    public void addelement(T element)
    {
        Node newnode = new Node(element);
        if(head == null)
        {
            head = tail = newnode;
        }
        else
        {
            newnode.next = head;
            head.prev = newnode;
            head = newnode; 
        }
        size++;
    }

    // Method to add element at the end
    public void addLastelement(T element)
    {
        Node newnode = new Node(element);
        if(head == null)
        {
            head = tail = newnode;
        }
        else
        {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode; 
        }
        size++;
    } 

    // Method to remove first element
    public T removefirstelement()
    {
        if(head == null) 
        {
            System.out.println("De-queue is Empty");
            return null; // Return null if list is empty
        }

        T removeElement = head.data;
        head = head.next;
        if(head != null)
        {
            head.prev = null;
        }
        else
        {
            tail = null;
        }
        size--;
        return removeElement;
    }

    // Method to remove last element
    public T removeLastElement()
    {
        if(head == null) 
        {
            System.out.println("De-queue is Empty");
            return null; // Return null if list is empty
        }

        T removeElement = tail.data;
        tail = tail.prev;
        if(tail != null)
        {
            tail.next = null;
        }
        else
        {
            head = null;
        }
        size--;
        return removeElement;
    }

    // Peek first element
    public T peekFirst()
    {
        if(head == null)
        {
            System.out.println("De-queue is Empty");
            return null; // Return null if list is empty
        }
        return head.data;
    }

    // Peek last element
    public T peekLast()
    {
        if(head == null)
        {
            System.out.println("De-queue is Empty");
            return null; // Return null if list is empty
        }
        return tail.data;
    }

    // Check if the list is empty
    public boolean isEmpty()
    {
        return head == null && tail == null;
    }

    // Get the size of the list
    public int size()
    {
        return size;
    }

    // Implementation of reverse iterator
    public Iterator<T> reverseiterator()
    {
        return new ReverseLinkedDeque();
    }

    private class ReverseLinkedDeque implements Iterator<T>
    {
        private Node currentnode = tail;

        @Override
        public boolean hasNext() 
        {
            return currentnode != null;
        }

        @Override
        public T next()
        {
            T data = currentnode.data;
            currentnode = currentnode.prev;
            return data;
        }
    }

    // Forward iterator
    @Override
    public Iterator<T> iterator()
    {
        return new LinkedDeque();
    }

    private class LinkedDeque implements Iterator<T>
    {
        private Node currentnode = head;

        @Override
        public boolean hasNext()
        {
            return currentnode != null;
        }

        @Override
        public T next()
        {
            T data = currentnode.data;
            currentnode = currentnode.next;
            return data;
        }
    }
}
