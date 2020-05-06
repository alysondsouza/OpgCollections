package Book;

public class OpgBook_Books {

    int isbnNr, year;
    String title;

    public OpgBook_Books(int isbnNr, String title, int year) {
        this.isbnNr = isbnNr;
        this.title = title;
        this.year = year;
    }

    public int getIsbnNr() {
        return isbnNr;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book isbnNr: " + isbnNr + ", year" + year + ", title='" + title;
    }

}


