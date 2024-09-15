/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scdlab3q2;

/**
 *
 * @author hp
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.*;
public class SCDLAB3Q2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        String inputFilePath = "C:\\Users\\hp\\Documents\\NetBeansProjects\\SCDLAB3Q2\\src\\scdlab3q2\\student.txt";    
        String outputFilePath = "C:\\Users\\hp\\Documents\\NetBeansProjects\\SCDLAB3Q2\\src\\scdlab3q2\\processed_data.txt";

        StudentData processor = new StudentData();

        try 
        {
       
            List<Student> students = processor.readStudentData(inputFilePath);

            processor.writeProcessedData(outputFilePath, students);

            System.out.println("Student data processed successfully. Output written to: " + outputFilePath);

        } 
        catch (FileNotFoundException e) 
        {
            System.err.println("Input file not found: " + inputFilePath);
        } 
        catch (IOException e) 
        {
            System.err.println("An error occurred while reading or writing files.");
        }
    }
}