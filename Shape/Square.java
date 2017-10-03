package Shape;

public class Square extends Rectangle{
    public Square(){
        this.length = 1.0;
        this.width = 1.0;
    }

    public Square(double side){

        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side,side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side){
        setLength(side);
        setWidth(side);
    }

    @Override


    public void setLength(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString(){
        return " " + getWidth() + " " + super.toString();
    }
}
