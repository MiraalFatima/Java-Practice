/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdlab3q2;

/**
 *
 * @author hp
 */
import java.io.*;
import java.util.*;

public class StudentData
{

    
    public List<Student> readStudentData(String inputFilePath) throws FileNotFoundException, IOException
    {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath)))
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] data = line.split(", ");
                String name = data[0];
                List<Integer> marks = new ArrayList<>();
                for (int i = 1; i < data.length; i++)
                
                {
                    marks.add(Integer.parseInt(data[i]));
                }
                students.add(new Student(name, marks));
            }
        }
        return students;
    }

   
    public void writeProcessedData(String outputFilePath, List<Student> students) throws IOException 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath)))
        {
            for (Student student : students) 
            {
                String name = student.getName();
                double averageMarks = student.calculateAverageMarks();
                int highestMark = student.getHighestMark();
                int lowestMark = student.getLowestMark();
                String grade = student.calculateGrade();

                writer.write(name + ": Average Marks = " + averageMarks + ", Highest Mark = " 
                       + highestMark + ", Lowest Mark = " + lowestMark + ", Grade = " + grade);
                writer.newLine();

            }
        }
    }

}

