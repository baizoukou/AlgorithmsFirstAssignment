package algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BruteAutoComplete implements AutoComplete{

	//public double weight = 0;
	private List<Term> term;
	//private int bestMatches;
	public Object prefix;
	private int bestMatches;

	public BruteAutoComplete(TermList list) {
		// TODO Auto-generated constructor stub
	}

	public Iterable<String> matches(String prefix, int k)
	{
	List <Term> filtered = new ArrayList<Term>();
	    	for (Term t: term)
	    	{
	    	if (((Term) term).getWord().startsWith(prefix)){
	             filtered.add((Term) term);
	    	}
	    	return null;
	}

	public double weightOf(String term, int bestmatch, double weightOf) 
	{
		 return weightOf;
		         
		    	}
	
	public String bestMatch(String prefix) 
	{
		 
		         
		    return prefix;
		}

	@Override
	public double weightOf(String term) {
		// TODO Auto-generated method stub
		return 0;

	
}


