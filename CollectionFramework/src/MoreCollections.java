import java.util.ArrayList;
import java.util.HashSet;

public class MoreCollections {
	
	public static void main(String[] args) {
		
		ArrayList<String> tvShows = new ArrayList<String>();
		
		tvShows.add("show1");
		tvShows.add("show2");
		tvShows.add("show3");
		tvShows.add("show4");
		System.out.println(tvShows);
		
		
		HashSet<String>uniqueTvSHows=new HashSet<String> (tvShows);
		System.out.println(uniqueTvSHows);
		
	}

}
