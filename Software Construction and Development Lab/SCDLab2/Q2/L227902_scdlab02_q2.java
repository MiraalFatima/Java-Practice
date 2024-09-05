/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l227902_scdlab02_q2;

/**
 *
 * @author hp
 */
public class L227902_scdlab02_q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Rectangle<Double> rectangle = new Rectangle<>(5.5, 3.2);
        Circle<Integer> circle = new Circle<>(7);
        Triangle<Float> triangle = new Triangle<>(5.0f, 8.0f);

    
        System.out.println("--- Shape Area Calculations ---");
        allShapeClass.printArea(rectangle);  
        allShapeClass.printArea(circle);
        allShapeClass.printArea(triangle);  
    }
    
    
}

