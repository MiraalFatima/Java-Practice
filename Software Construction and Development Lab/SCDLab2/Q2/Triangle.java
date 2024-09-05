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

class Triangle<T extends Number> extends Shape<T> {
    public Triangle(T base, T height) {
        super(new ArrayList<>());
        dimensions.add(base);
        dimensions.add(height);
    }

    // Implement calculateArea for triangle
    @Override
    public double calculateArea() {
        return 0.5 * dimensions.get(0).doubleValue() * dimensions.get(1).doubleValue();
    }

    // Implement display for triangle
    @Override
    public void display() {
        System.out.println("Triangle with Base: " + dimensions.get(0) + " and Height: " + dimensions.get(1));
    }
}