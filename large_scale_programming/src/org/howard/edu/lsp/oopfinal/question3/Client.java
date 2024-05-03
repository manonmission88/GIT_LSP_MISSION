package org.howard.edu.lsp.oopfinal.question3;

/*
 * @author : Manish Niure 
*Client class

*/
public class Client {
 public static void main(String[] args) {
	 // instantianting circle class 
     Shape circle = ShapeFactory.createShape("circle");
     circle.draw();
     
     // instantianting rectangle class 
     Shape rectangle = ShapeFactory.createShape("rectangle");
     rectangle.draw();
 }
}
