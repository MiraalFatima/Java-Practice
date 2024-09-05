/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l22_7902scdlab2_q1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author hp
 */
public class L22_7902scdLab2_Q1 {

   public static void main(String[] args) {
        // Instantiate two SimpleQueue objects
        SimpleQueue<Task> taskQueue = new SimpleQueue<>();
        SimpleQueue<Jobclass> jobQueue = new SimpleQueue<>();

        // Add several Task objects to the taskQueue
        taskQueue.enqueue(new Task("Task A", "Do LAB-02"));
        taskQueue.enqueue(new Task("Task B", "Prepare Your OR Quiz"));
        taskQueue.enqueue(new Task("Task C", "Write a MEMO for TBW"));

        System.out.println("\n--- Task Queue ---");
        System.out.println("Original Task Queue:");
        taskQueue.displayQueue();

        // Dequeue the first task
        System.out.println("\nDequeued Task: " + taskQueue.dequeue());
        System.out.println("Queue after dequeuing the first task:");
        taskQueue.displayQueue();

        // Sort tasks by name using custom comparator
        System.out.println("\nSorted Tasks by Name:");
        List<Task> sortedTasks = taskQueue.getSortedList(Comparator.comparing(task -> task.name));
        sortedTasks.forEach(System.out::println);

        //  jobQueue
        jobQueue.enqueue(new Jobclass("Job X", 5));
        jobQueue.enqueue(new Jobclass("Job Y", 2));
        jobQueue.enqueue(new Jobclass("Job Z", 4));

        System.out.println("\n--- Job Queue ---");
        System.out.println("Original Job Queue:");
        jobQueue.displayQueue();

        // Dequeue 
        System.out.println("\nDequeued Job: " + jobQueue.dequeue());
        System.out.println("Queue after dequeuing the first job:");
        jobQueue.displayQueue();

        // by custom comparator
        System.out.println("\nSorted Jobs by Title:");
        List<Jobclass> sortedJobs = jobQueue.getSortedList(Comparator.comparing(job -> job.title));
        sortedJobs.forEach(System.out::println);
    }
   
}