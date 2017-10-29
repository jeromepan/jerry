package Queue;

public class Queue <T>{
    private Node<T> front;

    public Queue(){
        this.front = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public boolean isFull(){
        return false;
    }

    public boolean enqueue(T item){
        Node<T> newnode = new Node<T>(item);
        if(isEmpty()){
            front = newnode;
            return true;
        }else {
            Node previous = front;
            Node current = previous.getNext();
           while(current != null){
               previous = current;
               current = current.getNext();
           }

           previous.setNext(newnode);

            return true;
        }
    }



    public T dequeue(){
        if(isEmpty()){
            return null;
        }else {
            Node current = front;
            front = front.getNext();

            return (T) current.getData();
        }
    }

    public T getFrontItem(){
        if(isEmpty()){
            return  null;
        }else{
            return front.getData();
        }
    }

    @Override
    public String toString(){
        return front.toString();
    }
}
