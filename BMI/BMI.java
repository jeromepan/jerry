package BMI;

public class BMI {
    private double weight;
    private double height;
    private String name;

    BMI(double weight,double height){
        this.weight = weight;
        this.height = height;
    }
   BMI(){

   }

    public double getWeight(){
        return this.weight;
    }

    void setWeight(){
        this.weight = weight;
    }

    public double getHeight(){
        return this.height;
    }

    void setHeight(double height){
        this.height = height;
    }

    public double getBMI(){

        return weight/((height/100) * (height/100)) ;

    }



    public String fetch(){
        double BMI = getBMI();
        if(BMI < 16.5){
            return "servely underweight";
        }else if(BMI>=16.5 && BMI< 18.5) {
            return "underweight";
        }else if(BMI >= 18.5 && BMI <= 25){
            return "Normal";
        }else{
            return "overweight";
        }
    }

}
