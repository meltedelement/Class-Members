public class PrintBook extends Book{
    private String publisher;
    private int numberOfPages;

    PrintBook(String title, int yearOfPublication, String author, String iSBM, String publisher, int numberOfPages){
        super(title, yearOfPublication, author, iSBM);
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        if (numberOfPages >= 500){
            throw new IllegalArgumentException("Number of Pages should be less than 500");
        }
    }
    @Override
    public String toString(){
        return String.format("title:%s\nYear of Publication:%d\nAuthor:%s\nISBM:%s\nPublisher:%s\n No of Pages:%d\n"
                ,getTitle(), getYearOfPublication(), getAuthor(), getISBM(),publisher, numberOfPages );
    }
}

