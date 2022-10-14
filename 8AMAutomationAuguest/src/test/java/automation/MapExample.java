package automation;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


    public static void main(String[] args) {


        Map<Integer,String> hm = new HashMap<Integer, String>() ;

        hm.put(546,"Aravinth");
        hm.put(123,"Kodi");
        hm.put(324,"Natraj");

        for (Map.Entry m:hm.entrySet()){

            System.out.println(m.getKey());
            System.out.println( m.getValue());

        }

    }

}
