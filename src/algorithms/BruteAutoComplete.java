package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
            Collections.sort(filtered);
            List<String> result = new ArrayList <String>();
            String weightOf_and_word = "";
            String this_word = "";
			for (Term t: filtered){
				
				this_word = t.getWord();
				
				weightOf_and_word = this.weightOf(this_word) + "_"+this_word; 
				result.add(weightOf_and_word);//sort by  weightOf and word
				// then returns the weight of the term, or 0.0 if no such term.
			}
            return result.subList(0, k);// return top list 
			
		    
		} 

 		   
	public String bestMatch(String prefix) {
		

		return matches(prefix, 1).iterator().next();//call the other method
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

}
