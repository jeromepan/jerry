package linkedList;
//jian pan 5728309
public class linkedList {
    private node head;

    public linkedList(){
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean insert(int data){
        node newnode = new node(data);
        if(isEmpty()){
            head = newnode;
            return true;
        }else if(data < head.getDate()){
            //node tmp = head;
            //head = newnode;
            //head.setNext(tmp);

            newnode.setNext(head);
            head = newnode;

            return true;
        }else {
            node previous = head;
            node current = head.getNext();

            while(current != null && current.getDate() < data){
                previous = previous.getNext();
                current = current.getNext();
            }

            previous.setNext(newnode);
            newnode.setNext(current);

            return true;
        }

    }

    /*public boolean delete(int data){
        linkedList list = new linkedList();
        //node newnode = new node(data);
        if(isEmpty() || search(data) == -1){
            return false;
        }else if(data == head.getDate()){
            head = head.getNext();
            return true;
        }else {                System.out.println(list.search(data));


            //node previous = head;
            //node current = head.getNext();
            //node current = head.getNext();
            for (int i = 0; i <= list.count(); i++) {

                if (i == list.search(data)) {
                    // node current = previous.getNext().getNext();
                    //previous = current;
                }
                // previous = previous.getNext();
            }


            return true;
        }
    }*/

    public boolean delete(int data){
        if(isEmpty() || search(data) == -1){
            return false;
        }else if(data == head.getDate()){
            head = head.getNext();
            return true;
        }else{
            node previous = head;
            node current = previous.getNext();
            node next = current.getNext();
            while(current != null){

                if(current.getDate() == data){
                    previous.setNext(next);
                    return true;
                }
                previous = previous.getNext();
                current = current.getNext();
                next = next.getNext();
            }

            return false;
        }
    }

    public int count(){
        int count = -1;
        node current = head;

        while (current != null){
            count++;
            current = current.getNext();
        }

        return count;
    }

    public int search(int key){
        int index = 0;
        node current = head;

        while (current != null){
            if(key == current.getDate()){
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
        node current = head;

        while(current != null){
            result.append(current.getDate() + " ");
            current = current.getNext();
        }

        result.append(" ]");
        return result.toString();
    }


}
