/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l22_7902scdlab2_q1;

/**
 *
 * @author hp
 */
class Jobclass {
    String title;
    int complexityLevel;

    public Jobclass(String title, int complexityLevel) {
        this.title = title;
        this.complexityLevel = complexityLevel;
    }

    @Override
    public String toString() {
        return title + " (Complexity Level: " + complexityLevel + ")";
    }
}