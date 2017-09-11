package BMI;

public class BMI {
    private double weight;
    private double height;
    private String name;

    BMI(){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight(){
        return this.weight;
    }

    void setWeight(double weight){
        this.weight = weight;
    }

    public double getHeight(){
        return this.height;
    }

    void setHeight(double height){
        this.height = height;
    }

    public double getBMI(){
        double BMI = 0;
        BMI = weight/height * height ;
        return BMI;
    }

    public String fetch(){
        double BMI = getBMI();
        if(BMI < 18.5){
            return "underweight";
        }else if(BMI >= 18.5 && BMI <= 25){
            return "Normal";
        }else{
            return "overweight";
        }
    }

}
