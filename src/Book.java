public class Book extends Document {
    private String TheWriterName;
    private int numberOfPages;
    public Book(){}
    public Book(int id, String publisherName, int ReleaseNumber, String theWriterName, int numberOfPages) {
        super(id, publisherName, ReleaseNumber);
        TheWriterName = theWriterName;
        this.numberOfPages = numberOfPages;

    }

    public String getTheWriterName() {
        return TheWriterName;
    }

    public void setTheWriterName(String theWriterName) {
        TheWriterName = theWriterName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString()+
                "TheWriterName='" + TheWriterName + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
