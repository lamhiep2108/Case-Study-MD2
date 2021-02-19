public class Document {
    private int id;
    private String publisherName;
    private int ReleaseNumber;
    public Document(){}
    public Document(int documentCode, String publisherName, int issueNumber) {
        this.id = documentCode;
        this.publisherName = publisherName;
        this.ReleaseNumber = issueNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getReleaseNumber() {
        return ReleaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.ReleaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", ReleaseNumber=" + ReleaseNumber +
                '}';
    }
}
