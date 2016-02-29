package ie.Spellchecker;

public class Match
{
	public float ed;
	public String word;
	
	Match(String word, float ed)
	{
		this.ed = ed;
		this.word = word;
	}
	
	public int compareTo(Object m)
	{
		return (int) (ed - ((Match) m).ed);
	}
}
