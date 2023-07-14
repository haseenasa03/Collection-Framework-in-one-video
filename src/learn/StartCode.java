package learn;
import java.util.*;


public class StartCode {
    public static void main(String[] args) {
        System.out.println("welcome to code java collection framework");


        /* creating collection
        1) Type Safe -same type elements(objects) are added to collection
        2) Un type safe - different types of elements can be added to collection
        */

        //Type safe collection
        ArrayList<String> names=new ArrayList<String>();
        names.add("haseena");
        names.add("sachin");
        names.add("praveen");
        names.add("nagraj");
        names.add("rahul");
        System.out.println(names);
        System.out.println(names.get(4));
        names.remove("haseena");
        System.out.println(names);


  //untype safe
//        LinkedList list=new LinkedList();
//        list.add("pramod");
//        list.add("123");
//        list.add("345.8");
//        list.add("list");
//        list.add("false");
//        System.out.println(list);
//        System.out.println(list.get(4));
//


    }
}
