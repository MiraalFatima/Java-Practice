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
// Circle class extending Shape
class Circle<T extends Number> extends Shape<T> {
    public Circle(T radius) {
        super(new ArrayList<>());
        dimensions.add(radius);
    }

    // Implement calculateArea for circle
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(dimensions.get(0).doubleValue(), 2);
    }

    // Implement display for circle
    @Override
    public void display() {
        System.out.println("Circle with Radius: " + dimensions.get(0));
    }
}

