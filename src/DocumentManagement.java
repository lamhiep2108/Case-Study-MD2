import java.util.ArrayList;

public class DocumentManagement {
    ArrayList<Document>documents=new ArrayList<>();
    public void add(Document d){
        documents.add(d);
    }
    public void delete(int id){
        documents.removeIf(d -> d.getId() == id);
    }
    public Document search(int id){
        Document document=null;
        for (Document d:documents) {
            if (d.getId()==id){
                document=d;
            }
        } return document;
    }
        public ArrayList<Document> search(String typeOfDocument){
        ArrayList<Document> returnDocument=new ArrayList<>();
        String type=typeOfDocument;
        switch (type){
            case "book":
                for (Document d:documents) {
                    if (d instanceof Book){
                        returnDocument.add(d);
                    }
                }
                break;
            case "journal":
                for (Document d:documents) {
                    if (d instanceof Journal){
                        returnDocument.add(d);
                    }
                }
                break;
            case "newspaper":
                for (Document d:documents) {
                    if (d instanceof Newspaper){
                        returnDocument.add(d);
                    }
                }
                break;

        }return returnDocument;
        }
        public void showAllDocumentInfo(){
            for (Document d:documents) {
                System.out.println(d.toString());
            }
        }
        public void update(Book book){
            for (Document d:documents) {
                if (d instanceof Book){
                    if (d.getId()== book.getId()){
                        d.setPublisherName(book.getPublisherName());
                        d.setReleaseNumber(book.getReleaseNumber());
                        ((Book) d).setTheWriterName(book.getTheWriterName());
                        ((Book) d).setNumberOfPages(book.getNumberOfPages());
                    }
                }
            }
        }
    public void update(Journal journal){
        for (Document d:documents) {
            if (d instanceof Journal){
                if (d.getId()== journal.getId()){
                    d.setPublisherName(journal.getPublisherName());
                    d.setReleaseNumber(journal.getReleaseNumber());
                   ((Journal) d).setIssueNumber(journal.getIssueNumber());
                   ((Journal) d).setMonthOfRelease(journal.getMonthOfRelease());
                }
            }
        }
    }
    public void update(Newspaper newspaper){
        for (Document d:documents) {
            if (d instanceof Newspaper){
                if (d.getId()== newspaper.getId()){
                    d.setPublisherName(newspaper.getPublisherName());
                    d.setReleaseNumber(newspaper.getReleaseNumber());
                    ((Newspaper) d).setReleaseDate(newspaper.getReleaseDate());
                }
            }
        }
    }
}
