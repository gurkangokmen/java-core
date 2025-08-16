import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
	    // Create pattern
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
	    
		// The matcher() method is used to search for the pattern in a string. It returns a Matcher object which contains information about the search that was performed.
	    Matcher matcher = pattern.matcher("Visit W3Schools!");
	    
	    // The find() method returns true if the pattern was found in the string and false if it was not found.
	    boolean matchFound = matcher.find();
	    
	    // Output: Match found	  
	    if(matchFound) {
	      System.out.println("Match found");
	    } 
	    
	    else {
	      System.out.println("Match not found");
	    }
	    

	  }
}
