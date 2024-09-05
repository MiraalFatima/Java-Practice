/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l227902_scdlab02_q2;

/**
 *
 * @author hp
 */
import java.util.ArrayList;

// Abstract generic class Shape
abstract class Shape<T extends Number> {
    protected ArrayList<T> dimensions;

    public Shape(ArrayList<T> dimensions) {
        this.dimensions = dimensions;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();

    // Abstract method to display the shape's dimensions
    public abstract void display();
}
