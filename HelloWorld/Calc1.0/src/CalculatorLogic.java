import java.util.Scanner;

import static java.lang.System.exit;

public class CalculatorLogic {
    double num1;
    double num2;
    double res;
    String tmp;
    Scanner sc = new Scanner(System.in);
    public void Kefel (){
        System.out.println("your First Num is:");
        num1 = sc.nextInt();
        System.out.println("your Second Num is:");
        num2 = sc.nextInt();
        res = (num1)*(num2);
        System.out.println("Your Res is: " + res);
    }
    public void Hiluk(){
        System.out.println("your First Num is:");
        num1 = sc.nextInt();
        System.out.println("your Second Num is:");
        num2 = sc.nextInt();
        res = (num1) / (num2);
        System.out.println("Your Res is :" + res);
    }
    public void MatherOfFunc(){
        do {

        System.out.print("\nwhat do you wanna do?\n" + "1 - kefel\n" + "2 - Hiluk\n" +"3 - Exit\n" + "-");
        tmp = sc.next();
            System.out.println("\n");
        switch (tmp){
            case "1":
                Kefel();
                break;
            case "2":
                Hiluk();
                break;
            case "3":
                System.out.println("GoodBy(:");
                exit(1);
            default:
                System.out.println("PLS enter a number between 1-2");
        }
      }while (tmp != "1"|| tmp != "2");
    }
}
