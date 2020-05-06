package Book;

import java.util.Comparator;


public class opgBook_ComparatorByYear implements Comparator<OpgBook_Books> {


    @Override
    public int compare(OpgBook_Books b1, OpgBook_Books b2) {

        return -(b1.getYear() - b2.getYear()); // - inverts the order
    }
}
