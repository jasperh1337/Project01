package MovieWall;

public abstract class Actor {

	protected String name;
	protected String movieDetailsTitle;
	protected String movieDetailsCharacter;
	
	public Actor(String theName, String theTitle, String theCharacter) {
		name = theName;
		movieDetailsTitle = theTitle;
		movieDetailsCharacter = theCharacter;
	}
	
	public void setName(String theName) {
		name = theName;
	}
	
	public void setMovieDetails(String movieTitle, String movieCharacter) {
		
	}
}
