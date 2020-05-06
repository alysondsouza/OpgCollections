package Book;

public class OpgBook_Main {

    public static void main(String[] args) {
        OpgBook_Library library = new OpgBook_Library();

        library.addBooksToLibrary();
        library.displayBooks();
        library.checkISBN();
    }
}


//        Bog
//        Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.
//        Skriv flg. metoder:
//        -Konstruktør metode
//        -Get og set metoder
//        -toString metode
//        -Skriv en equals metode baseret på ISBN
//        Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.
//        -Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter, og returnerer true, hvis listen indeholder et Bog objekt med samme ISBN.