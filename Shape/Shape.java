package Shape;

/**
 * Superclass Shape and its subclasses Circle, Rectangle and Square
 *
 * Provide the appropriate constructors (as shown in the class diagram). Hint:
 * public Square(double side) {
 * super(side, side);  // Call superclass Rectangle(double, double)
 *}
 *
 * Override the toString() method to return "A Square with side=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.
 * Do you need to override the getArea() and getPerimeter()? Try them out.
 * Override the setLength() and setWidth() to change both the width and length, so as to maintain the square geometry.
 * 
 */
public class Shape {
    String color = "red";
    boolean filled = true;

    Shape(){

    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled(){
        return filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return color + " " + filled;
    }
}
