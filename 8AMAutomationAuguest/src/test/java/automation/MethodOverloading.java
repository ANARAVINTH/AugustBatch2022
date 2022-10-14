package automation;

public class MethodOverloading {

    public static void main(String[] args) {

        fillform("Aravinth",9655573,27);
        fillform("learn","more",445545, 36373,30);

    }


    public static void m1(int a){

        System.out.println(1+a);
    }

    public static void m1(String a){
        System.out.println(a);
    }

    public static void m1(int a, int b){
        System.out.println(a+b);
    }

    //int  , long , float 4.5678990 , double 1.234

    public static  void fillform(String firstName,long primaryMobile,int age ){

    }

    public static void fillform(String firstName,String lastname,long primaryMobile,long secondaryNumber,int age ){

    }





}
