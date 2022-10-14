package automation;

public class StaticExample {

    static int a =1 ;

    public static void main(String[] args) {
        System.out.println(a);

        StaticExample.m3();
        ScannerProgram s = new ScannerProgram();
        s.sampe();

        StaticExample f = new StaticExample();
        f.m2();

        StaticExample.m3();
    }

    public  void m2(){
        System.out.println(a);
        m3();
    }

    public static  void m3(){

    }

}
