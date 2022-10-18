package MovieWall;

import java.util.ArrayList;

public class BinarySearch {
	
	//adapted from lab 3, searches for the actor's name
	public static int ActorSearch(ArrayList<String> actorName, String target) {
		return Searcher(actorName, target, 0, actorName.size()-1);
	}
	
    public static int Searcher(ArrayList<String> actorName, String target, int min, int max) {
    	int mid = (max + min)/2; //using mid to make this binary search
    	if(min > max ) {
    		return -(mid+1); //possible for input error in the min and max so we just take the negative value of a negative to make it positive so it still runs
    	}
    	if(actorName.get(mid).compareTo(target) == 0) {
    		return mid;
    	}
    	else if(actorName.get(mid).compareTo(target) < 0) {
    		return Searcher(actorName, target, mid+1, max); 
    		//This cuts the list in half and mid replaces left, recurse the function
    	}
    	else { //basically if our mid value is greater than the target
    		return Searcher(actorName, target, min, mid-1);
    		
    		//create a separate function if actor name is not found but there are similar spellings
    	}
    }
    
    //movie version from the actor list, same functionality but different names for organization
    public static int MovieSearch(ArrayList<String> movieTitle, String actorname) {
    	return movieSearcher(movieTitle, actorname, 0, movieTitle.size()-1);
    }
    
    public static int movieSearcher(ArrayList<String> movieTitle, String actorname, int min, int max) {
    	int mid = (max + min)/2; //using mid to make this binary search
    	if(min > max ) {
    		return -(mid+1); //possible for input error in the min and max so we just take the negative value of a negative to make it positive so it still runs
    	}
    	if(movieTitle.get(mid).compareTo(actorname) == 0) {
    		return mid;
    	}
    	else if(movieTitle.get(mid).compareTo(actorname) < 0) {
    		return Searcher(movieTitle, actorname, mid+1, max); 
    		//This cuts the list in half and mid replaces left, recurse the function
    	}
    	else { //basically if our mid value is greater than the target
    		return Searcher(movieTitle, actorname, min, mid-1);
    	} 
    }
    
	
	//rough draft idea on printing the movies
	public void printmovies(String[] movies) {
		//print the associated movies from the found list with the roles 
		System.out.println("Actor: " + Actor); //prints the actor 
		for(i = 0; i<matches.length; i++) { //prints all the movies
			System.out.println(matches[i] + " as " + role[i]);
		}
	}
}
