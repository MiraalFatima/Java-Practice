/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l227902_scdlab02_q2;

/**
 *
 * @author hp
 */
public class allShapeClass {
    
 
    public static <T extends Number> void printArea(Shape<T> shape) {
        shape.display();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println();
    
}

}
