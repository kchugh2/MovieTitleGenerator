package newPackage;

import java.net.URL;
import java.util.*;



public class MovieTitleGenerator {
	private String movTitle;
	
	public String getMovTitle(){
		return movTitle;
	}
	public void setMovTitle(String t){
		movTitle = t;
	}
	public MovieTitleGenerator() 
	{

		try{
			
		
		String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
		String[] nouns      = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");
		
		
		int ai   = 0 + (int)(Math.random()* adjectives.length       ); // adjectives
		int ni   = 0 + (int)(Math.random()* nouns.length     ); // nouns
		
		
		System.out.println("Myxyllplyk's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

		String adjective = adjectives[ai];
		String noun = nouns[ni];

		//System.out.println( "Your movie title is: " + adjective + " " + noun );
		
		String newmovietitle = (adjective +" " + noun);
		
		setMovTitle(newmovietitle); 
		} catch(Exception e){System.out.println("File read URL exception");}
	}

	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
	*/	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for ( int i=0; i<words.length; i++ )
		{
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}

}
