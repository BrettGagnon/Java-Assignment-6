/*
 * Brett Gagnon
 * Assignment 6
 * Shape Hierarchy
 */
package shape;

//Extend the Shape class
public class Circle extends Shape {
    
    //Private Instance variable to hold the radius
    private double mRadius;
    
    //Constructor to pass color and add radius
    public Circle(String color, double radius)
    {
        super(color);
        mRadius = radius;
    
    }
    
    //this overriding method computes and returns the Circle object's area value.
    public double area()
    {
    double area;
    
    area = mRadius * mRadius * 3.14159;
    
    return area;
    }
    
    //This method returns the object's description (color, type, measurements, 
    //and area) as a String.
    public String toString()
    {
        
        return this.getColor()  + " Circle " + "with radius of " + mRadius + " and area of "
                + area();
    
    }
    
    
    
}
