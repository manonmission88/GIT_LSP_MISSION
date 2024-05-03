package org.howard.edu.lsp.oopfinal.question3;

/*
 * @author : Manish Niure 
 *  ShapeFactory class

*/
public class ShapeFactory {
    public static Shape createShape(String shapeType) {
    	// check for circle 
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
          // check for rectangle 
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            // if not valid type return null in that case 
            return null;
        }
    }
}
