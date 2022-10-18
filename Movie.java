package MovieWall;

import java.util.ArrayList;

public class Movie {

	protected ArrayList<String> Actor;
	protected String MovieTitle;
	protected ArrayList<String> Character;
	
	public Movie() {
		
	}

	public void setActor(ArrayList<String> theActor) {
		Actor = theActor;
	}
	
	public void setMovieTitle(String theNewMovieTitle) {
		MovieTitle = theNewMovieTitle;
	}
	
	public void setCharacter(ArrayList<String> theNewCharacter) {
		Character = theNewCharacter;
	}	
	
}
