package algorithms;


import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class BruteAutoComplete implements AutoComplete{

	//public double weight = 0;
	private TermList term;
	//private int bestMatches;
	public Object prefix;
	private int bestMatches;


	public double weightOf(String term, int bestmatch, double weightOf) 
	{
		 for (int i = 0; i < weightOf; i++)
		    {
		        for (int j = 0; j<term; j++)
		        {
		            weightOf = weightOf + term(j, i);
		        }

		        if (term > 0) // If we found at least a term, save row index and exit loop
		        {
		            weightOf = i;
		            weightOf = 0;   // Reset
		            break;
		        }   
		    }

		    for (double i = weightOf - 1; i > 0 ; i--)
		    {
		        for (int j = 0; j < weightOf; j++)
		        {
		            weightOf = weightOf + term(j, i);
		        }

		        if (weightOf > 0) // If we found at least a pixel, save row index and exit loop
		        {
		            prefix = i;
		            break;
		        }   
		    }

		    
		    return bestMatches - bestmatch + 1;
		}
		
		
	

	private double term(int j, double i) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public String bestMatch(String prefix) 
	{
		
		return null;
	}

	@Override
	public Iterable<String> matches(String prefix, int k) 
	{
		
		return null;
	}


	
	
	
	//
	//
	//
//		}
	//
//		static Object weightOf(Scanner user_input) {
//			// TODO Auto-generated method stub
//			return null;
//		}
	//
//		// Returns best Match method
//		public Scanner bestMatch(Scanner user_input){
//			return user_input;
	//
//		}
	//
	//
//		public static Iterable bestMatches(String prefix, int k) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		public static Object weight(String term) {
//			// TODO Auto-generated method stub
//			return null;
//		}
	//
//		public void prefix(Scanner user_input) {
//			// TODO Auto-generated method stub
	//
//		}
	//
//		public void prefix() {
//			// TODO Auto-generated method stub
	//
//		}



}