package book;

public class BookPublisher implements IBookPublisher {

    private BookPrintHandler bookPrintHandler;
    public BookPublisher(BookPrintHandler bookPrintHandler) {
        this.bookPrintHandler = bookPrintHandler;
    }

    @Override
    public void printToFile() {
        // TODO Auto-generated method stub
        bookPrintHandler.printToFile();
    }
    
    // public static void main(String[] args) {
    //     Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
    //     // book.printToFile();
    //     
    // }
}
