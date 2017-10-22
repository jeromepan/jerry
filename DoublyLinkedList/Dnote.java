package DoublyLinkedList;
// jian pan 5728309
public class Dnote {
    private Dnote previous;
    private int data;
    private Dnote next;

    public Dnote(){
        previous = null;
        data = -1;
        next = null;

    }

    public Dnote(int data){
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(){
        this.data = data;
    }

    public Dnote getNext() {
        return next;
    }

    public Dnote getPrevious() {
        return previous;
    }

    public void setNext(Dnote next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPrevious(Dnote previous) {
        this.previous = previous;
    }

    @Override

    public String toString(){
        return String.format("d%", data);
    }
}
