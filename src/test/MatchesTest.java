package test;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.TermList;





public class MatchesTest<Matches> {

	public String prefix;

	@Test
	public void test(){
		
			double weightOf = TermList.Matches(5);
			assertEquals(weightOf, prefix );
			
			double weightOf1 = TermList.Matches(0.0001);
			assertEquals(weightOf1, prefix );
			
			double weightOf2 = TermList.Matches(20);
			assertEquals(weightOf2, prefix );
			
			
	
	    }
	}