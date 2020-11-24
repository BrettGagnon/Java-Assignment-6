/*
 * Brett Gagnon
 * Assignment 6
 * Shape Hierarchy
 */
package shape;

public class Square extends Shape{
    
    private double wSidelength;
    
    //Constructor to pass color and add side-length
    public Square(String color, double sidelength)
    {
        super(color);
        wSidelength = sidelength;
    }
    
    // Method which computes and return's the object's area
    public double area()
    {
        double area;
        area = wSidelength * wSidelength;
        return area;
    }
    
    //This method returns the object's description (color, type, measurements, 
    //and area) as a String.
    public String toString()
    {
        
        return this.getColor()  + " Square " + "with a length of " + wSidelength +
                " with area of " + area();
    }
       
}
