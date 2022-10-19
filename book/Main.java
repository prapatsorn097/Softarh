import java.util.*;

public class Main {
	public static void main(String[] args) {
        String[] array={"I", "moved", "here", "recently", "too"}; 
        List<String> list = Arrays.asList(array); 
		Book book = new Book("Tyland", list);
		    
		BookPrinter bookPrinter = new BookPrinter(book);
		
		BookPublisher publisher = new BookPublisher(bookPrinter);
		publisher.printToFile();
		
		BookReader reader = new BookReader(bookPrinter);
		reader.printToScreen();
	}
}