package linkedList;
//jian pan 5728309
import java.util.Scanner;

public class singlylinkedlist {
    public static void main(String [] args){
        node newnode = new node(1);
        node newnode1 = new node(2);
        node newnode2 = new node(3);

        System.out.println(newnode);
        System.out.println(newnode1);
        System.out.println(newnode2);

        linkedList list = new linkedList();
        //System.out.println(list.toString());
        list.insert(8);
        list.insert(2);
        list.insert(5);
        list.insert(3);
        //list.insert(2);
        //list.insert(5);
        //list.insert(3);
        System.out.println(list.toString());

        list.search(2);
        System.out.println(list.count());
        list.delete(8);

        list.delete(2);

        list.delete(3);

        System.out.println(list.search(3));
        System.out.println(list.toString());

        //System.out.println(list.toString());
    }
}
