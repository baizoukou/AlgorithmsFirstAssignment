package algorithms;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
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
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter word");
		String input = user_input.nextLine();
		//int k;
		BruteAutoComplete b = new BruteAutoComplete();
		
		System.out.println(b.weightOf(input));
		b.bestMatch(input);
		//b.bestMatch(user_input);
	}
	//System.out.println("Word is :"+" " +"prefix"+ " " + "weight" + "bestmatch"+ " " + "bestMatches");



}

