package Queue;
// jain pan 5728309
public class QueueDriver {
    public static void main(String [] args){
        Queue queue = new Queue();

        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue("a");
        queue.enqueue(5);
        queue.enqueue("c");
        queue.dequeue();
        //queue.dequeue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.getFrontItem());

        while(queue.isEmpty() == false){

            System.out.print(queue.toString() + " ");
            queue.dequeue();
        }
       // System.out.println(queue.toString());
    }


}
