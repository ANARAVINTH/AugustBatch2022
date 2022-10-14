package automation;

import java.util.Scanner;

public class ScannerProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
       int firstNumber= scanner.nextInt();
        System.out.println("Enter second number");
       int secondNumber = scanner.nextInt();
        System.out.println("Enter operator");
       String operater =scanner.next();

       switch (operater){

           case "+":
              int out= firstNumber + secondNumber ;
              break;
           case "-" :
               break;
           case "*" :
               break;
           default:
       }

    }

    public  void sampe(){

    }
}
