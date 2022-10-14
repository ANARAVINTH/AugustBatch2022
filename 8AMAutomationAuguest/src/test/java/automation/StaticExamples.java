package automation;

public class StaticExamples {

    //we cant use non static to the static
    //non static --> Static data as well as non static data
    int a=1; //global
    static String v= "xyz";

    public static void main(String[] args) {

        System.out.println(v);
        m1();
        StaticExamples h = new StaticExamples();
        h.m2();
        SampleClass.hhh();
        SampleClass u = new SampleClass();
        u.jjj();

    }


    private  static void m1(){
        System.out.println("m1");
    }

    private void m2(){
        System.out.println("m2");
        System.out.println(a);
        System.out.println(v);
    }
}
