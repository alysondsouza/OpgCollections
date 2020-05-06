package Søgning;

public class OpgSearch {

    public static String str1 = "Coffee";
    public static String str2 = "Water";
    public static String[] arr = {"Wine", "Coffee", "Juice", "Milkshake"};
    public static boolean notInArr;

    public static void main(String[] args) {
        displayArr();
        checkStrInArr(str1);
        checkStrInArr(str2);
    }

    public static void displayArr() {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static boolean checkStrInArr(String str) {
        notInArr = false;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                System.out.println("'" + str + "' is at the index [" + i + "] of your array.");
                notInArr = false;
                break;
            } else {
                notInArr = true;
            }
        }
        inTheArray(notInArr, str);
        return notInArr;
    }

    public static void inTheArray(boolean notInArr, String str) {
        if (notInArr) {
            System.out.println("'" + str + "' is not in your array.");
        }
    }

}


//        Søgning
//        Skriv en metode, der som parametre modtager et array af typen String samt en String.
//        Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen, hvis strengen findes i arrayet og –1 hvis strengen ikke findes i arrayet.
//        Lav en alternativ fejlhåndtering, hvis strengen ikke findes i arrayet, hvor du i stedet kaster en exception.