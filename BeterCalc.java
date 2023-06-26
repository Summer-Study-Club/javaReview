import java.util.Scanner;

public class BeterCalc {
    //TODO: class variable for two operands and resulting value
    double num1;
    double num2;
    double result;

    //TODO: Constructor for BetterCalc
    //initializes
    public BeterCalc(double n1, double n2){
        num1 = n1;
        num2 = n2;
        result = 0.0;
    }

    //TODO: methods for adding, subtracting, multiply, and divide, and say hi

    public double add (){
        return  num1 + num2;
    }
    public double subtract (){
        return num1 - num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
        return num1 / num2;
    }
    public void printResult(double res){
        result = res;
        System.out.println(result);
    }
    public static void main (String [] args){
        //TODO: Scanner for user input
        Scanner in = new Scanner(System.in);

        //TODO: Ask user for two operands
        System.out.print("Please enter a number: ");

        double number1 = in.nextDouble();
        System.out.print("Please enter a number: ");
        double number2 = in.nextDouble();
        System.out.print("Please enter a number: ");
        double number3 = in.nextDouble();
        System.out.print("Please enter a number: ");
        double number4 = in.nextDouble();

        //TODO: create calculator object
        BeterCalc calc = new BeterCalc(number1, number2);

        BeterCalc calc2 = new BeterCalc(number3, number4);

        System.out.print(calc.num1 + " and " + calc.num2);

        calc.add();

        calc2.add();

        //BetterCalc has to match the constructor in the class above to the object
        //user input will match and go into constructor in the class
    }
}
