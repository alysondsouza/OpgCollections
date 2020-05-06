package ProperCase;

public class OpgCase {

    public static String phrase0 = null;
    public static String phrase1 = "";
    public static String phrase2 = "capitan NEmO eR ULTRA POP";
    public static String[] arr;

    public static void main(String[] args) {
        splitPhrase(phrase0);
        splitPhrase(phrase1);
        splitPhrase(phrase2);
    }

    public static boolean checkNullEmpty(String phrase) {
        if (phrase == null || phrase == "" || phrase == " ") {
            return true;
        }
        return false;
    }

    public static void splitPhrase(String phrase) {

        boolean checkNull = checkNullEmpty(phrase);
        if (checkNull) {
            System.out.println("There is nothing written");
        } else {
            //PRINT PHRASE
            System.out.println(phrase + "\n");


            //SLIPT PHRASE INTO WORDS
            arr = phrase.split(" ");
            for (String s : arr) {
                System.out.println(s);
            }
            System.out.println();


            allCaps();
            lessThan3();
            moreThan3();
        }
    }

    // TODO //        -Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
    public static void allCaps() {
        System.out.println("TO-DO: ALL CAPS");
        for (String s : arr) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 65 && c <= 90) {
                    System.out.println("ALL CAPS ONLY: " + s);
                }
            }
        }
        System.out.println();
    }

    public static void lessThan3() {
        System.out.println();
        for (String s : arr) {
            if (s.length() < 4) {
                System.out.println(s.toLowerCase());
            }
        }
        System.out.println();
    }

    public static void moreThan3() {
        System.out.println();
        for (String s : arr) {
            if (s.length() > 3) {
                char fl = s.charAt(0);
                String firstLetter = String.valueOf(fl);
                System.out.print(firstLetter.toUpperCase());

                String lastLetter = s.substring(1);
                System.out.println(lastLetter.toLowerCase());
            }
        }
        System.out.println();
    }

}


//        Proper case
//        Skriv en metode, der tager imod en sætning af ord med blanktegn imellem. Sætningen ændres efter følgende regler:
//        -Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
//        -Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
//        -Ord på max. 3 bogstaver skal skrives med småt.
//        Metoden skal returnere den ændrede sætning.
//        -Inddrag fejlhåndtering (Hvordan vil du f.eks. håndtere en null-string som input?)