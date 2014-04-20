package Readers;
import java.io.*;

public class TextReader extends Reader {

	public TextReader(String fileName) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			iterator(reader);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public TextReader() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			iterator(reader);
		}

		catch (Exception e){
			System.out.println(e.toString());
        }
	}

	public void iterator(BufferedReader reader) {
		try {
			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}