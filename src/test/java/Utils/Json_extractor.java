package Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Json_extractor 
{
	public static Iterator Nested_json(String path) throws JsonParseException, JsonMappingException, IOException, ParseException 
	{		
		JSONParser js = new JSONParser();
		Object a1 = js.parse(new java.io.FileReader(path));
		JSONObject job = (JSONObject) a1;
		JSONArray s1 = (JSONArray) job.get("testData");
		Iterator s2 = s1.iterator();
		return s2;
	}
	
	public static JSONObject Single_json(String path) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser js = new JSONParser();
		Object a1 = js.parse(new java.io.FileReader(path));
		JSONObject job = (JSONObject) a1;
		return job;
	}
}
