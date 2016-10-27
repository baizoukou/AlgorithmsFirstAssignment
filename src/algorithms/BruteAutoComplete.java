package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BruteAutoComplete implements AutoComplete {

	// public double weight = 0;
	private List<Term> term;
	// private int bestMatches;
	public Object prefix;
	private int bestMatches;

	public BruteAutoComplete(List<Term> list) {
		// TODO Auto-generated constructor stub
		this.term = list;
	}

	public Iterable<String> matches(String prefix, int k)
	{
		
		List <String> filtered = new ArrayList<String>(); //filtered prefix from word enter and get the word from term class
		int matches=0;
		for (Term t: term  )
		{
			if (((Term) t).getWord().startsWith(prefix) && matches++ < k){// initialize counter to 0
				filtered.add( t.getWord());
				bestMatches ++;
			}

			
		}

			return filtered;// return filtered list
		    //bestMatches++;
		} 


	public double weightOf(String term, int bestmatch, double weightOf) {
		return weightOf;

	}

	public String bestMatch(String prefix) {
		

		return matches(prefix, 1).iterator().next();//call the other method
	}

	@Override
	public double weightOf(String term) {
		// TODO Auto-generated method stub
		return 0;

	}

}
