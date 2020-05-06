package StortBogstav;

import java.util.ArrayList;

public class OpgUpperCase {

    public static ArrayList<String> arr = new ArrayList<String>();
    public static int count=0;

    public static void main(String[] args) {

        //TODO
        //     Skriv et lille program, der indlæser et antal tekststrenge fra tastaturet og stopper, når der trykkes på <retur>tasten (dvs. uden at brugeren har skrevet nogen tekst).
        //     Til sidste skal det udskrives på skærmen, hvor mange af de indlæste tekststrenge, som begyndte med et stort forbogstav (A-Z).

        arr.add("Der var en gang");
        arr.add("der var engang");
        arr.add("Engang var der");
        for (String s : arr) {
            System.out.println(s);
        }

        capitalLetter();
    }


    public static void capitalLetter() {
        System.out.println();
        for (String s : arr) {
            if (s.charAt(0) >= 65 && s.charAt(0) <= 90) {
                System.out.println(s);
                count++;
            }
        }
        System.out.println(count + " elements start with capital letter.");

    }
}


//        Stort bogstav
//        Skriv et lille program, der indlæser et antal tekststrenge fra tastaturet og stopper, når der trykkes på <retur>tasten (dvs. uden at brugeren har skrevet nogen tekst).
//        Til sidste skal det udskrives på skærmen, hvor mange af de indlæste tekststrenge, som begyndte med et stort forbogstav (A-Z).
//
//        Eksempel:
//        Der var en gang
//        der var engang
//        Engang var der
//
//        2 tekststrenge begyndte med stort forbogstav