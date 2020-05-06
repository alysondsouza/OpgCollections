package Strenge;

public class OpgString {

    private static String str1 = "abstemiously";
    private static String str2 = "tragedious";
    private static char tegn1 = 'e';
    private static char tegn2 = 'u';

    public static void main(String[] args) {
        stringMixer(str1, str2, tegn1, tegn2);
    }

    public static void stringMixer(String str1, String str2, char tegn1, char tegn2) {
        System.out.println("word 1: " + str1);
        System.out.println("word 2: " + str2);

        System.out.println("\nSwapping Letters: '" + tegn1 + "' and '" + tegn2 + "'");
        String strAddUp = str1 + str2;
        System.out.println(strAddUp);

        String t1 = Character.toString(tegn1);
        String t2 = Character.toString(tegn2);
        String newStr = strAddUp.replaceAll(t1, t2);
        System.out.println(newStr);
    }

}


//        Strenge
//        Skriv en metode, der som parametre modtager to strenge og to tegn (typen char).

//        Metoden skal gøre følgende:
//        -sætte de to inputstrenge sammen
//        -udskifte alle tegn i den sammensatte streng, som matcher det første inputtegn med det andet inputtegn og returnere det nye strengindhold
//        -Inddrag fejlhåndtering (hvordan vil du fx håndtere en tom streng som input)