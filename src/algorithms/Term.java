package algorithms;

public class Term implements Comparable<Term>
{
	
	String word;
	public String getWord() {
		return word;
	}

	public double getWeightOf() {
		return  weightOf;
	}

	double weightOf;// had issue here when putting weightOf as static 
	
	public Term (double weightOf, String word)
	{
		this.word = word;
		this.weightOf = weightOf;
	}

	@Override
	public int compareTo(Term t) {
		// TODO Auto-generated method stub
		return Double.compare(t.getWeightOf(), weightOf); // compare based on weight
	}

}
