public class Book {
    protected String title;
    protected int yearOfPublication;
    protected String isbn;
    protected String author;

    public Book(String title, int yearOfPublication, String isbn, String author) {
        setTitle(title);
        setYearOfPublication(yearOfPublication);
        setIsbn(isbn);
        setAuthor(author);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn.length() == 13) {
            this.isbn = isbn;
        } else {
            throw new RuntimeException("ISBN Length " + isbn.length() + " expected length of 13.");
        }
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String output = String.format("Title: %s%nYear of Publication: %d%nISBN: %s%nAuthor: %s",
                this.title, this.yearOfPublication, this.isbn, this.author);
        return output;
    }
}
