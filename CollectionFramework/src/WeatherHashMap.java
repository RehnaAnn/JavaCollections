import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Author: Rehna Anthru
 * Sub: HashMaps class assignment
 * Date: 3/18/2022
Create a HashMap to store weather information. Key will be a String, value will be Float Put a few elements into it, for example:

wind : 55, minTemperature : 20.5, maxTemperature : 50.8, humidity : 50.0, airPressure : 12

Implement 2 or 3 ways to iterate over a HashMap: (DO NOT USe the Stream API) Different ways to iterate over a HashMap

Modify the wind value remove airPressure

clear the HashMap
 */

public class WeatherHashMap {

	public static void main(String[] args) {

		//HashMap created for weatherInfo
		HashMap<String, Float> weatherInfo = new HashMap<String, Float>();

		weatherInfo.put("wind", 55f);
		weatherInfo.put("minTemperature", 20.5f);
		weatherInfo.put("maxTemperature", 50.8f);
		weatherInfo.put("humidity", 50.0f);
		weatherInfo.put("airPressure", 12f);

		//iterate over a HashMap using a for loop
		for (String i : weatherInfo.keySet()) {
			System.out.println("key: " + i + " value: " + weatherInfo.get(i));
		}

		//Iterating through a HashMap using Lambda Expressions
		weatherInfo.forEach(
				(key, value)
				-> System.out.println(key + " = " + value));

		//Using an iterator to iterate through a HashMap
		Iterator<Entry<String, Float>> new_Iterator
		= weatherInfo.entrySet().iterator();

		// Iterating every set of entry in the HashMap using Iterator method
		while (new_Iterator.hasNext()) {
			Map.Entry<String, Float> new_Map
			= (Map.Entry<String, Float>)
			new_Iterator.next();

			// Displaying HashMap
			System.out.println(new_Map.getKey() + " = "
					+ new_Map.getValue());
		}
		//Modify the wind value
		weatherInfo.replace("wind", 44f);
		System.out.println(weatherInfo);

		//System.out.println(weatherInfo.replace("wind", 44f));

		//remove airPressure
		weatherInfo.remove("airPressure");
		System.out.println(weatherInfo);

		//clearing the HashMap
		weatherInfo.clear();
		System.out.println(weatherInfo);
	}

}
