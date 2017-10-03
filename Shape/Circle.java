package Shape;

public class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = 1.0;
    }
    Circle(double radius, String color, boolean filled){
        this. radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return  radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return radius + "  " + super.toString();
    }
}
