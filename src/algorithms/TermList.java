package algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.junit.rules.ExpectedException;

public class TermList
{
	//private static final String userTokens = null;


	private String url = "./data/userdata.txt";

	// Term constructor and Setters and Getters
	public TermList (String urlString) throws FileNotFoundException
	{

		ArrayList<Term>term = new ArrayList<Term>();
		BufferedReader in = null;
		File usersFile = new File(url);
		Scanner inUsers = new Scanner(usersFile);
		String delims = "\t";//each field in the file is separated(delimited) by a space. //Get rid of the tab space
		inUsers.nextLine();//get rid of the spaces 
		while (inUsers.hasNextLine()) {
			// get user and rating from data source
			String userDetails = inUsers.nextLine().trim();// trim get rid of the 
			// parse user details string
			String[] userTokens = userDetails.split(delims);

			// output user data to console.
			if (userTokens.length == 2) {
				term.add(new Term(Double.parseDouble(userTokens[0]), userTokens[1]));
				//System.out.println(" " + userTokens[0] + ": " + userTokens[1]);

			}else
			{
				inUsers.close();
				//throw new Exception("Invalid member length: "+userTokens.length);
			}
		}
		inUsers.close();
		Collections.shuffle(term);
		System.out.println(term.toString());

	}

	//return BruteAutoComplete;

}


//
//public String getWord() {
//		return word;
//	}
//
//
//	public void setWord(String word) {
//		this.word = word;
//	}
//
//
//	public String getWeightof() {
//		return weightOf;
//	}
//
//
//	public void setWeightOf(String weight) {
//		this.weightOf = weightOf;
//	}
//
//
//	public static String getUsertokens() {
//		return userTokens;
//	}











