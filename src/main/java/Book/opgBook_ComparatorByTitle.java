package Book;

import java.util.Comparator;


public class opgBook_ComparatorByTitle implements Comparator<OpgBook_Books> {


    @Override
    public int compare(OpgBook_Books b1, OpgBook_Books b2) {

        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
    }
}
