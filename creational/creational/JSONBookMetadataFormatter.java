package creational;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    List<Map<String, Object>> jA = new ArrayList<Map<String, Object>>();

    @Override
    public BookMetadataFormatter reset() {
        jA = new ArrayList<Map<String, Object>>();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        HashMap<String, Object> jBook = new HashMap<String, Object>(); 
        StringBuffer Author = new StringBuffer();
        jBook.put("Book ID", b.getISBN());
        jBook.put("Title", b.getTitle());
        jBook.put("Publisher", b.getPublisher());
        for(int i = 0; i < b.getAuthors().length; i++){
            Author.append(b.getAuthors()[i]);
            if(i != b.getAuthors().length - 1){
                Author.append(",");
            }
        }
        jBook.put("Author", Author);
        jA.add(jBook);
        return this;
    }

    @Override
    public String getMetadataString() {
        return jA.toString();
    }
}