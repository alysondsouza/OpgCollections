package Book;

import java.util.Comparator;


public class opgBook_ComparatorByISBN implements Comparator<OpgBook_Books> {


    @Override
    public int compare(OpgBook_Books b1, OpgBook_Books b2) {
        if (b1.getIsbnNr() < b2.getIsbnNr()){
            return -1;
        } else if (b1.getIsbnNr() > b2.getIsbnNr()){
            return 1;
        } else {
            return 0;
        }
    }
}
