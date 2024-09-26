/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdassignment01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hp
 */

// Scheduler class to manage seminars and scheduling
class Scheduler {
    private Map<String, Seminar> seminars = new HashMap<>();
    private Map<String, Slot> schedule = new HashMap<>();

    // Load seminar data from file
    public void loadSeminars(String seminarFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(seminarFile));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String title = parts[0].trim();
            String speaker = parts[1].trim();
            List<Integer> attendees = new ArrayList<>();
            for (int i = 2; i < parts.length; i++) {
                attendees.add(Integer.parseInt(parts[i].trim()));
            }
            seminars.put(title, new Seminar(title, speaker, attendees));
        }
        br.close();
    }

    // Load scheduling data from file
    public void loadSchedule(String scheduleFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(scheduleFile));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String seminarTitle = parts[0].trim();
            String room = parts[1].trim();
            int timeSlot = Integer.parseInt(parts[2].trim());
            schedule.put(seminarTitle, new Slot(room, timeSlot));
        }
        br.close();
    }

    // Find seminars with overlapping attendees
    public List<String> findOverlappingSeminars(String seminarTitle) {
        List<String> overlappingSeminars = new ArrayList<>();
        Seminar targetSeminar = seminars.get(seminarTitle);
        if (targetSeminar != null) {
            for (String title : seminars.keySet()) {
                if (!title.equals(seminarTitle)) {
                    Seminar seminar = seminars.get(title);
                    if (targetSeminar.hasOverlappingAttendees(seminar)) {
                        overlappingSeminars.add(title);
                    }
                }
            }
        }
        return overlappingSeminars;
    }

    // Check if a seminar conflicts with others in the same time-slot
    public boolean hasTimeSlotConflict(String seminarTitle) {
        Slot targetSlot = schedule.get(seminarTitle);
        if (targetSlot != null) {
            for (String title : schedule.keySet()) {
                if (!title.equals(seminarTitle)) {
                    Slot slot = schedule.get(title);
                    if (targetSlot.getTimeSlot() == slot.getTimeSlot()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

