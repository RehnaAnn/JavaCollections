import java.util.HashMap;

public class Maps {
	
	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("USA", "Washington");
	    
	    System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.get("England"));
		
	}

}
