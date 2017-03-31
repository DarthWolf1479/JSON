package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_to_Java {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		
		try {
			//String json="{\"nombre\":\"nikola\",\"apellidos\":\"tesla\",\"edad\":25,\"carnet\":8467273\"}";
			//Object obj = parser.parse(json);
			
			Object obj = parser.parse(new FileReader("D:Person.json"));
			
			JSONObject jsonObject = (JSONObject) obj;
		 
			String name = (String) jsonObject.get("Nombre");
			System.out.println("Nombre: "+name);
		
			String last = (String) jsonObject.get("Apellidos");
			System.out.println("Apellidos: "+last);
		
			long age = (Long) jsonObject.get("Edad");
			System.out.println("Edad: "+age);
		
			long carnet = (Long) jsonObject.get("Carnet");
			System.out.println("Carnet: "+carnet);
			
		}catch (FileNotFoundException e) {
			   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  } catch (ParseException e) {
		   e.printStackTrace();
		  }
	}
}
