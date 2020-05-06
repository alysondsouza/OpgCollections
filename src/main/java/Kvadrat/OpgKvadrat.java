package Kvadrat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpgKvadrat {

    public static Scanner scan = new Scanner(System.in);
    public static int x;
    public static char c;

    public static void main(String[] args) {

        x = getSize();
        c = getChar();
        kvadrat(x, c);
    }

    public static int getSize() {
        System.out.print("Enter the size of your Kvadrat: ");
        try {
            x = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("That's not a number.");

            // TODO catch InputMismatchException
            x = scan.nextInt();
        }

        validateSize(x);
        return x;
    }

    private static char getChar() {
        System.out.print("Enter the character you want to make the pattern with: ");
        scan.nextLine();//bug
        String ch = scan.nextLine();
        char c = ch.charAt(0);

        // TODO catch StringIndexOutOfBoundsException
        return c;
    }

    public static void kvadrat(int size, char c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(c + "  ");
            }
            System.out.println();
        }
    }

    public static void validateSize(int x) {
        if (x < 2) {
            System.out.println("You can't build your kvadrant in that size.\nEnter a number between 0 and 50.\n");
        } else if (x > 50) {
            System.out.println("That's too big. It won't fit your screen.\nEnter a number between 0 and 50.\n");
        }

        while (x < 2 || x > 50) {
            getSize();
        }
    }

}


//        Kvadrat
//        Skriv en metode, der som parameter modtager et heltal. Metoden skal udskrive et kvadrat på skærmen svarende til heltallet.
//        I det følgende eksempel er tallet 6 modtaget som parameter til metoden:
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        -Udvid metoden, så den også modtager et tegn, som er det tegn, som printes på skærmen
//        -Inddrag fejlhåndtering i din løsning (hvordan vil du håndtere et negativt heltal eller et meget stort heltal som ikke kan printes på én linje)