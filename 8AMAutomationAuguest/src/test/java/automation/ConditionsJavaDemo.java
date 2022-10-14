package automation;

public class ConditionsJavaDemo {


    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        if(a<b){

           int out= (a+b)*2 ;

            System.out.println(out);
        }
        else if (a == b){

            System.out.println(a);
        }

        else{

            int out= (a+b)*3 ;

            System.out.println(out);
        }



    }
}
