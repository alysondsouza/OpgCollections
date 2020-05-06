package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class OpgArrayList {

    public static ArrayList<String> stringArrayList = new ArrayList<String>();
    public static String str1 = "Dog", str2 = "Cat", str3 = "Dog", str4 = "Ant", str5 = "";


    public static void main(String[] args) {
        checkVarOnArray();
    }

    public static void checkVarOnArray() {
        System.out.println("Insert variables into the ArrayList:");
        insertString(stringArrayList, str1);
        insertString(stringArrayList, str2);
        insertString(stringArrayList, str3);
        insertString(stringArrayList, str4);
        insertString(stringArrayList, str5);
        System.out.println();
    }

    public static boolean insertString(ArrayList<String> arrList, String str) throws IllegalArgumentException {
        Boolean notInTheList = null;
        Boolean arrlistContainsStr = arrList.contains(str);// true if the 'str' is on the 'arrList'

        if (!arrlistContainsStr && str != null) {
            arrList.add(str);

            Collections.sort(arrList);//order by alphabetical order

            System.out.println(stringArrayList.toString());

            notInTheList = true;

        //EMPTY STRING
        } else if (str.isEmpty()) {
            System.out.println("You can't add an empty string to the ArrayList");

        } else if (arrlistContainsStr) {
            System.out.println("\'" + str + "\' already exists in the ArrayList. ");
            notInTheList = false;

        } else {
            throw new IllegalArgumentException("Invalid entry.");
        }
        return notInTheList;
    }
}


//ArrayList
//Skriv en metode, der modtager 2 parametre: en arrayliste og en streng.
//Metoden skal gøre følgende:
//-Indsætte strengen i arraylisten, hvis den ikke findes i listen i forvejen. Ellers gøres ingenting med streng og arrayliste.
//-returnere værdien true, hvis strengen er blevet indsat i arraylisten. Ellers false.
//-Inddrag fejlhåndtering i din løsning, således at null værdier undgås i arraylisten
//-Hold listen sorteret.