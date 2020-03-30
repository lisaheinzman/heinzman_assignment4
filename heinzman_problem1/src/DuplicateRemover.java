import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemover 
{
	Set<String> uniqueWords;
	
	void remove(String dataFile)
	{
		uniqueWords = new HashSet<>();
		Scanner scan = null;
		try 
		{
			scan = new Scanner(new File(dataFile));
			while(scan.hasNext()) 
			{
				String alternation = scan.next();
				alternation = alternation.toLowerCase();
				uniqueWords.add(alternation);
				
			}
			scan.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Error reading from file.");
		}
	}
	
	void write(String outputFile)
	{
		FileWriter output = null;
		try 
		{
			output = new FileWriter(outputFile);
			for(String holder : uniqueWords)
			{
				output.write(holder);
				output.write("\n");
			}
			output.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Error writing to file.");
		}
	}
}
