package algorithms;

public class Term 
{
	
	String word;
	public String getWord() {
		return word;
	}

	public double getWeightOf() {
		return weightOf;
	}

	double weightOf;
	
	public Term (double weightOf, String word)
	{
		this.word = word;
		this.weightOf = weightOf;
	}

}
