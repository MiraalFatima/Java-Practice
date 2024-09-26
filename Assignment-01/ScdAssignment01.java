/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scdassignment01;
import java.io.*;
import java.util.*;

/**
 *
 * @author hp
 */
public class ScdAssignment01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        Scheduler scheduler = new Scheduler();
        try {
            // Load seminars and schedule from files
            System.out.print("Enter seminar file path: ");
            String seminarFile = scanner.nextLine();
            scheduler.loadSeminars(seminarFile);

            System.out.print("Enter schedule file path: ");
            String scheduleFile = scanner.nextLine();
            scheduler.loadSchedule(scheduleFile);

            // Get seminar title for overlap and conflict check
            System.out.print("Enter the seminar title to check for overlap and time conflicts: ");
            String seminarTitle = scanner.nextLine();

            // Find overlapping seminars
            System.out.println("\nOverlapping seminars with '" + seminarTitle + "':");
            List<String> overlapping = scheduler.findOverlappingSeminars(seminarTitle);
            for (String seminar : overlapping) {
                System.out.println(seminar);
            }

            // Check for time-slot conflict
            System.out.println("\nDoes '" + seminarTitle + "' have a time-slot conflict?");
            System.out.println(scheduler.hasTimeSlotConflict(seminarTitle) ? "Yes" : "No");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        scanner.close();
    }
    }
    



 

    
