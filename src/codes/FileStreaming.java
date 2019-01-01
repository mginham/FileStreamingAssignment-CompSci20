package codes;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileStreaming {

	public static void main(String[] args) throws Exception {

		// File Writing
		
		File outfile = new File("outfile.txt");
		
		PrintWriter output = new PrintWriter(outfile);
		
		output.println("Hello World");
		output.close();
		
		
		
		// File Reading
		
		File infile = new File("outfile.txt"); // opening a File object
		
		Scanner input = new Scanner(infile);
		String data = "";
		
		while(input.hasNext())
		{
			data = input.nextLine();
			System.out.println("The data was: " + data);
		}
		
	} // end main

}