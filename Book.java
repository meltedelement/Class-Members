public class Book {
    String title;
    int yearOfPublication;
    String isbn;
    String author;

    public Book(String title, int yearOfPublication, String isbn, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.isbn = isbn;
        this.author = author;

        // throwing an error if isbn is invalid
        if (isbn.length() != 13) {
            try {
                throw new Exception("ISBN should be 13 characters long.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Year of Publication: " + yearOfPublication + ", ISBN: " + isbn + ", Author: " + author;
    }
}

class PrintBook extends Book {
    String publisher;
    int numberOfPages;

    public PrintBook(String title, int yearOfPublication, String isbn, String author, String publisher, int numberOfPages) {
        super(title, yearOfPublication, isbn, author);
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;

        // throwing an error of numberOfPages is invalid
        if (numberOfPages >= 500) {
            try {
                throw new Exception("Number of pages should be a number and less than 500.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Publisher: " + publisher + ", Number of pages: " + numberOfPages;
    }
}

class AudioBook extends Book {
    double bookSize;
    double playLength;
    String artistName;

    public AudioBook(String title, int yearOfPublication, String isbn, String author, double bookSize, double playLength, String artistName) {
        super(title, yearOfPublication, isbn, author);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.artistName = artistName;

        // throwing an error for invalid play length
        if (playLength >= 2) {
            try {
                throw new Exception("Play length should be less than 2 hours");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Book size: " + bookSize + "MB, Play length: " + playLength +  " hours, Playback artist's name: " + artistName;
    }
}

class testBook {
    public static void main(String[] args) {
        PrintBook atomicHabits = new PrintBook("Atomic Habits", 2015, "1324985634090", "James Clear", "Penguin", 300);
        AudioBook aTaleOfTwoCities = new AudioBook("A Tale of Two Cities", 1815, "8148923549840", "Charles Dickens", 1.5, 1.75, "Stephen Fry");

        System.out.println(atomicHabits.toString());
        System.out.println(aTaleOfTwoCities.toString());
    }
}