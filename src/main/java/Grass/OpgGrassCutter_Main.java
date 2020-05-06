package Grass;

public class OpgGrassCutter_Main {
    public static double grassHeightNow;

    public static void main(String[] args) {
        OpgGrassCutter grassCutter = new OpgGrassCutter();

        grassHeightNow = grassCutter.userInput();
        grassCutter.whenToCutGrass(grassHeightNow, grassCutter.grassHeightToBeCut);
        grassCutter.display();
    }

}


//        Hvor tit skal græsset slås
//        Om sommeren vokser græsset ca. 0,8 cm om dagen.
//        Skriv en metode, der tager imod 2 inputparametre:
//        hvor langt græsset er lige nu og hvor højt det må være for at skulle slås.
//        Metoden skal beregne og returnere hvor mange dage der er til, at græsset skal slås næste gang.

//        Hvor højt græsset er, når det skal slås, kan forstås på 2 måder.
//        1. Græsset skal overstige denne værdi, før vi starter græsslåmaskinen
//        2. Græsset skal slås, inden værdien overstiges
//        3. Du vælger selv hvilken løsning du vil implementere.
//        Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen.
//        Alle tal, som bliver udskrevet, bør kun have 2 decimaler efter kommaet.