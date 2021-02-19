public class Journal extends Document {
    private int issueNumber;
    private int monthOfRelease;
    public Journal(){}

    public Journal(int documentCode, String publisherName, int issueNumber, int issueNumber1, int monthOfRelease) {
        super(documentCode, publisherName, issueNumber);
        this.issueNumber = issueNumber1;
        this.monthOfRelease = monthOfRelease;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthOfRelease() {
        return monthOfRelease;
    }

    public void setMonthOfRelease(int monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }

    @Override
    public String toString() {
        return "Journal{" +super.toString()+
                "issueNumber=" + issueNumber +
                ", monthOfRelease=" + monthOfRelease +
                '}';
    }
}
