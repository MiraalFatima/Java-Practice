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
class Rectangle<T extends Number> extends Shape<T> {
    public Rectangle(T length, T width) {
        super(new ArrayList<>());
        dimensions.add(length);
        dimensions.add(width);
    }

    // Implement calculateArea for rectangle
    @Override
    public double calculateArea() {
        return dimensions.get(0).doubleValue() * dimensions.get(1).doubleValue();
    }

    // Implement display for rectangle
    @Override
    public void display() {
        System.out.println("Rectangle with Length: " + dimensions.get(0) + " and Width: " + dimensions.get(1));
    }
}
