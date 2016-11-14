package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import edu.princeton.cs.introcs.Stopwatch;



public class BruteAutoComplete<In, weightOf, prefix, weighOf> implements AutoComplete {

	
	private List<Term> term;
	private int bestMatches;

	public BruteAutoComplete(List<Term> list) {
		// TODO Auto-generated constructor stub
		this.term = list;
	}

	public Iterable<String> matches(String prefix, int k)
	{
		
		List <Term> filtered = new ArrayList<Term>(); //filtered prefix from word enter and get the word from term class
		//int matches=0;
		 // Returns the highest weighted matching term, or null if no matching term.
		for (Term t: term  )
		{
			if (((Term) t).getWord().startsWith(prefix) ){// initialize counter to 0
				filtered.add( t);
				//bestMatches ++;
			}
			
 
		//return null;// return null if wrong input enter 
			
		}
		//return word with it weight
		// for this piece of code I got help from the Math center
            Collections.sort(filtered);
            List<String> result = new ArrayList <String>();// store filtered data in result
            String weightOf_and_word = "";
            String this_word = "";
			for (Term t: filtered){
				
				this_word = t.getWord();
				
				weightOf_and_word = this.weightOf(this_word) + "_"+this_word; 
				result.add(weightOf_and_word);//sort by  weightOf and word
				// then returns the weight of the term, or 0.0 if no such term.
			}
			if (result.size() > k  && k>=0 ){//check if number is greater than 0 and if its greater or equal 0
				return result.subList(0, k);// return top list 
			}else{
				return result;// return empty array if prefix not in term
			}
			
		    
		} 
 		   
	public String bestMatch(String prefix) {
		
		return matches(prefix, 1).iterator().next();//when there is a match it iterate through 
	}

	@Override
	public  double weightOf(String prefix) {
		// return Word and it weight
		for (Term t : term){
			if (t.getWord().equals(prefix)){
				return t.getWeightOf();
			}
			
		}
			return 0.0;
	}
	
	@Override
	public Iterable<String> matches(String prefix, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	// The predicted running time for Brute AutoComple is 0.0238(linear) 

}
