package Readers;

public class Main {

	public static void main(String[] args){
		Reader reader = new TextReader();
		System.out.println(reader.fileExists("input.txt"));
	}
	
}
