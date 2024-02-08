package jsonexamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadJsonFile2 {

	@Test
	public void testCase1() throws FileNotFoundException, IOException, ParseException {
		// file name is File.json
//		FileReader fr=new FileReader(".\\src\\test\\resources\\JsonFiles\\User.json");
//		JSONParser jp=new JSONParser();
//		Object obj=jp.parse(fr);
				//or
        Object obj = new JSONParser().parse(new FileReader(".\\src\\test\\resources\\JsonFiles\\User.json"));

        JSONObject jsonObj = (JSONObject) obj;
        String Name = (String) jsonObj.get("Name");
        String College = (String ) jsonObj.get("College");
        System.out.println("Name : "+ Name);
        System.out.println("College :" +College);
  
	}
}
