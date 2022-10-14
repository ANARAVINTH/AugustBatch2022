package automation;

public class StringBasics {


    public static void main(String[] args) {

        String s = "learn";
        System.out.println(s.length());
        String h="Learn";
        s.toUpperCase();
        s.toLowerCase();
        s.equals(h);  //exact match
        s.equalsIgnoreCase(h);
        s.contains("ear");
        String i ="Hellohowareyou"; //0,1...
        System.out.println(i.substring(5,8));

        String userName = i.substring(5,8);

        i.replace('H','W');

        String g = "         more         "; // 0,1,2,3,

        System.out.println(s.concat(g));

        System.out.println(g.charAt(1));
        System.out.println(g.trim());

        String value ="123";

       int u= Integer.parseInt(value);

       String val =  "123.12";

       Float.parseFloat(val);

    }
}
