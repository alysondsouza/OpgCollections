package Book;

import java.util.ArrayList;
import java.util.Collections;

public class OpgBook_Library {
    ArrayList<OpgBook_Books> allBooks = new ArrayList<OpgBook_Books>();

    public OpgBook_Books book1 = new OpgBook_Books(700000007 - 7, "Ulysses", 2010);
    public OpgBook_Books book2 = new OpgBook_Books(700000007 - 7, "Don Quixote", 2010);
    public OpgBook_Books book3 = new OpgBook_Books(769619194 - 2, "The Great Gatsby", 2009);
    public OpgBook_Books book4 = new OpgBook_Books(370777517 - 8, "One Hundred Years of Solitude", 2006);
    public OpgBook_Books book5 = new OpgBook_Books(832886510 - 6, "Moby Dick", 2001);
    public OpgBook_Books book6 = new OpgBook_Books(445459456 - 2, "War and Peace", 1999);
    public OpgBook_Books book7 = new OpgBook_Books(541880108 - 2, "Lolita", 2012);
    public OpgBook_Books book8 = new OpgBook_Books(359832965 - 2, "Hamlet", 2007);
    public OpgBook_Books book9 = new OpgBook_Books(320183151 - 4, "The Catcher in the Rye", 2009);
    public OpgBook_Books book10 = new OpgBook_Books(961799224 - 8, "Ulysses", 2010);

    public void addBooksToLibrary() {
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);
        allBooks.add(book6);
        allBooks.add(book7);
        allBooks.add(book8);
        allBooks.add(book9);
        allBooks.add(book10);
    }

    public void displayBooks() {
        opgBook_ComparatorByTitle compTitle = new opgBook_ComparatorByTitle();
        opgBook_ComparatorByYear compYear = new opgBook_ComparatorByYear();
        opgBook_ComparatorByISBN compISBN = new opgBook_ComparatorByISBN();

        //UNSORTED LIST
        System.out.println();
        System.out.println("Books listed by entry.");
        for (OpgBook_Books b : allBooks) {
            System.out.println(b);
        }
        System.out.println();

        //SORTED BY TITLE
        System.out.println("Books ordered by title:");
        Collections.sort(allBooks, compTitle);
        for (OpgBook_Books b : allBooks) {
            System.out.println(b);
        }
        System.out.println();

        //SORTED BY YEAR -(RECENT)
        System.out.println("Books ordered by recent year:");
        Collections.sort(allBooks, compYear);
        for (OpgBook_Books b : allBooks) {
            System.out.println(b);
        }
        System.out.println();

        //SORTED BY ISBN: CRESCENT
        System.out.println("Books ordered by recent year:");
        Collections.sort(allBooks, compISBN);
        for (OpgBook_Books b : allBooks) {
            System.out.println(b);
        }
        System.out.println();


    }

    //TODO
    public boolean checkISBN() {
        //FIND DUPLICATES
        System.out.println("Find Duplicates:");
        for (OpgBook_Books b : allBooks) {
            if (allBooks.contains(b.getIsbnNr())) {
                System.out.println("This book is already in the list:" + b);
            }
        }
        return true;
    }
}
