package DoublyLinkedList;

//jian pan 5728309

public class DoublyLinkedList {
    private Dnote head;
    private Dnote tail;


    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return (head ==  null && tail == null);
    }

    public boolean insert(int data){
        Dnote newnote = new Dnote(data);

        if(head == null){
            head = newnote;
            tail = head;
            return  true;
        }else if(data <= head.getData()){
            newnote.setNext(head);
            head.setPrevious(newnote);
            head = newnote;
            return true;
        }else  if(data <= tail.getData() && data >= head.getData()){
            head.setNext(newnote);
            newnote.setPrevious(head);
            newnote.setNext(tail);
            tail.setPrevious(newnote);
            return true;
/*
            while(tail != null){
                if(data <= tail.getData() && data >= head.getData()){
                    head.setNext(newnote);
                    newnote.setPrevious(head);
                    newnote.setNext(tail);
                    tail.setPrevious(newnote);
                    return true;
                    //break;
                }else{
                    tail = head;
                    head = head.getNext();
                }
            }

            if(tail == null){
                tail.setNext(newnote);
                newnote.setPrevious(tail);
                  */
            }else if(data > tail.getData()){
            newnote.setPrevious(tail);
            tail.setNext(newnote);
            tail = newnote;
            return  true;
        }
        return false;
    }

    public boolean delete(int data) {
        if (isEmpty()) {
            return false;
        } else if (data == head.getData()) {
            head = head.getNext();
            head.setPrevious(null);
            return true;

        } else if(data > head.getData() && data != tail.getData()){
            Dnote previous = head;
            Dnote current = previous.getNext();
            Dnote next = current.getNext();

            while (current != null) {

                if (data == current.getData()) {
                    previous.setNext(next);
                    next.setPrevious(previous);
                    return true;
                }

                previous = previous.getNext();
                current = current.getNext();
                next = next.getNext();

            }

           // if(current.getNext() == null)


        }else if(data == tail.getData()) {
            Dnote previous = tail.getPrevious();
            previous.setNext(null);
            return true;
        }
        return false;
    }

    public int count(){
        int count = -1;
        Dnote current = head;

        while(current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    public int search(int key){
        int index = 0;
        Dnote current = head;
        while(current != null){
            if(key == current.getData()){
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[ ");
        Dnote current = head;

        while(current != null){
            result.append(current.getData() + " ");
            current = current.getNext();
        }

        result.append(" ]");
        return result.toString();
    }

}
