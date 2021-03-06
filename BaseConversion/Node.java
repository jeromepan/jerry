package BaseConversion;
// jian pan 5728309
public class Node<T>{
    private T data;
    private Node<T> next;

    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node(T data){
        this.next = null;
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override

    public String toString(){
        return data.toString();
    }
}
