package linkedList;
//jian pan 5728309
public class node {
    private node next;
    private int data;

    node(){
        next = null;
        data = 0;
    }

    node(int data){
        this.data = data;
        this.next = null;
    }

    public int getDate(){
        return data;
    }

    public void setDate(int date){
       this.data = date;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return  String.format("%d",this.data);
    }
}
