package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import edu.princeton.cs.introcs.Stopwatch;

public class FastAutoComplete implements Comparable {

	public static boolean contains(int[] a, double weightOf) {
		return false;

	}

	public Object prefix;
	private int bestMatches;
	private Object weightOf;
	private static List<Term> term;

	@SuppressWarnings("unchecked")
	public static Iterable<String> matches(String prefix, int k)
	{
		int index = Collections.binarySearch(term, new Term(0, prefix), new TermComparator());

		// if index negative
		index = - index - 1;// return exact number of the prefix string		

		List<Term> filtered = new ArrayList<Term>();

		while (term.get(index).getWord().startsWith(prefix)){
			filtered.add(term.get(index));

		}
		//return result based on top-k
		Collections.sort(filtered);
		List<String> result = new ArrayList<String>();// initialize new array containing result
		for (Term t: filtered){
			result.add(t.getWord());

		}
		if  (result.size() > k  && k>=0){
			return result.subList(0, k);// return top list 
		}else {
		
			return result;// return empty array if prefix not in term
		}
	}

		public String bestMatch(String prefix) {

			return matches(prefix, 1).iterator().next();//call the other method
		}

		public  double weightOf(String str) {
			// return Word and it weight
			int index = Collections.binarySearch(term, new Term(0, str), new TermComparator());
			//fast way to return a term weight 

				if (index >= 0){// if weight >= 0 iterate through to all term and return term and weight 
					return term.get(index).getWeightOf();
				}else{//if weight <= 0 do same process
					return 0;
				}
		}
		
		@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	// the predicted running time for fast AutoComplete  is 0.036855235 (logarithmic)

}
