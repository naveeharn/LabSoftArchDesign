package book;

import java.util.List;

public class BookReader implements IBookReader {
    private BookPrintHandler bookPrintHandler;

    public BookReader(BookPrintHandler bookPrintHandler) {
        this.bookPrintHandler = bookPrintHandler;
    }

    @Override
    public void printToScreen() {
        bookPrintHandler.printToScreen();
    }
    // public static void main(String[] args) {
    // Book book = new Book("Tyland", List.of("I", "moved", "here", "recently",
    // "too"));
    // // book.printToScreen();
    // BookPrintHandler bookPrintHandler = new BookPrintHandler(book);

    // }
}
