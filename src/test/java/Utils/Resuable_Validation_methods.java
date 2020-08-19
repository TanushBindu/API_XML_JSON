package Utils;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * Resuable_Validation_methods class contains All Reuseable validation methods
 * 
 * */
public class Resuable_Validation_methods 
{
	/*
	 * validate_status_code is used to check wheather the excpected status code is matching
	 * with the actual status line and it will return true and false
	 * This method will take two Interger parameter
	 * */
	public static boolean validate_status_code(int expected_code,int actual_code){
		if (expected_code==actual_code) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * validate_status_line is used to check wheather the excpected status line is matching
	 * with the actual status lineand it will return true and false
	 * This method will take two String parameter
	 * */
	public static boolean validate_status_line(String expected_line,String actual_line){
		if (expected_line.equals(actual_line)) {
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * validate_status_line is used to check wheather the excpected status line is matching
	 * with the actual status lineand it will return true and false
	 * This method will take two String parameter
	 * */
	public static void validate_status_time(int expected_time,long l){
		boolean op;
		if (l<=expected_time){
			op =  true;
		}
		op =  false;
		assertTrue(op);
	}
	
	/*
	 * Check_the_content_type is used to validate the content type
	 * with the expected content type and actual content type
	 * */
	public static boolean Check_the_content_type(Response res,String content_type)
	{
		if (res.contentType().equals(content_type)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean invalidate_status_code(int expected_code,int actual_code){
		if (expected_code!=actual_code) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean verifyResponseValue(String responseKey, String value, Response res) throws Throwable {
		JsonPath responseObject = new JsonPath(res.asString());
		String key =(String) responseObject.get(responseKey);
		return compareResponseValues(value,key, responseKey);
	}
	
	private static boolean compareResponseValues(String expected, String actual, String responseKey) {
		if (expected.equals(actual)) {
			Assert.assertEquals(actual, expected);
			return true;
		} else {
			Assert.assertEquals(actual, expected);
			return false;
		}
	}
}
