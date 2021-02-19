import java.util.Scanner;

public class Menus {
    static Scanner scanner=new Scanner(System.in);
    public static Document getDocumentInfo(){
        System.out.println("---------------------------");
        System.out.println("Mã tài liệu: ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Tên nhà xuất bản: ");
        String publisherName=scanner.nextLine();
        System.out.println("Số phát hành: ");
        int ReleaseNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("Chọn loại tài liệu: ");
        System.out.println("1.Book");
        System.out.println("2.Journal");
        System.out.println("3.Newspaper");
        int choice=Integer.parseInt(scanner.nextLine());
        if (choice==1) {
            System.out.println("Tên tác giả:");
            String TheWriterName = scanner.nextLine();
            System.out.println("Số trang: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            Book book=new Book(id,publisherName,ReleaseNumber,TheWriterName,numberOfPages);
            return book;
        }else if (choice==2) {
            System.out.println("Số phát hành:");
            int issueNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Tháng phát hành: ");
            int monthOfRelease = Integer.parseInt(scanner.nextLine());
            Journal journal=new Journal();
            return journal;
        }else if (choice==3){
                System.out.println("ngày phát hành: ");
                int releaseDate=Integer.parseInt(scanner.nextLine());
           Newspaper newspaper=new Newspaper();
           return newspaper;
        }else
            System.out.println("try again!");
        return null;
    }
}
