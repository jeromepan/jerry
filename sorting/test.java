package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class test {
    public static void main(String []args){
        ArrayList<String> obj= new ArrayList<String>();

        obj.add("a");
        obj.add("b");
        obj.add("c");
        obj.add("d");

        System.out.println(obj);

        obj.add(0,"d");
        obj.add(1,"c");
        obj.add(2,"b");
        obj.add(3,"a");

        System.out.println(obj);

        obj.remove(0);

        System.out.println(obj);

        String s = obj.get(2);

        for(int i = 0; i<obj.size(); i++){
            System.out.print(obj.get(i));
        }

        System.out.println(obj.size());//the length of arrayList

        Collections.sort(obj);//sort the arraylist.
        //display the Arraylist
        for(String counter : obj){
            System.out.println(counter);
        }

        ArrayList<String> obj1 = new ArrayList<String>();
        obj1.add("test1");
        obj1.add("test2");
        obj1.add("test3");
        obj1.add("test4");
        // addAll(collection c) Method example
        obj.addAll(obj1);
        System.out.println(obj);

        //insert all elements form the other Arraylist
        obj.addAll(3,obj1);
        System.out.println(obj);

        //sublist to arrylist and it also can sublist to List
        ArrayList<String>obj2 = new ArrayList<String>(obj1.subList(1,2));
        System.out.println(obj2);

        // use object.contains() to check exists in arraylsit
    }
}
