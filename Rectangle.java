/*
 * Brett Gagnon
 * Assignment 6
 * Shape Hierarchy
 */
package shape;

public class Rectangle extends Shape {
    
    //set private instance variables for width and length
    private double wWidth;
    private double wLength;
    
    //Constructor to pass color and add width and length
    public Rectangle(String color, double width, double length)
    {
        // reference the color variable found in the Shape Class & assign length and width
        super(color);
        wLength = length;
        wWidth = width;
    }
    
    // Method which computes and return's the object's area 
    public double area()
    {
        double area;
        area = wWidth * wLength;
        return area;
    }
    
    //This method returns the object's description (color, type, measurements, 
    //and area) as a String.
    public String toString()
    {
         return this.getColor()  + " Rectangle " + "with a length of " + wLength +
                 " and a width of " + wWidth + " with area of " + area();
    
    }
    
    
}
