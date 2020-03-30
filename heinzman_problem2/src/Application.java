
public class Application {

	public static void main(String[] args)
	{
		DuplicateCounter duplicateCounterInstance = new DuplicateCounter();
		duplicateCounterInstance.count("problem2.txt");
		duplicateCounterInstance.write("unique_word_counts.txt");

	}

}
