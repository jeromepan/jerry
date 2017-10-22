package DoublyLinkedList;
// jian pan 5728309
public class Test {
    public static void main(String []args){
        DoublyLinkedList list = new DoublyLinkedList();
        //list.insert(1);
        System.out.println(list.insert(12));
        System.out.println(list.insert((1)));
        boolean i = false;
        System.out.println(!i);
        list.insert(3);
        list.insert(13);

        System.out.println(list.toString());

        System.out.println(list.count());
        System.out.println(list.search(1));
        System.out.println(list.delete(13));
        System.out.println(list.toString());
    }
}
