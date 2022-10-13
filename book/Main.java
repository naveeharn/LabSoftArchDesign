package book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        // book.printToFile();

        BookPrintHandler bookPrintHandler = new BookPrintHandler(book);

        BookReader reader = new BookReader(bookPrintHandler);
        reader.printToScreen();
        
        BookPublisher publisher = new BookPublisher(bookPrintHandler);
        publisher.printToFile();

    }
}
