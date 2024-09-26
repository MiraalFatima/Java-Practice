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
// Slot class to represent a time-slot for a seminar
class Slot {
    private String room;
    private int timeSlot;

    public Slot(String room, int timeSlot) {
        this.room = room;
        this.timeSlot = timeSlot;
    }

    public int getTimeSlot() {
        return timeSlot;
    }
}