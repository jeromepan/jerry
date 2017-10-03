package Discount;

import java.util.Date;

public class Test {
    public static void main(String []args){
        Customer c1 = new Customer("jim",false,"default");
        Customer c2 = new Customer("peter",true,"Gold");
        System.out.println(c1.toString());
        System.out.println(c2.toString());


        Visit v1 = new Visit(c2,new Date());
        Visit v2 = new Visit(c1,new Date());


        v1.setProductExpense(10.0);
        v1.setServiceExpense(10.0);
        System.out.println(v1.toString());

        v2.setServiceExpense(20.0);
        v2.setServiceExpense(20.0);
        v2.setProductExpense(20.0);
        System.out.println(v2.toString());

        System.out.println("Customer " + v1.getName() +" total spends $"+v1.getTotalExpense());
        System.out.println("Customer " + v2.getName() + " total spends $" +v2.getTotalExpense());
    }
}
