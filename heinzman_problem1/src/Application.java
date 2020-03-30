
public class Application
{
	public static void main(String[] args)
	{
		DuplicateRemover duplicateRemoverInstance = new DuplicateRemover();
		duplicateRemoverInstance.remove("problem1.txt");
		duplicateRemoverInstance.write("unique_words.txt");
	}
}
