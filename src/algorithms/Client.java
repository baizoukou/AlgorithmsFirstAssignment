package algorithms;
import java.util.Scanner;

import edu.princeton.cs.introcs.Stopwatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



/**
 * @author Alexandre
 * @param <array>
 * 
 */
//public class Main <array> implements AutoCompleteInterface {
public class Client {
	private static BufferedReader StdIn;
	//private static PrintStream StdOut;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ie.baizoukou.bs2.assess1.AutoComplete#getSubstringList(java.lang.
	 * String)
	 */
	public static void main(String[]args) throws FileNotFoundException
	
	
	{
		
		TermList list = new TermList("./data/userdata.txt");
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a prefix");
		String input1 = user_input.nextLine();
		
		BruteAutoComplete b = new BruteAutoComplete(list.getTerm());
		
		System.out.println("Enter a Number");
		try {// when decimal enter try and catch and send exception to user
		int input2 = user_input.nextInt();
		Stopwatch stopwatch=new Stopwatch();
		System.out.println("Best Prefix Matches & Top k based on User input are:"  + b.matches(input1 , input2 ) );		
		double   time = stopwatch.elapsedTime();
		System.out.println("elapsed time" + time);
		
		} catch (InputMismatchException e) {
			
			System.err.println("Wrong input");
		}
		//checking the running time
		
			
			
			
		}
		
	


}

