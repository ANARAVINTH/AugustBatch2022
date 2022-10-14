package automation;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        List<Integer> k = new ArrayList<Integer>();

        k.add(1);
        k.add(78);
        k.add(67);
        k.add(1,4);
        k.add(7);
        System.out.println(k);

        for(int i:k){
            System.out.println(i);
        }

        ArrayList u = new ArrayList();

        u.add("Aravinth");
        u.add(7);

        for(Object j:u){
            System.out.println(j);
        }


        list.add("aravinth");
        list.add("AN");

        System.out.println(list);

        list.add(1,"xyz");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);


        for(String h:list){
            System.out.println(h);
        }

    }
}
