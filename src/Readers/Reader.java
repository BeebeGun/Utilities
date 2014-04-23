package Readers;
import java.io.*;

public abstract class Reader {

	/**
	 * Checks if the given file exists.  The filename must include a file path
	 * @param filename Filename of the file in question
	 * @return true if the file exists and false otherwise
	 */
	public boolean fileExists(String fileName) {
		return (new File(fileName)).isFile();
	}
	
	abstract void iterator (BufferedReader reader);

}
