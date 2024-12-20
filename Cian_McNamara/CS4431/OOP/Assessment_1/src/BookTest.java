public class BookTest {
    public static void main(String[] args) {
        // Book Variables
        String title = "Gregs Adventures";
        int yearOfPublication = 2019;
        String isbn = "1111111111111";
        String author = "Greg";

        // AudioBook Variables
        int playBackLength = 60 * 92 + 4;

        // PrintBook Variables
        int pageCount = 499;

        Book book = new Book(title, yearOfPublication, isbn, author);
        AudioBook audioBook = new AudioBook(title, yearOfPublication, isbn, author, playBackLength);
        PrintBook printBook = new PrintBook(title, yearOfPublication, isbn, author, pageCount);

        System.out.println(book + "\n");
        System.out.println(audioBook + "\n");
        System.out.println(printBook + "\n");
    }
}
