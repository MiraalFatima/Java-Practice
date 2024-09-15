/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdlab3q2;

/**
 *
 * @author hp
 */
import java.util.List;

public class Student 
{
    private String name;
    private List<Integer> marks;

  
    public Student(String name, List<Integer> marks)
    {
        this.name = name;
        this.marks = marks;
    }

 
    public String getName()
    {
        return name;
    }

   
    public List<Integer> getMarks() 
    {
        return marks;
    }

  
    public double calculateAverageMarks()
    {
        int total = 0;
        for (int mark : marks)
        {
            total += mark;
        }
        return (double) total / marks.size();
    }

 
    public int getHighestMark()
    {
        int highest = marks.get(0);
        for (int mark : marks) 
        {
            if (mark > highest) 
            {
                highest = mark;
            }
        }
        return highest;
    }

  
    public int getLowestMark() {
        int lowest = marks.get(0);
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }

  
    public String calculateGrade() {
        double average = calculateAverageMarks();
        if (average >= 90) {
            return "A+";
        } else if (average >= 85) {
            return "A";
        } else if (average >= 80) {
            return "A-";
        } else if (average >= 75) {
            return "B+";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 65) {
            return "B-";
        } else if (average >= 60) {
            return "C+";
        } else if (average >= 55) {
            return "C";
        } else if (average >= 50) {
            return "C-";
        } else {
            return "F";
        }
    }
}

