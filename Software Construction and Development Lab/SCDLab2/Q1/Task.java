/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l22_7902scdlab2_q1;

/**
 *
 * @author hp
 */
// Task class
public class Task {
    String name;
    String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " (Description: \"" + description + "\")";
    }
}
