package BaseConversion;

import PalindromeChecker.Node;

// jian pan 5728309
public class Stack<T>{
    private Node<T> top;

    public Stack(){
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public boolean isFull(){
        return false;
    }

    public boolean push(T item){
        Node<T> newnode = new Node<T>(item);
        if(isEmpty()){
            top = newnode;
            return true;
        }else {
            newnode.setNext(top);
            top = newnode;
            return true;
        }

    }

    public  T pop(){
        if(isEmpty()){
            return  null;
        }else {
            T item = top.getData();
            top = top.getNext();
            return item;
        }


    }


    public T getTopItem(){
        if(isEmpty()){
            return null;
        }else {
            return top.getData();
        }
    }



    @Override
    public String toString(){
        return  top.toString();
    }
}
