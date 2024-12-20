public class Book {
    private String title;
    private int yearOfPublication;
    private String author;
    private String iSBM;


    Book(String title, int yearOfPublication, String author, String iSBM){
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.iSBM =iSBM;
        if (iSBM.length() != 13){
            throw new IllegalArgumentException("ISBM has to be 13 characters long");
        }
    }
    @Override
    public String toString(){
        return String.format("title:%s\nYear of Publication:%d\nAuthor:%s\nISBM:%s\n",title,yearOfPublication,author,iSBM );
    }
    public String getTitle(){
        return title;
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBM(){
        return iSBM;
    }

}
