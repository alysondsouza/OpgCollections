package Menu;

import java.util.Scanner;

public class OpgMenu {

    public static void main(String[] args) {
        getMenu();
    }

    private static void getMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n##########  Menu  ##########");
        System.out.print("Press 1: Calculate.\n" +
                "Press 2: Print.\n" +
                "Press 3: Help.\n\n"+
                "Enter your option: ");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.println("There is no data in the system.");
                getMenu();
                break;
            case 2:
                System.out.println("There in nothing in the printer.");
                getMenu();
                break;
            case 3:
                System.out.println("Call your Mamma!");
                getMenu();
                break;
            default:
                getMenu();
                break;

                //TODO catch InputMismatchException
        }

    }
}


//        Menuvalg
//        Skriv en metode, som præsenterer brugeren for følgende menu på skærmen:
//        1. Beregn
//        2. Udskriv
//        3. Hjælp
//        Metoden skal:
//        -udskrive menuen på skærmen
//        -læse brugerens valg (fra tastaturet)
//        -returnere menuvalget som et heltal
//        -Inddrag fejlhåndtering i din løsning (hvordan vil du håndtere et forkert menuvalg)