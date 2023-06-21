import java.util.Scanner; //import scanner class

public class Calculator {
    public static void main (String [] args){

        //Create a scanner object that intakes user input
        Scanner userInput = new Scanner (System.in);

        double firstNum; //create variable for input numbers
        double secondNum;
        double answer;  //create variable for output number

        System.out.print ("Please enter the first number: ");
        firstNum = userInput.nextDouble(); //assigns user input to firstNum

        System.out.print ("Please enter the second number: ");
        secondNum = userInput.nextDouble(); //assigns user input to secondNum
        userInput.nextLine();
        // nextDouble does not take a carriage return into account
        // takes away "Enter" from previous user input.
        // Skipped operation input away because it thinks the "enter" was the input for operation


        System.out.print("What operation would you like?: Enter the symbol (+, -, *, /) : ");
        String userChoice = userInput.nextLine(); //takes user input for operation symbol

        if (userChoice.equals("+"))
        {
            answer = firstNum + secondNum;
            System.out.println("answer is: " + answer);
        }
        else if (userChoice.equals("-"))
        {
            answer = firstNum - secondNum;
            System.out.println("answer is: " + answer);
        }
        else if (userChoice.equals("*"))
        {
            answer = firstNum * secondNum;
            System.out.println("answer is: " + answer);
        }
        else if (userChoice.equals("/"))
        {
            answer = firstNum / secondNum;
            System.out.println("answer is: " + answer);
        }
        else
        {
            System.out.println("Invalid operation. :( ");
            }

        }
    }
