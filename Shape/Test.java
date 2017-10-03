package Shape;

public class Test {
    public static void main(String []args){
        Shape s1 = new Shape("purple",false);

        if(s1.isFilled()){
            System.out.println("Shape of color is " + s1.getColor() + "and shape is filled");
        }else{
            System.out.println("shape of color is " + s1.getColor() + "and shape is not filled");
        }

        Circle c1 = new Circle(10.0);
        System.out.println(c1.toString());

        Square sq1 = new Square();
        System.out.println(sq1.toString());

        Square sq2 = new Square(3.0,"Black",true);
        System.out.println(sq2.toString());
        System.out.println("Area of sq2 = " + sq2.getArea());
        System.out.println("perimeter of sq2 = " + sq2.getPerimeter());


    }
}
