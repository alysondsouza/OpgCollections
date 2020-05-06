package Søgning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OpgSearch_contains {

    public static String str1 = "Coffee";
    public static String str2 = "Water";
    public static ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Wine", "Coffee", "Juice", "Milkshake"));

    public static void main(String[] args) {

        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println();

        //SEARCH IN THE ARRAY_LIST: contains()
        System.out.println("ArrayList Search:");
        boolean contains1 = arrayList.contains(str1);
        System.out.println("arrList.contains(\""+ str1 +"\"): " + contains1);
        System.out.println();

        //SEARCH IN THE ARRAY_LIST: contains()
        System.out.println("ArrayList Search:");
        boolean contains2 = arrayList.contains("str2");
        System.out.println("arrList.contains(\""+ str2 + "\"): " + contains2);
        System.out.println();

        //BINARY_SEARCH
        System.out.println("Binary Search For " + str1 + ": binarySearch()");
        int binarySearch1 = Collections.binarySearch(arrayList, str1);
        System.out.println(str1 + " is at index [" + binarySearch1 + "]");
        System.out.println();

        //BINARY_SEARCH
        System.out.println("Binary Search For " + str2 + ": binarySearch()");
        int binarySearch2 = Collections.binarySearch(arrayList, str2);
        System.out.println(str2 + " is at index [" + binarySearch2 + "]");
        System.out.println();

    }
}


//        Søgning
//        Skriv en metode, der som parametre modtager et array af typen String samt en String.
//        Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen, hvis strengen findes i arrayet og –1 hvis strengen ikke findes i arrayet.
//        Lav en alternativ fejlhåndtering, hvis strengen ikke findes i arrayet, hvor du i stedet kaster en exception.