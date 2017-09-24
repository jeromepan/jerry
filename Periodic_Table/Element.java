package Periodic_Table;

/**Write a program that allows the user to search an element in the periodic table by the element’s name or symbol. You can use an array in this exercise
 * Created by jerry   on 9/24/2017.
 */
public class Element {
    private String element;
    private String name;
    private int atomicNumber;
    private String atomicSymbol;
    private double mass;
    private int period;
    private int group;



    Element(){
        //this.element = element;
    }
    Element(String name, int atomicNumber, String atomicSymbol, double mass, int period, int group){
        this.name =name;
        this.atomicNumber = atomicNumber;
        this.atomicSymbol = atomicSymbol;
        this.mass = mass;
        this.period = period;
        this.group = group;
    }

    public double getMass() {
        return mass;
    }

    public int getGroup() {
        return group;
    }

    public int getPeriod() {
        return period;
    }

    public String getAtomicSymbol() {
        return atomicSymbol;
    }

    public String getName() {
        return name;
    }

    public int getAdomicNumber() {
        return atomicNumber;
    }

    public void setAdomicNumber(int adomicNumber) {
        this.atomicNumber = adomicNumber;
    }

    public void setAtomicSymbol(String atomicSymbol) {
        this.atomicSymbol = atomicSymbol;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeriod(int period) {
        this.period = period;
    }


    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void getValue(){
        Element ele = new Element();

    }
    public String toString(){
        return name + " " + atomicNumber+ " "+ atomicSymbol+ " "+ mass+ " "+ period+ " " +group;
    }


}
