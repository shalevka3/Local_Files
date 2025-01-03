import java.util.Scanner;

public class CalculatorLogicButBetter {
    double num1;
    double num2;
    double res;
    String tmp;
    Scanner sc = new Scanner(System.in);

    public double Hiluk() {
        res = (num1) / (num2);
        return (res);
    }

    public double Kefel() {
        res = (num1) * (num2);
        return (res);
    }

    public double Veod() {
        res = (num1) + (num2);
        return (res);
    }

    public double Pahot() {
        res = (num1) - (num2);
        return (res);
    }

    public void MotherOfFunc() {
        System.out.println("Select Your First Number:");
        num1 = sc.nextDouble();
        System.out.println("Select Your Second Number:");
        num2 = sc.nextDouble();
        System.out.println("What you want to do?::");
        tmp = sc.next();
        switch (tmp) {
            case "/":
                Hiluk();
                break;
            case "*":
                Kefel();
                break;
            case "+":
                Veod();
                break;
            case "-":
                Pahot();
                break;
            default:
                System.out.println("PLS enter an action:");
                while (tmp == "-"||tmp == "+"||tmp == "/"||tmp == "*");


        }
        System.out.println("Your result is:" + res);

    }
}
