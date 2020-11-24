/*
 * Brett Gagnon
 * Assignment 6
 * Shape Hierarchy
 */
package shape;

public class Shape {
    
    //Initialize private string variable for color
    private String mColor;
    
    //A constructor that sets the color instance value.
    public Shape(String color)
    {
        mColor = color;
    }
    
    //This method returns the object's color value
    public String getColor()
    {
    return mColor;
    }
    
    // Method which computes and return's the object's area (0.0 for base Shape class)
    public double area()
    {  
    return 0.0;
    }
    
    //This method returns the object's description (color, type, measurements, 
    //and area) as a String. Must be overridden in each derived class.
    //For the base Shape class, this method returns the string "generic shape".
    public String toString()
    {
    return "GENERIC SHAPE ";
    }
    
    
    
}
