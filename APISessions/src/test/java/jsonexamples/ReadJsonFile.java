package jsonexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadJsonFile {
	@Test
	public void testCase() {
		 //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        try 
        {
        	//file location
        	FileReader reader = new FileReader(".\\src\\test\\resources\\JsonFiles\\employees.json");
            //Read JSON file
            Object obj = jsonParser.parse(reader); 
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);             
            //Iterate over employee array
            //employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
            	//or
            for(int i=0;i<employeeList.size();i++) {
            	Object emp=employeeList.get(i);
            	//convert Object to JSONObject
            	parseEmployeeObject((JSONObject)emp);
            }
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee) 
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");    
        System.out.println(firstName);         
        //Get employee last name
        String lastName = (String) employeeObject.get("lastName");  
        System.out.println(lastName);         
        //Get employee website name
        String website = (String) employeeObject.get("website");    
        System.out.println(website);
    }
}
