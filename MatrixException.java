package ie.Spellchecker;

public class MatrixException extends Exception
{
	private String message;
	
	public String getMessage()
	{
		return message;
	}

	public MatrixException(String message)
	{
		this.message = message;
	}
}