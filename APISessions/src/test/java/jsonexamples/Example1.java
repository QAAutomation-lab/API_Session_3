package jsonexamples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void createJsonObject() {
		
		JSONObject obj=new JSONObject();
		obj.put("Name", "Shailesh");
		obj.put("Job", "IT");
		obj.put("Mobile", 987654256);
		System.out.println(obj);		
		System.out.println("Mobile value: "+obj.get("Mobile"));
		System.out.println("*******************************************");
		 //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "howtodoinjava.com");        
       System.out.println("Employee Details: \n\t"+employeeDetails);
        
       //inserting existing JSONObject as value into another JSONObject
        JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee-1", employeeDetails);
        employeeObject.put("employee-2", obj);
        System.out.println("Employee Object: \n\t"+employeeObject);
	}
}
/*
in JSONObject class toString() is overrided
*/