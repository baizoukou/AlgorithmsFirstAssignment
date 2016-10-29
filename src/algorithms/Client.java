package algorithms;
import java.util.Scanner;
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
		//int k;
		BruteAutoComplete b = new BruteAutoComplete(list.getTerm());
		
		//System.out.println(b.bestMatch(input));//print best match
		
		//System.out.println(b.weightOf(input));//print weight of
	
		
		System.out.println("Enter a Number");
		int input2 = user_input.nextInt();
		
		System.out.println("Best Prefix Match  is:" + b.matches(input1 , input2 ));		
		
		}
	


}

