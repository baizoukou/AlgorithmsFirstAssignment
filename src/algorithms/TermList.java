package algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.junit.rules.ExpectedException;

public class TermList implements List<Term>
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

	@Override
	public boolean add(Term e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, Term element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends Term> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Term> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Term get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Term> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Term> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Term> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Term remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Term set(int index, Term element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Term> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}









