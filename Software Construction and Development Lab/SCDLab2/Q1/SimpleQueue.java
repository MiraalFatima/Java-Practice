/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l22_7902scdlab2_q1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;
/**
 *
 * @author hp
 */
// Generic SimpleQueue class
class SimpleQueue<T> {
    private ArrayList<T> queue = new ArrayList<>();

    // Add element to the queue
    public void enqueue(T element) {
        queue.add(element);
        System.out.println("Added: " + element);
    }

    // Remove and return the element from the front of the queue
    public T dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue.remove(0);
    }

    // Return a sorted list of elements based on a custom comparator
    public List<T> getSortedList(Comparator<T> comparator) {
        List<T> sortedList = new ArrayList<>(queue);
        sortedList.sort(comparator);
        return sortedList;
    }

    // Display all elements in the queue
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (T element : queue) {
            System.out.println(element);
        }
    }
}
