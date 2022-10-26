package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public abstract BookMetadataFormatter createFormatter();

    public void export(PrintStream stream) {
		BookMetadataFormatter exporter = createFormatter();
		if (exporter != null) {
			for (Book b : books) {
				exporter.append(b);
			}
			stream.println(exporter.getMetadataString());
		}
	}
    
}