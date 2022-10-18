package MovieWall;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import com.opencsv.CSVReader;


public class readingCSV {
	
	public static ArrayList<String> grabMovieCharacter(String line){
		ArrayList<String> movieCharacterList = new ArrayList<String>();
		//Parsing the JSON characters so we can start adding elements into out array list
		//this section I got help so may look similar to others codes
		String json = line.replaceAll("\"", ""); 
		json = json.replaceAll("\"", "");
		
		String movieCharacter = "character :";
		int count = json.indexOf(movieCharacter) + 11;
		
		while(count != -1) {
			String role = "";
			role = json.substring(count, json.length()-1);
			role = role.substring(0, role.indexOf(","));
			movieCharacterList.add(role);
			count = json.indexOf(role, count + 1);
		}
		return movieCharacterList;
	}
	
	public static ArrayList<String> grabActor(String line){
		ArrayList<String> actorNameList = new ArrayList<String>();
 
		//copied over from the grab movie characters section
		String json = line.replaceAll("\"", ""); 
		json = json.replaceAll("\"", "");
		
		String name = "name :";
		int count = json.indexOf(name) + 6;
		
		while(count != -1) {
			String actor = "";
			actor = json.substring(count, json.length()-1);
			actor = actor.substring(0, actor.indexOf(","));
			actorNameList.add(actor);
			count = json.indexOf(actor, count + 1);	
		}
		return actorNameList;
	}
	
	public void readCSV(String file, movieList movie) {
		try {		
			//using the CSV and file readers to read the CSV file
			CSVReader csvRead = new CSVReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			
			//We put each column into a line
			String [] line;
			
			//basically skips the line and reads the next
			line = csvRead.readNext();
			
			// [just for checking to see if the program works]
			int z = 0;
			
		while((line = csvRead.readNext()) != null && z != 5) {
			
			//Putting title, actor, and character into the Movie object class
			Movie m = new Movie();
			m.setMovieTitle(line[1]);
			m.setActor(grabActor(line[2]));
			m.setCharacter(grabMovieCharacter(line[2]));
			
			//adding the new movie to the list
			movie.addMovie(m);
			
			z++; //again, we want to get like a head() for how the print will work
		}
		
		csvRead.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
