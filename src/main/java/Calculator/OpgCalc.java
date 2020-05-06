package Calculator;

import java.util.Scanner;

public class OpgCalc {

    public static double x, y, result;
    public static String operator;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        userInput();
        calc(operator);
    }

    private static void userInput() {
        System.out.println("Enter the first number: ");
        x = scan.nextInt();
        //TODO
        if (x < 1 || x > 50) {
            throw new IllegalArgumentException("\nNot a valid number.\nEnter a number from 0-50.\n");
        }
        scan.nextLine();//bug
        getOperator();

        System.out.println("Enter the second number: ");
        y = scan.nextInt();
        if (y < 1 || x > 50) {
            throw new IllegalArgumentException("\nNot a valid number.\nEnter a number from 0-50. \n");
        }
    }

    private static void getOperator() {
        System.out.println("Enter the the operation: + - * / ");
        operator = scan.nextLine();
        while (!operator.equals("+")&&!operator.equals("-")&&!operator.equals("*")&&!operator.equals("/")){
            getOperator();
        }
    }
                private static void calc (String op){

                    switch (op) {
                        case "+":
                            result = x + y;
                            break;
                        case "-":
                            result = x - y;
                            break;
                        case "*":
                            result = x * y;
                            break;
                        case "/":
                            result = x / y;
                            break;
                    }
                    System.out.printf("Result: %.2f", result);
                }

            }


//        Regning
//        Skriv en metode der modtager to heltal som parametre. Såfremt begge tal ligger i intervallet 1-50 (begge tal inklusive) skal metoden foretage følgende regneoperationer på tallene:
//        -Addition
//        -Subtraktion
//        -Division
//        -Multiplikation
//        og efterfølgende udskrive resultatet af operationerne på skærmen.
//        -Såfremt et af tallene eller begge tal ikke opfylder betingelsen om at ligge i intervallet 1-50, skal metoden kaste en IllegalArgumentException.