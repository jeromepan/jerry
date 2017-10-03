package Discount;

/**URl : http://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html
 *
 * 7.1  Ex: The Discount System
 *
 You are asked to write a discount system for a beauty saloon, which provides services and sells beauty products.
 It offers 3 types of memberships: Premium, Gold and Silver. Premium, gold and silver members receive a discount of 20%, 15%, and 10%, respectively, for all services provided.
 Customers without membership receive no discount. All members receives a flat 10% discount on products purchased (this might change in future).
 Your system shall consist of three classes: Customer, Discount and Visit, as shown in the class diagram.
 It shall compute the total bill if a customer purchases $x of products and $y of services, for a visit. Also write a test program to exercise all the classes.
 *
 */

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    Customer(){
        this.member = false;
    }

    Customer(String name, boolean member, String memberType){
        this.name = name;
        this.member = member;
        this.memberType = memberType;

    }

    public String getName() {
        return name;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String toString(){
        return getName() + " " + isMember() + " " + getMemberType();
    }
}
