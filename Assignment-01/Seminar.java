/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdassignment01;
import java.io.*;
import java.util.*;
/**
 *
 * @author hp
 */
// Seminar class to store seminar information
class Seminar {
    private String title;
    private String speaker;
    private List<Integer> attendees;

    public Seminar(String title, String speaker, List<Integer> attendees) {
        this.title = title;
        this.speaker = speaker;
        this.attendees = attendees;
    }

    public String getTitle() {
        return title;
    }

    public List<Integer> getAttendees() {
        return attendees;
    }

    // Check if this seminar has overlapping attendees with another seminar
    public boolean hasOverlappingAttendees(Seminar other) {
        for (Integer attendee : attendees) {
            if (other.getAttendees().contains(attendee)) {
                return true;
            }
        }
        return false;
    }
}

