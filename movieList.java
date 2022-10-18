package MovieWall;

public class movieList {

	Movie[] movie;
	protected int currentIndex = 0;
	
	public void addMovie(Movie m) {
		movie[currentIndex] = m;
		currentIndex++;
	}
	
}
