public class Newspaper extends Document {
    private String releaseDate;
    public Newspaper(){}
    public Newspaper(int id, String publisherName, int ReleaseNumber, String releaseDate) {
        super(id, publisherName, ReleaseNumber);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +super.toString()+
                "releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
