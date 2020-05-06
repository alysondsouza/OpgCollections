package Sortering;

import java.util.*;

public class OpgOrder {
    public static void main(String[] args) {

        //ALTERNATIVE 1
        Stack<String> stack = new Stack<String>();

        stack.push("abekat");
        System.out.println(stack.peek());
        stack.push("musefælde");
        System.out.println(stack.peek());
        stack.push("ananas");
        System.out.println(stack.peek());
        stack.push("slut");
        System.out.println(stack.peek());
        stack.push("solskin");
        System.out.println(stack.peek());

        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();


        //ALTERNATIVE 2 - LIST_ITERATOR
        ArrayList<String> arrListWords = new ArrayList<String>(Arrays.asList("Abekat", "Musefælde", "Ananas", "Slut", "Solskin"));

        System.out.println("Transversing ArrayList forward and backwards with: listIterator()");
        ListIterator<String> listIterator = arrListWords.listIterator();

        //FORWARD
        System.out.println("-->Forward");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();

        //BACKWARDS  (Works though only if 'forward' is there (?) )
        System.out.println("<--backwards");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println();

    }


}


//        Sortering
//        Skriv en metode, der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetisk faldende orden på skærmen.
//
//        Hvis der indlæses:
//        abekat
//        musefælde
//        ananas
//        slut
//        solskin
//
//        skal der udskrives følgende på skærmen:
//        solskin
//        slut
//        musefælde
//        ananas
//        abekat