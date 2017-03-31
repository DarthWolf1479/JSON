package json;

import org.json.simple.JSONObject;
 

public class JAVA_to_JSON {
 
	@SuppressWarnings("uncheked")
    public static void main(String[] args) {
    	
    	Persona pers = new Persona();
    	pers.llenar("Nikola","Tesla",25,8467273);
    	
        JSONObject persona = new JSONObject();
        
        
        persona.put("Nombre", pers.nombre);
        persona.put("Apellidos",pers.apellidos);
        persona.put("Edad",pers.edad);
        persona.put("Carnet",pers.carnet);
        System.out.print(persona);

    }
}
