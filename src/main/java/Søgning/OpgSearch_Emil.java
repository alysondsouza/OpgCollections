package Søgning;//@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)

public class OpgSearch_Emil {
    public static void main(String[] args) throws Exception {

        String[] array = new String[]{"hej", "abe", "mand"};
        System.out.println("Index: " + findStrengIArray(array, "abe"));
    }


    public static int findStrengIArray(String[] array, String ord) throws Exception {
        /* Fejlhåndtering start */
        if(ord.isEmpty()){
            throw new Exception("Strengen må ikke være tom!");
        }

        if(array == null){
            throw new Exception("Dit array må ikke være tomt!");
        }
        /*Fejlhåndtering slut */

        //Søgemetoden
        for(int i=0; i<array.length;i++){ //Loop gennem arrayets længde
            if(array[i].equals(ord)){ //Hvis ordet matcher
                return i; //returner index værdi
            }
        }
        throw new Exception("\"" + ord + "\" findes ikke i arrayet."); //Kast exception hvis ordet ikke findes.
    }

}
