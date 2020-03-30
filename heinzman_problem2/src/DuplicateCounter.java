import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter 
{
	HashMap<String, Integer> counter = new HashMap<>();
	
	public void count(String dataFile)
	{
		Scanner scan = null;
		try 
		{
			scan = new Scanner(new File(dataFile));
			while (scan.hasNext())
			{
				String alternation = scan.next();
				alternation = alternation.toLowerCase();
				if(counter.containsKey(alternation))
				{
					counter.put(alternation, counter.get(alternation) + 1);
	            }
					else 
					{
	                   counter.put(alternation, 1);
					}
			}
			 scan.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Error reading from file: " +dataFile);
		}
	}
	
	public void write(String outputFile)
	{
		FileWriter output = null;
		try {
			output = new FileWriter(outputFile);
			for(Map.Entry<String, Integer> holder : counter.entrySet())
			{
				output.write(holder.getKey() + " " + holder.getValue());
		        output.write("\n");
			}
			output.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Error writing to file: " +outputFile);
		}
	}
}
