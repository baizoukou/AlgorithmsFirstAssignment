package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BruteAutoComplete<In, weightOf, prefix, weighOf> implements AutoComplete {

	
	private List<Term> term;
	public Object prefix;
	private int bestMatches;

	public BruteAutoComplete(List<Term> list) {
		// TODO Auto-generated constructor stub
		this.term = list;
	}

	public Iterable<String> matches(String prefix, int k)
	{
		
		List <Term> filtered = new ArrayList<Term>(); //filtered prefix from word enter and get the word from term class
		//int matches=0;
		for (Term t: term  )
		{
			if (((Term) t).getWord().startsWith(prefix) ){// initialize counter to 0
				filtered.add( t);
				//bestMatches ++;
			}

			
		}
            Collections.sort(filtered);
            List<String> result = new ArrayList <String>();
			for (Term t: filtered){
				result.add(t.getWord());//sort by word and weightOf
			}
            return result.subList(0, k);// return top list 
			
		    
		} 

 		   
	public String bestMatch(String prefix) {
		

		return matches(prefix, 1).iterator().next();//call the other method
	}

	@Override
	public  double weightOf(String term) {
	
		for (Term t :  term){
			if (t.getWord().equals(term)){
				return t.getWeightOf();
			}
			
				return 0;
		}
			
	}

	@Override
	public Iterable<String> matches(String prefix, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
