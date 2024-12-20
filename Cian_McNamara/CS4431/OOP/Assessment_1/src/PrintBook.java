public class PrintBook extends Book {
    private int numberOfPages;

    public PrintBook(String title, int yearOfPublication, String isbn, String author, int numberOfPages) {
        super(title, yearOfPublication, isbn, author);
        setNumberOfPages(numberOfPages);
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages < 500 && numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        } else {
            throw new RuntimeException("Invalid page count.");
        }
    }

    @Override
    public String toString() {
        String output = super.toString() + "\nNumber of pages: " + getNumberOfPages();
        return output;
    }
}
